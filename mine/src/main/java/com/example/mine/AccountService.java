package com.example.mine;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.base.base.BaseFragment;
import com.example.base.service.IAccountService;

public class AccountService implements IAccountService {

    @Override
    public boolean isLogin() {
        return UserUtil.isLogin();
    }

    @Override
    public String getAccountId() {
        return UserUtil.getUserId();
    }

    @Override
    public BaseFragment newUserFragment(Activity activity, int containerId, FragmentManager manager, Bundle bundle, String tag) {
        FragmentTransaction transaction = manager.beginTransaction();
        BaseFragment fragment = new MineFragment();
        transaction.add(containerId, fragment, tag);
        transaction.commit();
        return fragment;
    }
}
