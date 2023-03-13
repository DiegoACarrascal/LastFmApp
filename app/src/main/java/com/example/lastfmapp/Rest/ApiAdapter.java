package com.example.lastfmapp.Rest;

import com.example.lastfmapp.Interface.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiAdapter {

    private static ApiService apiService;


    public static ApiService getApiService(){

        if (apiService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(EndPoint.URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            apiService = retrofit.create(ApiService.class);
        }
        return apiService;


    }


}
