package com.example.lastfmapp.Interface;

import com.example.lastfmapp.Model.PopularArtists.HeaderApi;
import com.example.lastfmapp.Rest.EndPoint;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {


    @GET(EndPoint.GET_POPULAR_ARTISTS)
    Call<HeaderApi> obtenerArtistasPopulares();






}
