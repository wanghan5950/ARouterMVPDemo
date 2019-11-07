package com.example.mine;

import com.example.base.service.IAccountService;

public class AccountService implements IAccountService {

    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }
}
