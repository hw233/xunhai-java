#region 脚本说明
/*----------------------------------------------------------------
// 脚本作用：特效材质查看器,重复材质查看器,材质批量替换 2.0新增查找没有被预设使用的材质
// 创建者：黑仔
//----------------------------------------------------------------*/


#endregion
using UnityEngine;
using UnityEditor;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.IO;

public class EffectMatLookUp : EditorWindow 
{
	public Material MainMat;
	public Material TargetMat;

	private List<Material> matCounts = new List<Material>();
	private List<Material> notMatCounts = new List<Material>();
	private List<Material> allEffectMatCounts = new List<Material>();

	private Vector2 scrollPos = new Vector2();

	/// <summary>
	/// 材质搜索路径
	/// </summary>
	private static string souSuoPath = "Assets/Art/Effect";

	/// <summary>
	/// 特效搜索路径
	/// </summary>
	private string effectPath = "Assets/Resources/Effect";

	//-----------------------------------------------------

	[MenuItem("HZTools/特效材质查看器")]
	static void AddArtGongJu01()
	{
		GetWindow<EffectMatLookUp >("特效材质查看器");
	}

	void OnGUI()
	{
		souSuoPath = EditorGUILayout.TextField("材质搜索目录：", souSuoPath);
		effectPath = EditorGUILayout.TextField("特效搜索目录：", effectPath);

		MainMat = (Material)EditorGUILayout.ObjectField("保留材质：", MainMat, typeof(Material), false);
		TargetMat = (Material)EditorGUILayout.ObjectField("目标材质：", TargetMat, typeof(Material), false);
		if (GUILayout.Button("查找目标材质的使用情况和替换"))
		{
			LookupTargetMatUsed();
		}
		if (GUILayout.Button("检查相同主属性的材质"))
		{
			LookupIdenticalMat();
		}
		if (GUILayout.Button("查找特效材质"))
		{
			ChaZhaoMat();
		}
		if (GUILayout.Button("查找没有在特效预设上使用的材质"))
		{
			ChaZhaoNotMat();
		}

		scrollPos = EditorGUILayout.BeginScrollView(scrollPos);
		if (matCounts.Count > 0) 
		{
			foreach (var mat in matCounts) 
			{
				if (mat != null) 
				{
					GUILayout.BeginHorizontal();
					GUILayout.BeginVertical(GUILayout.Width(300), GUILayout.Height(64));
					var matLB = (Material)EditorGUILayout.ObjectField(mat, typeof(Material), false, GUILayout.Width(300));
					EditorGUILayout.LabelField(mat.shader.name);
					GUILayout.EndVertical();
					int count = ShaderUtil.GetPropertyCount(mat.shader);
					for (int i = 0; i < count; i++) 
					{
						var matShaderType = ShaderUtil.GetPropertyType(mat.shader, i);
						if (ShaderUtil.ShaderPropertyType.TexEnv == matShaderType) 
						{
							var assetMatShaderProName = ShaderUtil.GetPropertyName(mat.shader, i);
							var tex = mat.GetTexture(assetMatShaderProName);
							if (tex != null) 
							{
								tex = (Texture)EditorGUILayout.ObjectField(tex, typeof(Texture), false, GUILayout.Width(64), GUILayout.Height(64));
							}
						}
					}
					GUILayout.EndHorizontal();
					EditorGUILayout.Space();
				}
			}
		}
		EditorGUILayout.EndScrollView();
	}

	private void ChaZhaoMat()
	{
		matCounts.Clear();

		var allGuids = AssetDatabase.FindAssets("t:Material", new string[] {souSuoPath});
		if (allGuids.Length > 0) 
		{
			ShowProgress(0, 0, 0);
			int m_jishu = 0;
			foreach (var guid in allGuids) 
			{
				var assetPath = AssetDatabase.GUIDToAssetPath(guid);
				var asset = AssetDatabase.LoadMainAssetAtPath(assetPath);
				var assetMat = asset as Material;
				matCounts.Add(assetMat);
				ShowProgress((float)m_jishu / (float)matCounts.Count, matCounts.Count, m_jishu);
				m_jishu++;
			}
			//关闭进度条窗口
			EditorUtility.ClearProgressBar();
		}
	}

	private void ChaZhaoNotMat()
	{
		notMatCounts.Clear();
		ChaZhaoMat();
		ChaZhaoAllEffectMat();
		foreach (var mat in matCounts) 
		{
			if (mat) 
			{
				JianChaNotMat(mat);
			}
		}
		matCounts.Clear();
		foreach (var mat in notMatCounts) 
		{
			matCounts.Add(mat);
		}

	}

	private void ChaZhaoAllEffectMat()
	{
		allEffectMatCounts.Clear();
		var allGuids = AssetDatabase.FindAssets("t:GameObject", new string[] {effectPath});
		if (allGuids.Length > 0) 
		{
			ShowProgress(0, 0, 0);
			int m_jishu = 0;
			foreach (var guid in allGuids) 
			{
				var assetPath = AssetDatabase.GUIDToAssetPath(guid);
				var asset = AssetDatabase.LoadMainAssetAtPath(assetPath);
				var assetObj = asset as GameObject;
				var rends = assetObj.GetComponentsInChildren<Renderer>();
				if (rends.Length > 0) 
				{
					foreach (var rend in rends) 
					{
						var mats = rend.sharedMaterials;
						foreach (var mat in mats) 
						{
							allEffectMatCounts.Add(mat);
						}
					}
				}
				ShowProgress((float)m_jishu / (float)allGuids.Length, allGuids.Length, m_jishu);
				m_jishu++;
			}
			EditorUtility.ClearProgressBar();
		}
	}

	private void JianChaNotMat(Material into)
	{
		foreach (var mat in allEffectMatCounts) 
		{
			if (mat == into) 
			{
				return;
			}
		}
		notMatCounts.Add(into);
	}

	private void LookupTargetMatUsed()
	{
		ClearConsole();
		if (MainMat == null || TargetMat == null) 
		{
			Debug.LogWarning(">>>>>>>>>>>>>>>!主材质和目标材质不能为空！！！！<<<<<<<<<<<<<<<<<<<<<<<<<<");
			return;
		}
		var allGuids = AssetDatabase.FindAssets("t:GameObject", new string[] {effectPath});
		if (allGuids.Length > 0) 
		{
			int i = 0;
			ShowProgress(0, 0, 0);
			int m_jishu = 0;
			foreach (var guid in allGuids) 
			{
				var assetPath = AssetDatabase.GUIDToAssetPath(guid);
				var asset = AssetDatabase.LoadMainAssetAtPath(assetPath);
				var assetObj = asset as GameObject;
				var rends = assetObj.GetComponentsInChildren<Renderer>();
				if (rends.Length > 0) 
				{
					foreach (var rend in rends) 
					{
						var mats = rend.sharedMaterials;
						if (mats.Length > 0) 
						{
							for (int j = 0; j < mats.Length; j++) 
							{
								if (mats[j] == TargetMat) 
								{
									mats[j] = MainMat;
									i = i + 1;
								} 
							}
							rend.sharedMaterials = mats;
						}
					}
				}
				ShowProgress((float)m_jishu / (float)allGuids.Length, allGuids.Length, m_jishu);
				m_jishu++;
			}
			EditorUtility.ClearProgressBar();
			if (i == 0) 
			{
				Debug.LogWarning(">>>>>>>>>>>>>>>!目标材质没有被使用！<<<<<<<<<<<<<<<<<<<<<<<<<<");
			}
			if (i > 0) 
			{
				Debug.LogWarning("材质替换完成！！！");
			}
		}
	}

	/// <summary>
	/// 检查相同设置的材质
	/// </summary>
	private void LookupIdenticalMat()
	{
		matCounts.Clear();

		List<EffectMat> IdenMatCounts = new List<EffectMat>();
		IdenMatCounts.Clear();

		var allGuids = AssetDatabase.FindAssets("t:Material", new string[] {souSuoPath});
		if (allGuids.Length > 0) 
		{
			ShowProgress(0, 0, 0);
			int m_jishu = 0;
			foreach (var guid in allGuids) 
			{
				var assetPath = AssetDatabase.GUIDToAssetPath(guid);
				var asset = AssetDatabase.LoadMainAssetAtPath(assetPath);
				var assetMat = asset as Material;
				matCounts.Add(assetMat);
			}

			if (matCounts.Count > 0) 
			{
				foreach (var mat in matCounts) 
				{
					EffectMat eMat = new EffectMat();
					eMat.m_Mat = mat;
					eMat.m_Shader = mat.shader;
					eMat.m_MainTexture = mat.mainTexture;
					if (mat.HasProperty("_Color")) 
					{
						eMat.m_Color = mat.GetColor("_Color");
					}
					else if (mat.HasProperty("_MainTex_Color")) 
					{
						eMat.m_Color = mat.GetColor("_MainTex_Color");
					}
					else if (mat.HasProperty("_TintColor")) 
					{
						eMat.m_Color = mat.GetColor("_TintColor");
					}
					if (mat.HasProperty("_HunHeTex")) 
					{
						eMat.m_HunHeTex = mat.GetTexture("_HunHeTex");
					}
					if (mat.HasProperty("_HunHe_Color")) 
					{
						eMat.m_HunHeColor = mat.GetColor("_HunHe_Color");
					}
					if (mat.HasProperty("_Mask")) 
					{
						eMat.m_Mask = mat.GetTexture("_Mask");
					}
					if (mat.HasProperty("_Tex_WeiYi")) 
					{
						eMat.m_Tex_WeiYi = mat.GetFloat("_Tex_WeiYi");
					}
					else if (mat.HasProperty("_Tex_WeiYiZ")) 
					{
						eMat.m_Tex_WeiYi = mat.GetFloat("_Tex_WeiYiZ");
					}
					if (mat.HasProperty("_All_QuanZhong")) 
					{
						eMat.m_All_QuanZhong = mat.GetFloat("_All_QuanZhong");
					}
					if (mat.mainTexture != null) 
					{
						eMat.m_MainTexTiLing = mat.mainTextureScale;
					}
					IdenMatCounts.Add(eMat); 
				}

				matCounts.Clear();

				foreach (var item in IdenMatCounts) 
				{
					var DQeMat = item;
					for (int i = 0; i < IdenMatCounts.Count; i++) 
					{
						if (DQeMat == IdenMatCounts[i]) 
						{
							break;
						}
						if (IdenMatCounts[i].m_Shader == DQeMat.m_Shader && IdenMatCounts[i].m_Color == DQeMat.m_Color && IdenMatCounts[i].m_MainTexture == DQeMat.m_MainTexture 
							&& IdenMatCounts[i].m_HunHeTex == DQeMat.m_HunHeTex && IdenMatCounts[i].m_HunHeColor == DQeMat.m_HunHeColor && IdenMatCounts[i].m_Mask == DQeMat.m_Mask 
							&& IdenMatCounts[i].m_Tex_WeiYi == DQeMat.m_Tex_WeiYi && IdenMatCounts[i].m_All_QuanZhong == DQeMat.m_All_QuanZhong && IdenMatCounts[i].m_MainTexTiLing == DQeMat.m_MainTexTiLing) 
						{
							if (!matCounts.Contains(DQeMat.m_Mat)) 
							{
								matCounts.Add(DQeMat.m_Mat);
								if (!matCounts.Contains(IdenMatCounts[i].m_Mat)) 
								{
									matCounts.Add(IdenMatCounts[i].m_Mat);
								}
							}
						}
					}
					ShowProgress((float)m_jishu / (float)IdenMatCounts.Count * 2f, IdenMatCounts.Count * 2, m_jishu);
					m_jishu++;
				}
			}
			//关闭进度条窗口
			EditorUtility.ClearProgressBar();
		}
	}

	private class EffectMat
	{
		public Material m_Mat;
		public Shader m_Shader;
		public Color m_Color;
		public Texture m_MainTexture;
		public Texture m_HunHeTex;
		public Color m_HunHeColor;
		public Texture m_Mask;
		public float m_Tex_WeiYi;
		public float m_All_QuanZhong;
		public Vector2 m_MainTexTiLing;
	}

	/// <summary>
	/// 开启进度条窗口
	/// </summary>
	/// <param name="val">Value.</param>
	/// <param name="total">Total.</param>
	/// <param name="cur">Current.</param>
	public static void ShowProgress(float val, int total, int cur)
	{
		EditorUtility.DisplayProgressBar("查找中！", string.Format("查找 ({0}/{1}), 请稍等...", cur, total), val);
	}

	private void ClearConsole()
	{
		var logEntries = System.Type.GetType("UnityEditorInternal.LogEntries,UnityEditor.dll");
		var clearMethod = logEntries.GetMethod("Clear", System.Reflection.BindingFlags.Static | System.Reflection.BindingFlags.Public);
		clearMethod.Invoke(null, null);
	}

	void OnEnable()
	{
		GetPath();
	}

	void OnDestroy()
	{
		SaveCeShi();
	}

	private void SaveCeShi()
	{
		string path = "Assets/Art/Script/";
		using(StreamWriter sw = File.CreateText(path + "sousuopath.txt"))
		{
			sw.WriteLine(souSuoPath);
			sw.WriteLine(effectPath);
		}
	}

	private void GetPath()
	{
		var obj = AssetDatabase.LoadMainAssetAtPath("Assets/Art/Script/sousuopath.txt");

		if (obj != null) 
		{
			using(StreamReader sr = File.OpenText("Assets/Art/Script/sousuopath.txt"))
			{
				var s1 = sr.ReadLine();
				souSuoPath = s1;
				var s2 = sr.ReadLine();
				effectPath = s2;
				Repaint();
			}
		}
	}
}