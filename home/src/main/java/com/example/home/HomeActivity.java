package com.example.home;

import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.ARouterPathConstant;
import com.example.base.ServiceFactory;
import com.example.base.base.BaseActivity;

@Route(path = ARouterPathConstant.Home.HOME_ACTIVITY)
public class HomeActivity extends BaseActivity {

    @Override
    protected int getContentLayout() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView() {
        TextView tvState = findViewById(R.id.tv_state);
        Button btnShare = findViewById(R.id.btn_share);
        btnShare.setOnClickListener(v -> goToShare());
        share();

        String shareContent = getIntent().getStringExtra("share_content");
        if (!TextUtils.isEmpty(shareContent)) tvState.setText(shareContent);
    }

    private void share() {
        if(ServiceFactory.getInstance().getAccountService().isLogin()) {
            Toast.makeText(this, "分享成功", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "分享失败：用户未登录", Toast.LENGTH_SHORT).show();
        }
    }

    private void goToShare() {
        ARouter.getInstance().build(ARouterPathConstant.Mine.MINE_ACTIVITY).navigation();
    }
}
