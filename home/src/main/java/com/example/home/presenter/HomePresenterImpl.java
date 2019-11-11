package com.example.home.presenter;

import com.example.base.base.mvp.Callback;
import com.example.home.HomeContract;
import com.example.home.entity.HomeResult;
import com.example.home.model.HomeModel;

public class HomePresenterImpl implements HomeContract.HomePresenter {

    private HomeContract.HomeView view;
    private HomeModel model;

    public HomePresenterImpl(HomeContract.HomeView view) {
        this.view = view;
        model = new HomeModel();
    }

    @Override
    public void getHomeData() {
        model.getHomeData(new Callback<HomeResult>() {
            @Override
            public void onSuccess(HomeResult data, String msg) {
                view.updateHomeView(data);
            }

            @Override
            public void onFailed(String msg) {

            }
        });
    }

    @Override
    public void start() {

    }
}
