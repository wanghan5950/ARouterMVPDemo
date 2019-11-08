package com.example.mine;

public class UserUtil {

    private static boolean isLogin;
    private static String userId;

    public static boolean isLogin() {
        return isLogin;
    }

    public static String getUserId() {
        return userId;
    }

    public static void setIsLogin(boolean isLogin) {
        UserUtil.isLogin = isLogin;
    }

    public static void setUserId(String userId) {
        UserUtil.userId = userId;
    }
}
