package com.example.leon.mapssample;

import android.app.Application;

import com.example.leon.mapssample.gcm.GcmStateService;

/**
 * Created by Leon on 10.12.2015.
 */
public class AppDelegate extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GcmStateService.start(this);
    }
}
