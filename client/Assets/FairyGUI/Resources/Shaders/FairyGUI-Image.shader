Shader "FairyGUI/Image"
{
	Properties
	{
		_MainTex ("Base (RGB), Alpha (A)", 2D) = "black" {}

		_StencilComp ("Stencil Comparison", Float) = 8
		_Stencil ("Stencil ID", Float) = 0
		_StencilOp ("Stencil Operation", Float) = 0
		_StencilWriteMask ("Stencil Write Mask", Float) = 255
		_StencilReadMask ("Stencil Read Mask", Float) = 255

		_ColorMask ("Color Mask", Float) = 15

		_BlendSrcFactor ("Blend SrcFactor", Float) = 5
		_BlendDstFactor ("Blend DstFactor", Float) = 10
	}
	
	SubShader
	{
		LOD 100

		Tags
		{
			"Queue" = "Transparent"
			"IgnoreProjector" = "True"
			"RenderType" = "Transparent"
		}
		
		Stencil
		{
			Ref [_Stencil]
			Comp [_StencilComp]
			Pass [_StencilOp] 
			ReadMask [_StencilReadMask]
			WriteMask [_StencilWriteMask]
		}

		Cull Off
		Lighting Off
		ZWrite Off
		Fog { Mode Off }
		Blend [_BlendSrcFactor] [_BlendDstFactor], One One
		ColorMask [_ColorMask]

		Pass
		{
			CGPROGRAM
				#pragma multi_compile NOT_COMBINED COMBINED
				#pragma multi_compile NOT_GRAYED GRAYED COLOR_FILTER
				#pragma multi_compile NOT_CLIPPED CLIPPED SOFT_CLIPPED ALPHA_MASK
				#pragma vertex vert
				#pragma fragment frag
				
				#include "UnityCG.cginc"
	
				struct appdata_t
				{
					float4 vertex : POSITION;
					fixed4 color : COLOR;
					float2 texcoord : TEXCOORD0;
				};
	
				struct v2f
				{
					float4 vertex : SV_POSITION;
					fixed4 color : COLOR;
					float2 texcoord : TEXCOORD0;

					#ifdef CLIPPED
					half2 clipPos : TEXCOORD1;
					#endif

					#ifdef SOFT_CLIPPED
					half2 clipPos : TEXCOORD1;
					#endif
				};
	
				sampler2D _MainTex;
				
				#ifdef COMBINED
				sampler2D _AlphaTex;
				#endif

				#ifdef CLIPPED
				float4 _ClipBox = float4(-2, -2, 0, 0);
				#endif

				#ifdef SOFT_CLIPPED
				float4 _ClipBox = float4(-2, -2, 0, 0);
				half4 _ClipSoftness = half4(0, 0, 0, 0);
				#endif

				#ifdef COLOR_FILTER
				float4x4 _ColorMatrix;
				float4 _ColorOffset;
				#endif

				v2f vert (appdata_t v)
				{
					v2f o;
					o.vertex = mul(UNITY_MATRIX_MVP, v.vertex);
					o.texcoord = v.texcoord;
					o.color = v.color;

					#ifdef CLIPPED
					o.clipPos = mul(_Object2World, v.vertex).xy * _ClipBox.zw + _ClipBox.xy;
					#endif

					#ifdef SOFT_CLIPPED
					o.clipPos = mul(_Object2World, v.vertex).xy * _ClipBox.zw + _ClipBox.xy;
					#endif

					return o;
				}
				
				fixed4 frag (v2f i) : SV_Target
				{
					fixed4 col = tex2D(_MainTex, i.texcoord) * i.color;

					#ifdef COMBINED
					col.a *= tex2D(_AlphaTex, i.texcoord).g;
					#endif

					#ifdef GRAYED
					fixed grey = dot(col.rgb, fixed3(0.299, 0.587, 0.114));
					col.rgb = fixed3(grey, grey, grey);
					#endif

					#ifdef SOFT_CLIPPED
					half2 factor = half2(0,0);
					if(i.clipPos.x<0)
						factor.x = (1.0-abs(i.clipPos.x)) * _ClipSoftness.x;
					else
						factor.x = (1.0-i.clipPos.x) * _ClipSoftness.z;
					if(i.clipPos.y<0)
						factor.y = (1.0-abs(i.clipPos.y)) * _ClipSoftness.w;
					else
						factor.y = (1.0-i.clipPos.y) * _ClipSoftness.y;
					col.a *= clamp(min(factor.x, factor.y), 0.0, 1.0);
					#endif

					#ifdef CLIPPED
					half2 factor = abs(i.clipPos);
					col.a *= step(max(factor.x, factor.y), 1);
					#endif

					#ifdef COLOR_FILTER
					fixed4 col2 = col;
					col2.r = dot(col, _ColorMatrix[0])+_ColorOffset.x;
					col2.g = dot(col, _ColorMatrix[1])+_ColorOffset.y;
					col2.b = dot(col, _ColorMatrix[2])+_ColorOffset.z;
					col2.a = dot(col, _ColorMatrix[3])+_ColorOffset.w;
					col = col2;
					#endif

					#ifdef ALPHA_MASK
					clip(col.a - 0.001);
					#endif

					return col;
				}
			ENDCG
		}
	}
}
