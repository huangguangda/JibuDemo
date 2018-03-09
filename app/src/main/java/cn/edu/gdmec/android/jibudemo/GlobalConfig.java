package cn.edu.gdmec.android.jibudemo;

import android.content.Context;

/**
 * Created by Jack on 2018/3/9.
 */

public class GlobalConfig {
    private static Context sContext;

    public static void setAppContext(Context context) {
        sContext = context;
    }

    public static Context getAppContext() {
        return sContext;
    }

}
