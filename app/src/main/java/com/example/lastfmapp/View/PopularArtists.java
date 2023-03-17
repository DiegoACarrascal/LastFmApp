package com.example.lastfmapp.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lastfmapp.Interface.PopularArtistsInterface;
import com.example.lastfmapp.Model.PopularArtists.Artists;
import com.example.lastfmapp.Presenter.PopularArtistsPresenter;
import com.example.lastfmapp.R;
import com.example.lastfmapp.View.Adapter.AdapterPopularArtists;

import java.util.List;

public class PopularArtists extends AppCompatActivity implements PopularArtistsInterface.InterfaceView {


    private PopularArtistsPresenter popularArtistsPresenter;
    private AdapterPopularArtists adapterPopularArtists;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_artists);

        popularArtistsPresenter = new PopularArtistsPresenter(this);
        recyclerView =  findViewById(R.id.recyclerPA);
        requestData();


    }

    @Override
    public void requestData() {
        popularArtistsPresenter.requestData();
    }

    @Override
    public void successfulQuery(List<Artists> artists) {

        adapterPopularArtists = new AdapterPopularArtists(artists,this);
        recyclerView.setAdapter(adapterPopularArtists);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onFailureResult() {

    }
}