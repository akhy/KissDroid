package net.akhyar.kissdroid.util;

import net.akhyar.kissdroid.KissDroid;

/**
 * @author akhyar
 */
public class UnitUtils {

    public static float dpFromPx(float px) {
        return px / KissDroid.getContext().getResources().getDisplayMetrics().density;
    }

    public static float pxFromDp(float dp) {
        return dp * KissDroid.getContext().getResources().getDisplayMetrics().density;
    }

}
