Shader "Effects/Multiply (Double)" {
	Properties{
		[HDR]_TintColor("Tint Color", Color) = (0.5,0.5,0.5,0.5)
		_MainTex("Particle Texture", 2D) = "white" {}
		_InvFade("Soft Particles Factor", Float) = 1.0
	}

		Category{
			Tags { "Queue" = "Transparent" "IgnoreProjector" = "True" "RenderType" = "Transparent" }
			Blend DstColor SrcColor

			Cull Off Lighting Off ZWrite Off Fog { Mode Off}


			SubShader {
				Pass {

					CGPROGRAM
					#pragma vertex vert
					#pragma fragment frag
					#pragma multi_compile_particles

					#include "UnityCG.cginc"

					sampler2D _MainTex;
					fixed4 _TintColor;

					struct appdata_t {
						float4 vertex : POSITION;
						fixed4 color : COLOR;
						float2 texcoord : TEXCOORD0;
					};

					struct v2f {
						float4 vertex : POSITION;
						fixed4 color : COLOR;
						float2 texcoord : TEXCOORD0;
						#ifdef SOFTPARTICLES_ON
						float4 projPos : TEXCOORD1;
						#endif
					};

					float4 _MainTex_ST;

					v2f vert(appdata_t v)
					{
						v2f o;
						o.vertex = mul(UNITY_MATRIX_MVP, v.vertex);
						#ifdef SOFTPARTICLES_ON
						o.projPos = ComputeScreenPos(o.vertex);
						COMPUTE_EYEDEPTH(o.projPos.z);
						#endif
						o.color = v.color;
						o.texcoord = TRANSFORM_TEX(v.texcoord,_MainTex);
						return o;
					}

					sampler2D _CameraDepthTexture;
					float _InvFade;

					fixed4 frag(v2f i) : COLOR
					{
						#ifdef SOFTPARTICLES_ON
						float sceneZ = LinearEyeDepth(UNITY_SAMPLE_DEPTH(tex2Dproj(_CameraDepthTexture, UNITY_PROJ_COORD(i.projPos))));
						float partZ = i.projPos.z;
						float fade = saturate(_InvFade * (sceneZ - partZ));
						i.color.a *= fade;
						#endif

						fixed4 col;
						fixed4 tex = tex2D(_MainTex, i.texcoord)* _TintColor;
						col.rgb = tex.rgb * i.color.rgb * 2;
						col.a = i.color.a * tex.a;
						col = lerp(fixed4(0.5f,0.5f,0.5f,0.5f), col, col.a);
						col.a = saturate(col.a);
						return col;
					}
					ENDCG
				}
			}
		}
}
