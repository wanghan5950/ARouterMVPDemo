package com.example.base.ServiceEmptyImpl;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.FragmentManager;

import com.example.base.base.BaseFragment;
import com.example.base.service.IAccountService;

public class EmptyAccountService implements IAccountService {

    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }

    @Override
    public BaseFragment newUserFragment(Activity activity, int containerId, FragmentManager manager, Bundle bundle, String tag) {
        return null;
    }
}
