package com.example.lastfmapp.Interface;

import com.example.lastfmapp.Model.PopularArtists.Artists;
import com.example.lastfmapp.Model.PopularSongs.Track;

import java.util.List;

public interface PopularSongsInterface {

    interface InterfaceView{

        void requestData(String nameartista);
        void successfulQuery(List<Track> tracks);
        void onFailureResult();
    }


    interface InterfacePresenter{


        void requestData(String nameartista);
        void successfulQuery(List<Track> tracks);
        void onFailureResult();

    }

    interface InterfaceInteractor{

        void requestData(String nameartista);

        void successfulQuery(List<Track> tracks);

        void onFailureResult();

    }


}
