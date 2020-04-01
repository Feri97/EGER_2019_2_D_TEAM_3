package com.example.projectytplayer.notification;

import android.app.Application;

public class NotificationCenter extends Application {
    
    public static final String channel_1_ID="channel1";
    
    
    @Override
    public void onCreate(){
        super.onCreate();;
        createNotification();
    }

    private void createNotification() {
    }


}
