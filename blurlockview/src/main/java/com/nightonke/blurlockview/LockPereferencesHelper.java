package com.nightonke.blurlockview;

import android.content.Context;
import android.content.SharedPreferences;

class LockPereferencesHelper
{
    public static final String IS_REGISTER = "isRegister";
    public static final String LOCK = "lock";
    public static final String PASSWORD = "password";
    private static Context mContext;

    public LockPereferencesHelper()
    {

    }

    public static boolean isRegister()
    {
        return getSharedPreferences().getBoolean(IS_REGISTER, false);
    }

    public static void setIsRegister(boolean isRegister)
    {
        getSharedPreferences().edit().putBoolean(IS_REGISTER, isRegister).apply();
    }

    public static String getPassword()
    {
        return getSharedPreferences().getString(PASSWORD, "");
    }

    public static void setPassword(String pass)
    {
        getSharedPreferences().edit().putString(PASSWORD, pass).apply();
    }

    public static SharedPreferences getSharedPreferences()
    {
        return mContext.getSharedPreferences(LOCK, Context.MODE_PRIVATE);
    }

    public static void init(Context context)
    {
        mContext = context;
    }
}
