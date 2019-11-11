package com.example.aroutermvpdemo;

import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.ARouterPathConstant;
import com.example.base.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getContentLayout() {
        return R.layout.app_activity_main;
    }

    @Override
    protected void initView() {
        Button btnGoToHome = findViewById(R.id.btn_go_to_share);
        btnGoToHome.setOnClickListener(v -> goToShare());
        Button btnGotoLogin = findViewById(R.id.btn_go_to_login);
        btnGotoLogin.setOnClickListener(v -> goToLogin());
    }

    private void goToShare() {
        ARouter.getInstance().build(ARouterPathConstant.Home.HOME_ACTIVITY).withString("share_content", "分享内容").navigation();
    }

    private void goToLogin() {
        ARouter.getInstance().build(ARouterPathConstant.Mine.MINE_ACTIVITY).navigation();
    }

}
