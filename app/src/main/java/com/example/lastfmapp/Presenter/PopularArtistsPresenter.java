package com.example.lastfmapp.Presenter;

import android.content.Context;

import com.example.lastfmapp.Interface.PopularArtistsInterface;
import com.example.lastfmapp.Model.PopularArtists.Artists;
import com.example.lastfmapp.Model.PopularArtistsInteractor;

import java.util.List;

public class PopularArtistsPresenter implements PopularArtistsInterface.InterfacePresenter {

    private PopularArtistsInterface.InterfaceView interfaceView;
    private PopularArtistsInterface.InterfaceInteractor interfaceInteractor;


    public PopularArtistsPresenter (PopularArtistsInterface.InterfaceView view,Context context){
        this.interfaceInteractor = new PopularArtistsInteractor(this,context);
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
