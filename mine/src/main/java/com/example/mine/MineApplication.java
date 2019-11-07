package com.example.mine;

import android.app.Application;

import com.example.base.BaseApplication;
import com.example.base.ServiceFactory;

public class MineApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        initModelApp(this);
        initModelData(this);
    }

    @Override
    public void initModelApp(Application application) {
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }

    @Override
    public void initModelData(Application application) {

    }
}
