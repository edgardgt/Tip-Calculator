package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by drsolomon on 24/03/17
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://about.me/edgar.ortiz";

    public static String getAboutUrl() {
        return ABOUT_URL;
    }
}
