package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by drsolomon on 19/03/17.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://about.me/edgar.ortiz";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
