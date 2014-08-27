package net.akhyar.kissdroid.util;

import android.text.Editable;
import android.text.TextWatcher;

/**
 * TextWatcher with empty implementations, override as needed to reduce your code verbosity
 *
 * @author akhyar
 */
public class KissTextWatcher implements TextWatcher {

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    @Override
    public void afterTextChanged(Editable s) {
    }

}