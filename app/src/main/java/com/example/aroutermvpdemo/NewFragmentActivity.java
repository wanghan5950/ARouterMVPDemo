package com.example.aroutermvpdemo;

import com.example.base.ServiceFactory;
import com.example.base.base.BaseActivity;

public class NewFragmentActivity extends BaseActivity {

    @Override
    protected int getContentLayout() {
        return R.layout.app_activity_new_fragment;
    }

    @Override
    protected void initView() {
        ServiceFactory.getInstance().getAccountService().newUserFragment(
                this, R.id.fragment_container, getSupportFragmentManager(), null, "");
    }
}
