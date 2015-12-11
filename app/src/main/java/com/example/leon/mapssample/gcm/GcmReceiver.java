package com.example.leon.mapssample.gcm;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import com.example.leon.mapssample.R;
import com.example.leon.mapssample.activity.MainActivity;

/**
 * Created by Leon on 10.12.2015.
 */
public class GcmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        sendNotification(context, intent.getStringExtra("message"));
    }

    private void sendNotification(Context context, String text) {
        final Intent intent = new Intent(context, MainActivity.class);
        final PendingIntent activity = PendingIntent.getActivity(context, 100501, intent, PendingIntent.FLAG_ONE_SHOT);
        final Notification notification = new NotificationCompat.Builder(context)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher))
                .setContentTitle(context.getString(R.string.app_name))
                .setContentText(text)
                .setTicker(text)
                .setStyle(new NotificationCompat.BigTextStyle().bigText(text))
                .setContentIntent(activity)
                .build();
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        NotificationManagerCompat.from(context).notify(100500, notification);
    }
}













