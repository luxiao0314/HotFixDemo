package com.lqr.hotfixdemo.simplehotfix;

import android.content.Context;
import android.widget.Toast;

/**
 * dx --dex --output=BugClass.dex com/lqr/hotfixdemo/simplehotfix/SimpleHotFixBugTest.class
 */
public class SimpleHotFixBugTest {
    public void getBug(Context context) {
        int i = 10;
        int a = 0;
        Toast.makeText(context, "Hello,I am CSDN_LQR:" + i / a, Toast.LENGTH_SHORT).show();
    }
}
