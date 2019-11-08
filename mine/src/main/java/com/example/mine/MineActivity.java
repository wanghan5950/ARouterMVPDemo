package com.example.mine;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.ARouterPathConstant;
import com.example.base.base.BaseActivity;

@Route(path = ARouterPathConstant.Mine.MINE_ACTIVITY)
public class MineActivity extends BaseActivity {

    private TextView tvState;

    @Override
    protected int getContentLayout() {
        return R.layout.activity_mine;
    }

    @Override
    protected void initView() {
        tvState = findViewById(R.id.tv_state);
        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(v -> {
            UserUtil.setIsLogin(true);
            UserUtil.setUserId("userId");
            updateLoginState();
        });
        Button btnLogout = findViewById(R.id.btn_logout);
        btnLogout.setOnClickListener(v -> logout());
        Button btnToShare = findViewById(R.id.btn_go_to_share);
        btnToShare.setOnClickListener(v -> goToShare());
        Button btnSetting = findViewById(R.id.btn_setting);
        btnSetting.setOnClickListener(v -> goToSetting());
    }

    private void updateLoginState() {
        if (UserUtil.isLogin()) {
            tvState.setText("已登录ID：" + UserUtil.getUserId());
        } else {
            tvState.setText("未登录");
        }
    }

    private void logout() {
        UserUtil.setIsLogin(false);
        UserUtil.setUserId("");
    }

    private void goToShare() {
        ARouter.getInstance().build(ARouterPathConstant.Home.HOME_ACTIVITY).withString("share_content", "分享内容");
    }

    /**
     * 模块内跳转
     */
    private void goToSetting() {
        startActivity(new Intent(this, SettingActivity.class));
    }

}
