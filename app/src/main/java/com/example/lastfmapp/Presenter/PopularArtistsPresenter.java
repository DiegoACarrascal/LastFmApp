package com.example.lastfmapp.Presenter;

import com.example.lastfmapp.Interface.PopularArtistsInterface;
import com.example.lastfmapp.Model.PopularArtists.Artists;
import com.example.lastfmapp.Model.PopularArtistsInteractor;

import java.util.List;

public class PopularArtistsPresenter implements PopularArtistsInterface.InterfacePresenter {

    private PopularArtistsInterface.InterfaceView interfaceView;
    private PopularArtistsInterface.InterfaceInteractor interfaceInteractor;


    public PopularArtistsPresenter (PopularArtistsInterface.InterfaceView view){
        this.interfaceInteractor = new PopularArtistsInteractor(this);
        this.interfaceView= view;
    }







    @Override
    public void requestData() {
        interfaceInteractor.requestData();

    }

    @Override
    public void successfulQuery(List<Artists> artists) {
        interfaceView.successfulQuery(artists);
    }

    @Override
    public void onFailureResult() {
        interfaceView.onFailureResult();
    }
}
