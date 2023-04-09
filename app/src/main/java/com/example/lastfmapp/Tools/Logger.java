package com.example.lastfmapp.Tools;

import android.content.Context;
import android.util.Log;

public class Logger {
    public static final String TAG = "LOG" ;

    public static Wrlg wrlg = null;

    public static void information(String msg){
        if(true) {
            if (wrlg == null) {
                wrlg = new Wrlg();
            }
            Log.i(TAG, msg);
            wrlg.wrDataTxt(TAG + ": " + msg);
        }
    }

}
