package com.example.lastfmapp.Model.Entitis;

import com.google.gson.annotations.SerializedName;

public class HeaderApi {

    @SerializedName("topartists")
    private TopArtists topArtists;

    public TopArtists getTopArtists() {
        return topArtists;
    }

    public void setTopArtists(TopArtists topArtists) {
        this.topArtists = topArtists;
    }
}
