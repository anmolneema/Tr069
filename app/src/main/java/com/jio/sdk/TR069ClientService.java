package com.jio.sdk;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;


public class TR069ClientService extends BroadcastReceiver{

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(Context context,  Intent intent) {
        Log.d("TAG","intent from nv");
        if(intent.hasExtra("DownloadSpeedInMbps")) {
            String download =  intent.getStringExtra("DownloadSpeedInMbps");
            Log.d("TAG","download: "+download);
        }
        if(intent.hasExtra("UploadSpeedInMbps")) {
            String upload = intent.getStringExtra("UploadSpeedInMbps");
            Log.d("TAG","upload : "+upload);
        }
        if(intent.hasExtra("LatencyInMs")) {
            String latency = intent.getStringExtra("LatencyInMs");
            Log.d("TAG","latency: "+latency);
        }
        if(intent.hasExtra("PublicIPv4Address")) {
            String publicIPv4Address = intent.getStringExtra("PublicIPv4Address");
            Log.d("TAG","v4: "+publicIPv4Address);
        }
        if(intent.hasExtra("PublicIPv6Address")) {
            String publicIPv6Addres = intent.getStringExtra("PublicIPv6Address");
            Log.d("TAG","v6: "+publicIPv6Addres);
        }

    }

}



