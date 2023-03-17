package com.example.lastfmapp.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lastfmapp.Interface.PopularSongsInterface;
import com.example.lastfmapp.Model.PopularSongs.Track;
import com.example.lastfmapp.Presenter.PopularSongsPresenter;
import com.example.lastfmapp.R;

import java.util.List;

public class PopularSongs extends AppCompatActivity implements PopularSongsInterface.InterfaceView {

    private PopularSongsInterface.InterfacePresenter popularSongsPresenter;
    private Bundle bundle;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_songs);
        popularSongsPresenter= new PopularSongsPresenter(this);
        recyclerView = findViewById(R.id.recyclerPS);
        bundle= getIntent().getExtras();
        String nameartista= bundle.getString("nombre");
        requestData(nameartista);

    }

    @Override
    public void requestData(String nameartista) {
        popularSongsPresenter.requestData(nameartista);

    }

    @Override
    public void successfulQuery(List<Track> tracks) {

    }

    @Override
    public void onFailureResult() {

    }
}