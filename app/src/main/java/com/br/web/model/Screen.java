package com.br.web.model;

import android.widget.EditText;
import android.widget.TextView;

public class Screen {

    private EditText viewFinder;
    private TextView result;

    public Screen() {
    }

    public EditText getViewFinder() {
        return viewFinder;
    }

    public void setViewFinder(EditText viewFinder) {
        this.viewFinder = viewFinder;
    }

    public TextView getResult() {
        return result;
    }

    public void setResult(TextView result) {
        this.result = result;
    }
}
