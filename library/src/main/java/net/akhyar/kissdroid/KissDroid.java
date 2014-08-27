package net.akhyar.kissdroid;

import android.content.Context;

/**
 * @author akhyar
 */
public class KissDroid {
    private static Context context;

    public static void init(Context context) {
        KissDroid.context = context;
    }

    public static Context getContext() {
        if (context == null)
            throw new IllegalStateException("KissDroid is not initialized. You must call KissDroid.init(Context)");

        return context;
    }
}
