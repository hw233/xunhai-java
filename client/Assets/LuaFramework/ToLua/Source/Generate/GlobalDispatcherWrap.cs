﻿//this source code was auto-generated by tolua#, do not modify it
using System;
using LuaInterface;

public class GlobalDispatcherWrap
{
	public static void Register(LuaState L)
	{
		L.BeginClass(typeof(GlobalDispatcher), typeof(FairyGUI.EventDispatcher));
		L.RegFunction("GetInstance", GetInstance);
		L.RegFunction("New", _CreateGlobalDispatcher);
		L.RegFunction("__tostring", ToLua.op_ToString);
		L.EndClass();
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int _CreateGlobalDispatcher(IntPtr L)
	{
		try
		{
			int count = LuaDLL.lua_gettop(L);

			if (count == 0)
			{
				GlobalDispatcher obj = new GlobalDispatcher();
				ToLua.PushObject(L, obj);
				return 1;
			}
			else
			{
				return LuaDLL.luaL_throw(L, "invalid arguments to ctor method: GlobalDispatcher.New");
			}
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int GetInstance(IntPtr L)
	{
		try
		{
			ToLua.CheckArgsCount(L, 0);
			GlobalDispatcher o = GlobalDispatcher.GetInstance();
			ToLua.PushObject(L, o);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}
}

