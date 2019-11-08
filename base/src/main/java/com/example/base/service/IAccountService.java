package com.example.base.service;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

import com.example.base.base.BaseFragment;

public interface IAccountService {

    /**
     * 是否已经登录
     * @return
     */
    boolean isLogin();

    /**
     * 获取登录用户的 AccountId
     * @return
     */
    String getAccountId();

    /**
     * 创建 UserFragment
     * @param activity
     * @param containerId
     * @param manager
     * @param bundle
     * @param tag
     * @return
     */
    BaseFragment newUserFragment(Activity activity, int containerId, FragmentManager manager, Bundle bundle, String tag);
}
