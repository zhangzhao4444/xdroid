package com.nata.xdroid.injector;

import android.content.Context;

/**
 * Created by Calvin on 2016/12/22.
 */

public class InjectorManager {
    public static void mockContact(Context context) {
        ContactInjector.inject(context);
    }

    public static String getValueByInputType(int inputType) {
        return TextInjector.mock(inputType);
    }

    public static void injectImages(Context context) {
        FileInjector.injectImages(context);
    }

    public static void injectAudios(Context context) {
        FileInjector.injectAudios(context);
    }
}
