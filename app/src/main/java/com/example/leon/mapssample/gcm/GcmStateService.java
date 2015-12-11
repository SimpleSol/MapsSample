package com.example.leon.mapssample.gcm;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;

import java.io.IOException;

/**
 * Created by Leon on 10.12.2015.
 */
public class GcmStateService extends IntentService{

    private static final String GCM_SENDER_ID = "129021288376";

    private GoogleCloudMessaging mGcm;

    public GcmStateService() {
        super("GcmStateService");
    }

    public static void start(@NonNull Context context) {
        context.startService(new Intent(context, GcmStateService.class));
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mGcm = GoogleCloudMessaging.getInstance(this);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            final String gcmRegId = mGcm.register(GCM_SENDER_ID);
            Log.i("GcmStateService", gcmRegId);
        } catch (IOException e) {
            Log.e("GcmStateService", e.getMessage(), e);
        }
    }
}












