package com.yzqs.basa.app;

import android.app.Application;

import com.antfortune.freeline.FreelineCore;

/**
 * Created by lixiang on 2017/1/5.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FreelineCore.init(this);
    }
}
