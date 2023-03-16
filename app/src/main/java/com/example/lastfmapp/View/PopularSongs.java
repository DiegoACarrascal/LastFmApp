package com.example.lastfmapp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lastfmapp.Interface.PopularSongsInterface;
import com.example.lastfmapp.Presenter.PopularSongsPresenter;
import com.example.lastfmapp.R;

public class PopularSongs extends AppCompatActivity implements PopularSongsInterface.InterfaceView {

    private PopularSongsInterface.InterfacePresenter popularSongsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_songs);
        popularSongsPresenter= new PopularSongsPresenter(this);
        requestData();

    }

    @Override
    public void requestData() {

    }

    @Override
    public void successfulQuery() {

    }

    @Override
    public void onFailureResult() {

    }
}