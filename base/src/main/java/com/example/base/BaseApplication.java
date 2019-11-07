package com.example.base;

import android.app.Application;
import android.content.Context;

public abstract class BaseApplication extends Application {

    public abstract void initModelApp(Application application);

    public abstract void initModelData(Application application);
}
