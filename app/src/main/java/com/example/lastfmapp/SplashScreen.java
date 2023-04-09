package com.example.lastfmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.lastfmapp.Tools.PermissionStatus;
import com.example.lastfmapp.View.PopularArtists;

public class SplashScreen extends AppCompatActivity {

    private PermissionStatus permissionStatus;
    private Boolean isIntent=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        permissionStatus = new PermissionStatus(SplashScreen.this, this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (permissionStatus.firstTry) {
            permissionStatus.confirmPermissionMsg();
        } else {
            permissionStatus.reqPermissions();
        }

        if(permissionStatus.validatePermissions() && isIntent){
            new Handler().postDelayed(() -> {
                Log.i("SplashScreen", "Inicio app");
                Intent i = new Intent(SplashScreen.this, PopularArtists.class);
                startActivity(i);
                finish();
            },2000);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        isIntent=true;
    }

}