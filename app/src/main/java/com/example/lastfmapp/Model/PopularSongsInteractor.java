package com.example.lastfmapp.Model;

import android.util.Log;

import com.example.lastfmapp.Interface.PopularSongsInterface;
import com.example.lastfmapp.Model.PopularArtists.Artists;
import com.example.lastfmapp.Model.PopularArtists.HeaderApi;
import com.example.lastfmapp.Model.PopularArtists.TopArtists;
import com.example.lastfmapp.Model.PopularSongs.HeaderSongs;
import com.example.lastfmapp.Model.PopularSongs.TopSongs;
import com.example.lastfmapp.Model.PopularSongs.Track;
import com.example.lastfmapp.Rest.ApiAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PopularSongsInteractor implements PopularSongsInterface.InterfaceInteractor {

    private PopularSongsInterface.InterfacePresenter interfacePresenter;


    public PopularSongsInteractor(PopularSongsInterface.InterfacePresenter presenter) {
        this.interfacePresenter=presenter;

    }

    @Override
    public void requestData(String nameartista) {

        Call<HeaderSongs> headerSongsCall= ApiAdapter.getApiService().getCancionesPopulares(nameartista);
        headerSongsCall.enqueue(new Callback<HeaderSongs>() {
            @Override
            public void onResponse(Call<HeaderSongs> call, Response<HeaderSongs> response) {

                if(!response.isSuccessful()){
                    onFailureResult();
                }

                HeaderSongs list= response.body();
                TopSongs topSongs= list.getTopSongs();
                List<Track> tracks=topSongs.getTrack();

                if(tracks.size()>0){
                    successfulQuery(tracks);
                }else{
                    onFailureResult();
                    Log.e("onResponseProduct", "Response is null");
                }





            }

            @Override
            public void onFailure(Call<HeaderSongs> call, Throwable t) {

            }
        });



    }

    @Override
    public void successfulQuery(List<Track> tracks) {
        interfacePresenter.successfulQuery(tracks);

    }

    @Override
    public void onFailureResult() {

    }
}
