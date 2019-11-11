package com.example.home;

import com.example.base.base.mvp.BasePresenter;
import com.example.base.base.mvp.BaseView;
import com.example.home.entity.HomeResult;

public interface HomeContract {

    interface HomePresenter extends BasePresenter {

        void getHomeData();

    }

    interface HomeView extends BaseView<HomePresenter> {

        void updateHomeView(HomeResult result);

    }
}
