package net.akhyar.kissdroid.util;

import android.view.View;

import java.util.List;

/**
 * Utility class to deal with {@link android.view.View}
 *
 * @author akhyar
 */
public class ViewUtils {

    /**
     * Toggle {@link android.view.View} visibility between VISIBLE and INVISIBLE
     *
     * @param view target view
     */
    public static void toggleVisible(View view) {
        setVisible(view, view.getVisibility() != View.VISIBLE);
    }

    /**
     * @param view      target {@link android.view.View}
     * @param isVisible set view visibility to VISIBLE if true, INVISIBLE otherwise
     */
    public static void setVisible(View view, boolean isVisible) {
        if (isVisible)
            view.setVisibility(View.VISIBLE);
        else
            view.setVisibility(View.INVISIBLE);
    }

    /**
     * Toggle {@link android.view.View} visibility between VISIBLE and GONE
     *
     * @param view target view
     */
    public static void togglePresence(View view) {
        setPresence(view, view.getVisibility() != View.VISIBLE);
    }

    /**
     * @param view      target {@link android.view.View}
     * @param isPresent set view visibility to VISIBLE if true, GONE otherwise
     */
    public static void setPresence(View view, boolean isPresent) {
        if (isPresent)
            view.setVisibility(View.VISIBLE);
        else
            view.setVisibility(View.GONE);
    }

    /**
     * Apply a single action to a list of views
     *
     * @param targetViews list of target views
     * @param action      action ({@link net.akhyar.kissdroid.util.ViewAction})
     *                    to be done on target views
     * @see net.akhyar.kissdroid.util.ViewAction
     * @see net.akhyar.kissdroid.util.ViewAction.SetVisible
     * @see net.akhyar.kissdroid.util.ViewAction.SetPresence
     * @see net.akhyar.kissdroid.util.ViewAction.SetEnabled
     * @see net.akhyar.kissdroid.util.ViewAction.Enable
     * @see net.akhyar.kissdroid.util.ViewAction.Disable
     */
    public static void apply(List<View> targetViews, ViewAction action) {
        for (View view : targetViews) {
            action.apply(view);
        }
    }
}
