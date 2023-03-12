package com.example.lastfmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.lastfmapp.View.PopularArtists;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(() -> {
            Log.i("SplashScreen", "Inicio app");
            Intent i = new Intent(SplashScreen.this, PopularArtists.class);
            startActivity(i);
            finish();
        },3000);
    }
}