package net.akhyar.kissdroid.util;

import android.view.View;

/**
 * @author akhyar
 */
public interface ViewAction {

    public void apply(View view);

    public static class SetVisible implements ViewAction {

        private boolean isVisible;

        public SetVisible(boolean isVisible) {
            this.isVisible = isVisible;
        }

        @Override
        public void apply(View view) {
            ViewUtils.setVisible(view, isVisible);
        }
    }

    public static class SetPresence implements ViewAction {

        private boolean isPresent;

        public SetPresence(boolean isPresent) {
            this.isPresent = isPresent;
        }

        @Override
        public void apply(View view) {
            ViewUtils.setPresence(view, isPresent);
        }
    }

    public static class SetEnabled implements ViewAction {

        private boolean isEnabled;

        public SetEnabled(boolean isEnabled) {
            this.isEnabled = isEnabled;
        }

        @Override
        public void apply(View view) {
            view.setEnabled(isEnabled);
        }
    }

    public static class Enable implements ViewAction {

        @Override
        public void apply(View view) {
            view.setEnabled(true);
        }
    }

    public static class Disable implements ViewAction {

        @Override
        public void apply(View view) {
            view.setEnabled(false);
        }
    }
}
