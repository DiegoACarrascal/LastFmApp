package com.example.lastfmapp.Rest;

public class EndPoint {


    public static final String URL_BASE="https://ws.audioscrobbler.com/";
    public static final String GET_POPULAR_ARTISTS="2.0/?method=geo.gettopartists&country=colombia&api_key=cf2894b9c73a323e24f5c6a9aab1eb85&limit=10&format=json";
    public static final String GET_POPULAR_SONGS= "2.0/?method=artist.gettoptracks&artist={nameartista}&api_key=cf2894b9c73a323e24f5c6a9aab1eb85&limit=5&format=json";

}
