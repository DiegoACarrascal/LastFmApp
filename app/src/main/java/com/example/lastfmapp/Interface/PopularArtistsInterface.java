package com.example.lastfmapp.Interface;

import com.example.lastfmapp.Model.PopularArtists.Artists;

import java.util.List;

public interface PopularArtistsInterface {


    interface InterfaceView{

        void requestData();
        void successfulQuery(List<Artists> artists);
        void onFailureResult();
    }


    interface InterfacePresenter{


        void requestData();
        void successfulQuery(List<Artists> artists);
        void onFailureResult();

    }

    interface InterfaceInteractor{

        void requestData();

        void successfulQuery(List<Artists> artists);

        void onFailureResult();

    }




}
