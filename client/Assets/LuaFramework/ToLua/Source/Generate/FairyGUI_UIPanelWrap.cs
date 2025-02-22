﻿//this source code was auto-generated by tolua#, do not modify it
using System;
using LuaInterface;

public class FairyGUI_UIPanelWrap
{
	public static void Register(LuaState L)
	{
		L.BeginClass(typeof(FairyGUI.UIPanel), typeof(UnityEngine.MonoBehaviour));
		L.RegFunction("CreateUI", CreateUI);
		L.RegFunction("SetSortingOrder", SetSortingOrder);
		L.RegFunction("SetHitTestMode", SetHitTestMode);
		L.RegFunction("CacheNativeChildrenRenderers", CacheNativeChildrenRenderers);
		L.RegFunction("ApplyModifiedProperties", ApplyModifiedProperties);
		L.RegFunction("MoveUI", MoveUI);
		L.RegFunction("GetUIWorldPosition", GetUIWorldPosition);
		L.RegFunction("EM_BeforeUpdate", EM_BeforeUpdate);
		L.RegFunction("EM_Update", EM_Update);
		L.RegFunction("EM_Reload", EM_Reload);
		L.RegFunction("__eq", op_Equality);
		L.RegFunction("__tostring", ToLua.op_ToString);
		L.RegVar("packageName", get_packageName, set_packageName);
		L.RegVar("componentName", get_componentName, set_componentName);
		L.RegVar("fitScreen", get_fitScreen, set_fitScreen);
		L.RegVar("sortingOrder", get_sortingOrder, set_sortingOrder);
		L.RegVar("container", get_container, null);
		L.RegVar("ui", get_ui, null);
		L.RegVar("EM_sortingOrder", get_EM_sortingOrder, null);
		L.EndClass();
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int CreateUI(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)ToLua.CheckObject(L, 1, typeof(FairyGUI.UIPanel));
			obj.CreateUI();
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int SetSortingOrder(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 3);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)ToLua.CheckObject(L, 1, typeof(FairyGUI.UIPanel));
			int arg0 = (int)LuaDLL.luaL_checknumber(L, 2);
			bool arg1 = LuaDLL.luaL_checkboolean(L, 3);
			obj.SetSortingOrder(arg0, arg1);
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int SetHitTestMode(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 2);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)ToLua.CheckObject(L, 1, typeof(FairyGUI.UIPanel));
			FairyGUI.HitTestMode arg0 = (FairyGUI.HitTestMode)ToLua.CheckObject(L, 2, typeof(FairyGUI.HitTestMode));
			obj.SetHitTestMode(arg0);
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int CacheNativeChildrenRenderers(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)ToLua.CheckObject(L, 1, typeof(FairyGUI.UIPanel));
			obj.CacheNativeChildrenRenderers();
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int ApplyModifiedProperties(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 3);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)ToLua.CheckObject(L, 1, typeof(FairyGUI.UIPanel));
			bool arg0 = LuaDLL.luaL_checkboolean(L, 2);
			bool arg1 = LuaDLL.luaL_checkboolean(L, 3);
			obj.ApplyModifiedProperties(arg0, arg1);
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int MoveUI(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 2);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)ToLua.CheckObject(L, 1, typeof(FairyGUI.UIPanel));
			UnityEngine.Vector3 arg0 = ToLua.ToVector3(L, 2);
			obj.MoveUI(arg0);
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int GetUIWorldPosition(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)ToLua.CheckObject(L, 1, typeof(FairyGUI.UIPanel));
			UnityEngine.Vector3 o = obj.GetUIWorldPosition();
			ToLua.Push(L, o);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int EM_BeforeUpdate(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)ToLua.CheckObject(L, 1, typeof(FairyGUI.UIPanel));
			obj.EM_BeforeUpdate();
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int EM_Update(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 2);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)ToLua.CheckObject(L, 1, typeof(FairyGUI.UIPanel));
			FairyGUI.UpdateContext arg0 = (FairyGUI.UpdateContext)ToLua.CheckObject(L, 2, typeof(FairyGUI.UpdateContext));
			obj.EM_Update(arg0);
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int EM_Reload(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)ToLua.CheckObject(L, 1, typeof(FairyGUI.UIPanel));
			obj.EM_Reload();
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int op_Equality(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 2);
			UnityEngine.Object arg0 = (UnityEngine.Object)ToLua.ToObject(L, 1);
			UnityEngine.Object arg1 = (UnityEngine.Object)ToLua.ToObject(L, 2);
			bool o = arg0 == arg1;
			LuaDLL.lua_pushboolean(L, o);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_packageName(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)o;
			string ret = obj.packageName;
			LuaDLL.lua_pushstring(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o == null ? "attempt to index packageName on a nil value" : e.Message);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_componentName(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)o;
			string ret = obj.componentName;
			LuaDLL.lua_pushstring(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o == null ? "attempt to index componentName on a nil value" : e.Message);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_fitScreen(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)o;
			FairyGUI.FitScreen ret = obj.fitScreen;
			ToLua.Push(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o == null ? "attempt to index fitScreen on a nil value" : e.Message);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_sortingOrder(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)o;
			int ret = obj.sortingOrder;
			LuaDLL.lua_pushinteger(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o == null ? "attempt to index sortingOrder on a nil value" : e.Message);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_container(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)o;
			FairyGUI.Container ret = obj.container;
			ToLua.PushObject(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o == null ? "attempt to index container on a nil value" : e.Message);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_ui(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)o;
			FairyGUI.GComponent ret = obj.ui;
			ToLua.PushObject(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o == null ? "attempt to index ui on a nil value" : e.Message);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_EM_sortingOrder(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)o;
			int ret = obj.EM_sortingOrder;
			LuaDLL.lua_pushinteger(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o == null ? "attempt to index EM_sortingOrder on a nil value" : e.Message);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int set_packageName(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)o;
			string arg0 = ToLua.CheckString(L, 2);
			obj.packageName = arg0;
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o == null ? "attempt to index packageName on a nil value" : e.Message);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int set_componentName(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)o;
			string arg0 = ToLua.CheckString(L, 2);
			obj.componentName = arg0;
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o == null ? "attempt to index componentName on a nil value" : e.Message);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int set_fitScreen(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)o;
			FairyGUI.FitScreen arg0 = (FairyGUI.FitScreen)ToLua.CheckObject(L, 2, typeof(FairyGUI.FitScreen));
			obj.fitScreen = arg0;
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o == null ? "attempt to index fitScreen on a nil value" : e.Message);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int set_sortingOrder(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FairyGUI.UIPanel obj = (FairyGUI.UIPanel)o;
			int arg0 = (int)LuaDLL.luaL_checknumber(L, 2);
			obj.sortingOrder = arg0;
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o == null ? "attempt to index sortingOrder on a nil value" : e.Message);
		}
	}
}

