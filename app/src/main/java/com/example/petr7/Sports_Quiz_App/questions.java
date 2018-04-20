package com.example.petr7.Sports_Quiz_App;

import android.app.Application;
import com.firebase.client.Firebase;


public class questions extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}