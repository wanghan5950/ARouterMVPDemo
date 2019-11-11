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
import com.example.home.entity.HomeResult;
import com.example.home.presenter.HomePresenterImpl;

@Route(path = ARouterPathConstant.Home.HOME_ACTIVITY)
public class HomeActivity extends BaseActivity implements HomeContract.HomeView {

    private HomeContract.HomePresenter presenter;
    private TextView mTvData;

    @Override
    protected int getContentLayout() {
        return R.layout.home_activity_home;
    }

    @Override
    protected void initView() {
        presenter = new HomePresenterImpl(this);
        TextView tvState = findViewById(R.id.tv_state);
        mTvData = findViewById(R.id.home_tv_data);
        Button btnShare = findViewById(R.id.btn_share);
        Button btnGetData = findViewById(R.id.home_btn_get_data);
        btnShare.setOnClickListener(v -> goToShare());
        btnGetData.setOnClickListener(v -> presenter.getHomeData());
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

    @Override
    public void updateHomeView(HomeResult result) {
        mTvData.setText(result.getContent());
    }

    @Override
    public void setPresenter(HomeContract.HomePresenter presenter) {

    }
}
