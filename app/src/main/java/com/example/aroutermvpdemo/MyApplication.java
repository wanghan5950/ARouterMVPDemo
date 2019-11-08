package com.example.aroutermvpdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.AppConfig;
import com.example.base.BaseApplication;
import com.example.base.ServiceFactory;

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
        initModelApp(this);
        initModelData(this);
    }

    private void initARouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }

    @Override
    public void initModelApp(Application application) {
        for (String model : AppConfig.models) {
            try {
                Class modelClass = Class.forName(model);
                BaseApplication baseApplication = (BaseApplication) modelClass.newInstance();
                baseApplication.initModelApp(this);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initModelData(Application application) {
        for (String model : AppConfig.models) {
            try {
                Class modelClass = Class.forName(model);
                BaseApplication baseApplication = (BaseApplication) modelClass.newInstance();
                baseApplication.initModelData(this);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
