package com.lqr.hotfixdemo.simplehotfix;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.lqr.hotfixdemo.BaseApplication;

import java.util.HashSet;
import java.util.Set;


public class SpUtils {

    private static volatile SharedPreferences shrPref;

    private static SharedPreferences getSP() {
        try {
            if (shrPref == null) {
                shrPref = BaseApplication.context.getSharedPreferences("HOT_FIX_DEMO", Context.MODE_PRIVATE);
            }
            return shrPref;
        } catch (OutOfMemoryError e) {
            Log.d("SpUtils",e.toString());
        }
        return null;
    }

    public static void putBoolean(String key, boolean value) {
        if (getSP() == null) {
            return;
        }
        SharedPreferences.Editor editor = getSP().edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static boolean getBoolean(String key, boolean defaultValue) {
        boolean value = defaultValue;
        if (getSP() != null) {
            value = getSP().getBoolean(key, defaultValue);

        }
        return value;
    }

    public static boolean getBoolean(String key) {
        boolean value = false;
        if (getSP() != null) {
            value = getSP().getBoolean(key, false);

        }
        return value;
    }

    public static void putInt(String key, int value) {
        if (getSP() == null) {
            return;
        }
        SharedPreferences.Editor editor = getSP().edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getInt(String key, int defaultValue) {
        int value = defaultValue;
        if (getSP() != null) {
            value = getSP().getInt(key, defaultValue);
        }
        return value;
    }

    public static int getInt(String key) {
        int value = 0;
        if (getSP() != null) {
            value = getSP().getInt(key, 0);

        }
        return value;
    }

    public static void put(String key, String value) {
        if (getSP() == null) {
            return;
        }
        SharedPreferences.Editor editor = getSP().edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static void remove(String key) {
        if (getSP() == null) {
            return;
        }
        SharedPreferences.Editor editor = getSP().edit();
        editor.remove(key);
        editor.apply();
    }

    public static String get(String key, String defaultValue) {
        String value = defaultValue;
        if (getSP() != null) {
            value = getSP().getString(key, defaultValue);

        }
        return value;
    }

    public static String get(String key) {
        String value = "";
        if (getSP() != null) {
            value = getSP().getString(key, "");

        }
        return value;
    }

    public static void putString(String key, String value) {
        if (getSP() == null) {
            return;
        }
        SharedPreferences.Editor editor = getSP().edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static Set<String> getSet(String key) {
        Set<String> value = new HashSet<String>();
        if (getSP() != null) {
            value = getSP().getStringSet(key, value);

        }
        return value;
    }

    public static Set<String> getSet(String key, Set<String> defaultValue) {
        Set<String> value = defaultValue;
        if (getSP() != null) {
            value = getSP().getStringSet(key, defaultValue);

        }
        return value;
    }

    public static void putSet(String key, Set<String> set) {
        if (getSP() == null) {
            return;
        }
        SharedPreferences.Editor editor = getSP().edit();
        editor.putStringSet(key, set);
        editor.apply();
    }

    public static void addSet(String key, String setValue) {
        if (getSP() == null) {
            return;
        }
        SharedPreferences.Editor editor = getSP().edit();

        Set<String> set = getSP().getStringSet(key, new HashSet<String>());
        set.add(setValue);
        editor.putStringSet(key, set);
        editor.apply();
    }

    public static boolean contains(String key) {
        boolean value = false;
        if (getSP() != null) {
            value = getSP().contains(key);
        }
        return value;
    }

    public static String getString(String key, String defaultValue) {
        String value = defaultValue;
        if (getSP() != null) {
            value = getSP().getString(key, defaultValue);

        }
        return value;
    }

    public static String getString(String key) {
        String value = "";
        if (getSP() != null) {
            value = getSP().getString(key, "");

        }
        return value;
    }

    public static void putLong(String key, Long value) {
        if (getSP() == null) {
            return;
        }
        SharedPreferences.Editor editor = getSP().edit();
        editor.putLong(key, value);
        editor.apply();
    }

    public static Long getLong(String key) {
        Long value = 0L;
        if (getSP() != null) {
            value = getSP().getLong(key, 0L);

        }
        return value;
    }

    public static Long getLong(String key, Long defaultValue) {
        Long value = defaultValue;
        if (getSP() != null) {
            value = getSP().getLong(key, defaultValue);

        }
        return value;
    }
}