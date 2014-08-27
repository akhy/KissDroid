package net.akhyar.kissdroid.util;

import android.content.Context;
import android.net.ConnectivityManager;

import net.akhyar.kissdroid.KissDroid;

/**
 * @author akhyar
 */
public class NetworkUtils {
    public static boolean isNetworkActive() {
        return ((ConnectivityManager) KissDroid.getContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE))
                .getActiveNetworkInfo() != null;
    }
}
