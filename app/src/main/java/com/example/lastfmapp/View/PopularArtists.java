package com.example.lastfmapp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lastfmapp.Interface.PopularArtistsInterface;
import com.example.lastfmapp.Model.Entitis.Artists;
import com.example.lastfmapp.Presenter.PopularArtistsPresenter;
import com.example.lastfmapp.R;

import java.util.List;

public class PopularArtists extends AppCompatActivity implements PopularArtistsInterface.InterfaceView {


    private PopularArtistsPresenter popularArtistsPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_artists);

        popularArtistsPresenter = new PopularArtistsPresenter(this);
        requestData();


    }

    @Override
    public void requestData() {
        popularArtistsPresenter.requestData();
    }

    @Override
    public void successfulQuery(List<Artists> artists) {

    }

    @Override
    public void onFailureResult() {

    }
}