package com.example.yuansen.baidumapview;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by yuansen on 2015/9/8.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
    }
}
