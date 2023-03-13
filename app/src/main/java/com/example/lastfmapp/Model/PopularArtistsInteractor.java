package com.example.lastfmapp.Model;

import android.util.Log;

import com.example.lastfmapp.Interface.PopularArtistsInterface;
import com.example.lastfmapp.Model.Entitis.Artists;
import com.example.lastfmapp.Model.Entitis.HeaderApi;
import com.example.lastfmapp.Model.Entitis.TopArtists;
import com.example.lastfmapp.Rest.ApiAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PopularArtistsInteractor implements PopularArtistsInterface.InterfaceInteractor {

    private PopularArtistsInterface.InterfacePresenter interfacePresenter;


    public PopularArtistsInteractor (PopularArtistsInterface.InterfacePresenter view){
        this.interfacePresenter = view;
    }



    @Override
    public void requestData() {

        Call<HeaderApi> topArtistsCall= ApiAdapter.getApiService().obtenerArtistasPopulares();
        topArtistsCall.enqueue(new Callback<HeaderApi>() {
            @Override
            public void onResponse(Call<HeaderApi> call, Response<HeaderApi> response) {

                if(!response.isSuccessful()){
                    onFailureResult();
                }

                HeaderApi list= response.body();
                TopArtists topArtists= list.getTopArtists();
                List<Artists> artists=topArtists.getArtist();

                if(artists.size()>0){
                    successfulQuery(artists);
                }else{
                    onFailureResult();
                    Log.e("onResponseProduct", "Response is null");
                }


            }

            @Override
            public void onFailure(Call<HeaderApi> call, Throwable t) {
                Log.e("onFailureProduct", "onFailure  falla el consumo"+t.toString());
                onFailureResult();
            }
        });

    }

    @Override
    public void successfulQuery(List<Artists> artists) {
        interfacePresenter.successfulQuery(artists);

    }

    @Override
    public void onFailureResult() {
        interfacePresenter.onFailureResult();
    }
}
