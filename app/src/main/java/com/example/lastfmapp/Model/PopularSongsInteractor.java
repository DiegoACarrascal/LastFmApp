package com.example.lastfmapp.Model;

import com.example.lastfmapp.Interface.PopularSongsInterface;
import com.example.lastfmapp.Model.PopularSongs.HeaderSongs;
import com.example.lastfmapp.Rest.ApiAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PopularSongsInteractor implements PopularSongsInterface.InterfaceInteractor {

    private PopularSongsInterface.InterfacePresenter interfacePresenter;


    public PopularSongsInteractor(PopularSongsInterface.InterfacePresenter presenter) {
        this.interfacePresenter=presenter;

    }

    @Override
    public void requestData() {

        /*Call<HeaderSongs> headerSongsCall= ApiAdapter.getApiService().getCancionesPopulares();
        headerSongsCall.enqueue(new Callback<HeaderSongs>() {
            @Override
            public void onResponse(Call<HeaderSongs> call, Response<HeaderSongs> response) {

            }

            @Override
            public void onFailure(Call<HeaderSongs> call, Throwable t) {

            }
        });*/



    }

    @Override
    public void successfulQuery() {

    }

    @Override
    public void onFailureResult() {

    }
}
