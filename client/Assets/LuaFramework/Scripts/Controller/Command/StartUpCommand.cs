﻿using UnityEngine;
using System.Collections;
using LuaFramework;

public class StartUpCommand : ControllerCommand {

    public override void Execute(IMessage message) {
        if (!Util.CheckEnvironment()) return;
        GameObject gameMgr = GameObject.Find("GameManager");
        if (gameMgr != null) {
            /*AppView appView =*/ gameMgr.AddComponent<AppView>();
        }
        //-----------------关联命令-----------------------
        //AppFacade.Instance.RegisterCommand(NotiConst.DISPATCH_MESSAGE, typeof(SocketCommand));
        //-----------------初始化管理器-----------------------
        AppFacade.Instance.AddManager<LuaManager>(ManagerName.Lua);
        AppFacade.Instance.AddManager<LoaderManager>(ManagerName.Loader);

        AppFacade.Instance.AddManager<SoundManager>(ManagerName.Sound);
        AppFacade.Instance.AddManager<TimerManager>(ManagerName.Timer);
        AppFacade.Instance.AddManager<ResourceManager>(ManagerName.Resource);
        //AppFacade.Instance.AddManager<ThreadManager>(ManagerName.Thread);
        AppFacade.Instance.AddManager<ObjectPoolManager>(ManagerName.ObjectPool);

        if (AppConst.ShowCompanyNameWithTips == false)
        {
            AppFacade.Instance.AddManager<GameManager>(ManagerName.Game);
        }


        
    }
}