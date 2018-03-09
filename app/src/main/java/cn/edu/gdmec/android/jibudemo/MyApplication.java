package cn.edu.gdmec.android.jibudemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by Jack on 2018/3/9.
 */

public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        GlobalConfig.setAppContext(this);
    }
}