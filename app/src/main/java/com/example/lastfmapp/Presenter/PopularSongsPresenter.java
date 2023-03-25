package com.example.lastfmapp.Presenter;

import com.example.lastfmapp.Interface.PopularSongsInterface;
import com.example.lastfmapp.Model.PopularSongs.Track;
import com.example.lastfmapp.Model.PopularSongsInteractor;
import com.example.lastfmapp.View.PopularSongs;

import java.util.List;

public class PopularSongsPresenter implements PopularSongsInterface.InterfacePresenter {

    private PopularSongsInterface.InterfaceInteractor popularSongsInteractor;
    private PopularSongsInterface.InterfaceView interfaceView;



    public PopularSongsPresenter(PopularSongsInterface.InterfaceView view) {
        this.interfaceView=view;
        this.popularSongsInteractor= new PopularSongsInteractor(this);


    }

    @Override
    public void requestData(String nameartista) {
        popularSongsInteractor.requestData(nameartista);

    }

    @Override
    public void successfulQuery(List<Track> tracks) {
        interfaceView.successfulQuery(tracks);

    }

    @Override
    public void onFailureResult() {

    }
}
