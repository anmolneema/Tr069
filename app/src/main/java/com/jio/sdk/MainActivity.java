package com.jio.sdk;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;



public class MainActivity extends Activity {
    Button btnRadio;
    private Context mContext;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        btnRadio = findViewById(R.id.btnRadio);
        Intent intent = new Intent();
        intent.setAction("com.inn.nvengineer");
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        intent.setComponent(
                new ComponentName("com.inn.nvengineer","com.inn.nvengineer.receiver.BootReceiver"));
        sendBroadcast(intent);
        btnRadio.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.inn.nvengineer");
                intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                intent.setComponent(
                        new ComponentName("com.inn.nvengineer","com.inn.nvengineer.receiver.BootReceiver"));
                sendBroadcast(intent);
            }
        });
    }
}