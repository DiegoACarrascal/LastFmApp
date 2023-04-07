package com.example.lastfmapp.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.example.lastfmapp.Interface.PopularArtistsInterface;
import com.example.lastfmapp.Model.PopularArtists.Artists;
import com.example.lastfmapp.Presenter.PopularArtistsPresenter;
import com.example.lastfmapp.R;
import com.example.lastfmapp.Tools.ConexionInternet;
import com.example.lastfmapp.View.Adapter.AdapterPopularArtists;

import java.util.List;

public class PopularArtists extends AppCompatActivity implements PopularArtistsInterface.InterfaceView {


    private PopularArtistsPresenter popularArtistsPresenter;
    private AdapterPopularArtists adapterPopularArtists;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private ConstraintLayout constraintLayout;
    private BroadcastReceiver broadcastReceiver= new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (ConexionInternet.isOutputInternet(getApplicationContext())) {
                progressBar.setVisibility(View.GONE);
                constraintLayout.setVisibility(View.GONE);
                requestData();
            }
            Log.i("tag","sarna");
        }
    };;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_artists);
        progressBar = findViewById(R.id.progressPA);
        constraintLayout = findViewById(R.id.errorConexion);
        progressBar.setVisibility(View.VISIBLE);
        popularArtistsPresenter = new PopularArtistsPresenter(this, getApplicationContext());
        recyclerView = findViewById(R.id.recyclerPA);
        requestData();
    }

    @Override
    public void requestData() {
        popularArtistsPresenter.requestData();
    }

    @Override
    public void successfulQuery(List<Artists> artists) {
        progressBar.setVisibility(View.GONE);
        adapterPopularArtists = new AdapterPopularArtists(artists, this);
        recyclerView.setAdapter(adapterPopularArtists);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

    }

    @Override
    public void onFailureResult() {
        registerReceiver(broadcastReceiver,new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
        progressBar.setVisibility(View.GONE);
        constraintLayout.setVisibility(View.VISIBLE);

    }
}