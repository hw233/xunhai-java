// ----------------------------------------------------------------------------------
//
// FXMaker
// Created by ismoon - 2012 - ismoonto@gmail.com
//
// ----------------------------------------------------------------------------------


using UnityEngine;

using System.Collections;

public class NcDuplicator : NcEffectBehaviour
{
    // Attribute ------------------------------------------------------------------------
    public float m_fDuplicateTime = 0.1f;
    public int m_nDuplicateCount = 3;
    public float m_fDuplicateLifeTime = 0;
    public Vector3 m_AddStartPos = Vector3.zero;
    public Vector3 m_AccumStartRot = Vector3.zero;
    public Vector3 m_RandomRange = Vector3.zero;

    protected int m_nCreateCount = 0;
    protected float m_fStartTime = 0;
    protected GameObject m_ClonObject;
    protected bool m_bInvoke = false;

    // Property -------------------------------------------------------------------------
#if UNITY_EDITOR
    public override string CheckProperty()
    {
        if (1 < gameObject.GetComponents(GetType()).Length)
            return "SCRIPT_WARRING_DUPLICATE";

        // err check
        if (transform.parent != null && transform.parent.gameObject == FindRootEditorEffect())
            return "SCRIPT_ERROR_ROOT";
        return "";	// no error
    }
#endif

    public override int GetAnimationState()
    {
        if ((enabled && IsActive(gameObject)) && (m_nDuplicateCount == 0 || m_nDuplicateCount != 0 && m_nCreateCount < m_nDuplicateCount))
            return 1;
        return 0;
    }

    public GameObject GetCloneObject()
    {
        return m_ClonObject;
    }

    // Loop Function --------------------------------------------------------------------
    void Awake()
    {

    }

    protected void Init()
    {
        // 如果是源
        if (_isOrigin)
        {
            GameObject go = CreateGameObject(transform.parent.gameObject, gameObject);
            go.name = gameObject.name;
            //   StarEngine.Debuger.LogTrace(name + " alpha:" + renderer.material.color.a);
            //FxTools.setTrueShaderToGameObject(go);
            if (_eod != null) _eod.cloneObjectList.Add(go);
            NcDuplicator nd = go.GetComponent<NcDuplicator>();
            nd._isOrigin = false;
            nd.effectObjectDescriptor = effectObjectDescriptor;
            gameObject.SetActive(false);
            return;
        }

        m_nCreateCount = 0;
        m_fStartTime = -m_fDuplicateTime;
        m_ClonObject = null;
        m_bInvoke = false;

        if (enabled == false)
            return;

        // 		Log.info("Duration.Awake");
#if UNITY_EDITOR
        if (IsCreatingEditObject() == false)
#endif
            if (transform.parent != null && (enabled && IsActive(gameObject) && GetComponent<NcDontActive>() == null))
            {
                InitCloneObject();
            }
    }
    protected override void OnDestroy()
    {
        // 		Log.info("OnDestroy");
        if (m_ClonObject != null)
            Destroy(m_ClonObject);
        base.OnDestroy();
    }

    void Start()
    {
        _isStart = true;
        // 如果是源
        ReStart();
    }

    void Update()
    {
        if (_isOrigin)
        {
            return;
        }
        // 		Log.info("Duration.Update");
        if (m_bInvoke)
            return;
        // Duration
        if (m_nDuplicateCount == 0 || m_nCreateCount < m_nDuplicateCount)
        {
            if (m_fStartTime + m_fDuplicateTime <= GetEngineTime())
            {
                m_fStartTime = GetEngineTime();
                CreateCloneObject();
            }
        }
    }
    // Control Function -----------------------------------------------------------------
    void InitCloneObject()
    {
        // 		Log.info("Duration.InitCloneObject");


        if (m_ClonObject == null)
        {
            // clone ----------------
            RenderHelper.RefreshShader(gameObject);
            //       BattleManager.setTrueShaderToGameObject(gameObject, ShaderCollection.shadersLink);
            m_ClonObject = (GameObject)CreateGameObject(gameObject);
            m_ClonObject.name = gameObject.name;
            //       BattleManager.setTrueShaderToGameObject(m_ClonObject);
            //        FxTools.setTrueShaderToGameObject(m_ClonObject);
            RenderHelper.RefreshShader(m_ClonObject);
            // Cancel ActiveControl
            HideNcDelayActive(m_ClonObject);

            // Remove Dup
            NcDuplicator durCom = m_ClonObject.GetComponent<NcDuplicator>();
            if (durCom != null)
                //				DestroyImmediate(durCom);
                Destroy(durCom);

            // Remove NcDelayActive
            NcDelayActive delCom = m_ClonObject.GetComponent<NcDelayActive>();
            if (delCom != null)
                //				DestroyImmediate(delCom);
                Destroy(delCom);

            // this ----------------
            // remove OtherComponent
            Component[] coms = transform.GetComponents<Component>();
            for (int n = 0; n < coms.Length; n++)
                if ((coms[n] is Transform) == false && (coms[n] is NcDuplicator) == false)
                    Destroy(coms[n]);

            // removeChild
#if (UNITY_4_0 || UNITY_4_1 || UNITY_4_2 || UNITY_4_3 || UNITY_4_4 || UNITY_4_5 || UNITY_4_6 || UNITY_4_7 || UNITY_4_8 || UNITY_4_9)
            RemoveAllChildObject(gameObject, false);
#else
            //			RemoveAllChildObject(gameObject, true);		OnTrigger error - DestroyImmediate
            RemoveAllChildObject(gameObject, false);
#endif
        }
        else return;
    }

    void CreateCloneObject()
    {
        if (m_ClonObject == null)
            return;

        GameObject createObj;
        if (transform.parent == null)
            createObj = (GameObject)CreateGameObject(gameObject);
        else createObj = (GameObject)CreateGameObject(transform.parent.gameObject, m_ClonObject);
#if UNITY_EDITOR
        RenderHelper.RefreshShader(createObj);
        //    BattleManager.setTrueShaderToGameObject(createObj, ShaderCollection.shadersLink);
#endif
#if (UNITY_4_0 || UNITY_4_1 || UNITY_4_2 || UNITY_4_3 || UNITY_4_4 || UNITY_4_5 || UNITY_4_6 || UNITY_4_7 || UNITY_4_8 || UNITY_4_9)
        SetActiveRecursively(createObj, true);
#endif
        if (_eod != null) _eod.cloneObjectList.Add(createObj);
        // m_fDuplicateLifeTime
        if (0 < m_fDuplicateLifeTime)
        {
            NcAutoDestruct ncAd = createObj.GetComponent<NcAutoDestruct>();
            if (ncAd == null)
                ncAd = createObj.AddComponent<NcAutoDestruct>();
            ncAd.m_fLifeTime = m_fDuplicateLifeTime;
        }

        NcEffectBehaviour[] behaviourList = createObj.GetComponentsInChildren<NcEffectBehaviour>();
        for (int i = 0; i < behaviourList.Length; i++)
        {
            behaviourList[i].isReuse = false;
        }

        // Random pos
        Vector3 newPos = createObj.transform.position;
        createObj.transform.position = new Vector3(Random.Range(-m_RandomRange.x, m_RandomRange.x) + newPos.x, Random.Range(-m_RandomRange.y, m_RandomRange.y) + newPos.y, Random.Range(-m_RandomRange.z, m_RandomRange.z) + newPos.z);

        // AddStartPos
        createObj.transform.position += m_AddStartPos;

        // m_AccumStartRot
        createObj.transform.localRotation *= Quaternion.Euler(m_AccumStartRot.x * m_nCreateCount, m_AccumStartRot.y * m_nCreateCount, m_AccumStartRot.z * m_nCreateCount);
        createObj.name = m_ClonObject.name + " " + m_nCreateCount;
        if (_eod != null)
        {
            _eod.addDynamicEffectObject(createObj);
        }

        m_nCreateCount++;
        if (m_bInvoke)
        {
            if (m_nDuplicateCount <= m_nCreateCount)
                CancelInvoke("CreateCloneObject");
        }
    }

    // Event Function -------------------------------------------------------------------
    public override void OnUpdateEffectSpeed(float fSpeedRate, bool bRuntime)
    {
        m_fDuplicateTime /= fSpeedRate;
        m_fDuplicateLifeTime /= fSpeedRate;

        if (bRuntime && m_ClonObject != null)
            AdjustSpeedRuntime(m_ClonObject, fSpeedRate);
    }




    protected bool _isOrigin = true;
    public bool isOrigin
    {
        get
        {
            return _isOrigin;
        }
        set
        {
            _isOrigin = value;
        }
    }

    protected bool _isStart = false;
    public void ReStart()
    {
        if (_isStart == true)
        {
            Init();
            //		Log.info("Duration.Start");
            if (m_bInvoke)
            {
                m_fStartTime = GetEngineTime();
                CreateCloneObject();
                InvokeRepeating("CreateCloneObject", m_fDuplicateTime, m_fDuplicateTime);
            }
        }
    }

    protected EffectObjectDescriptor _eod;
    public EffectObjectDescriptor effectObjectDescriptor
    {
        get
        {
            return _eod;
        }
        set
        {
            _eod = value;
        }
    }
}