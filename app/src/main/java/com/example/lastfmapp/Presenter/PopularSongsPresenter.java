package com.example.lastfmapp.Presenter;

import com.example.lastfmapp.Interface.PopularSongsInterface;
import com.example.lastfmapp.Model.PopularSongsInteractor;
import com.example.lastfmapp.View.PopularSongs;

public class PopularSongsPresenter implements PopularSongsInterface.InterfacePresenter {

    private PopularSongsInterface.InterfaceInteractor popularSongsInteractor;
    private PopularSongsInterface.InterfaceView interfaceView;



    public PopularSongsPresenter(PopularSongsInterface.InterfaceView view) {
        this.interfaceView=view;
        this.popularSongsInteractor= new PopularSongsInteractor(this);


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
