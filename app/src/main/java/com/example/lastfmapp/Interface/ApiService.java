package com.example.lastfmapp.Interface;

import com.example.lastfmapp.Model.PopularArtists.HeaderApi;
import com.example.lastfmapp.Model.PopularSongs.HeaderSongs;
import com.example.lastfmapp.Rest.EndPoint;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {


    @GET(EndPoint.GET_POPULAR_ARTISTS)
    Call<HeaderApi> obtenerArtistasPopulares();

    @GET(EndPoint.GET_POPULAR_SONGS)
    Call<HeaderSongs> getCancionesPopulares(@Path("nameartista") String nameartista);






}
