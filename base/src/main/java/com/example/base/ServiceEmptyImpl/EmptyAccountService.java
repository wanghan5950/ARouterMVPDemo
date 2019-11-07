package com.example.base.ServiceEmptyImpl;

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
}
