package com.example.home.model;

import com.example.base.base.mvp.Callback;
import com.example.home.entity.HomeResult;

public class HomeModel {

    public void getHomeData(Callback<HomeResult> callback) {
        HomeResult result = new HomeResult(1, "ajfhadhkasd");
        callback.onSuccess(result, "success");
    }

}
