package com.lqr.hotfixdemo;

import android.app.Application;
import android.content.Context;

import com.lqr.hotfixdemo.simplehotfix.FixDexUtils;
import com.lqr.hotfixdemo.simplehotfix.SpUtils;

import java.io.File;

/**
 * @Description
 * @Author lux
 * @Date 2021/11/4 5:17 PM
 * @Version
 */
public class BaseApplication extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;

        FixDexUtils.loadFixedDex(this, new File(SpUtils.get("patch_path","")));
    }
}
