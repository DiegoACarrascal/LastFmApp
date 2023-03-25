package com.example.lastfmapp.Model.PopularSongs;

import com.google.gson.annotations.SerializedName;

public class HeaderSongs {

    @SerializedName("toptracks")
    private TopSongs topSongs;

    public TopSongs getTopSongs() {
        return topSongs;
    }

    public void setTopSongs(TopSongs topSongs) {
        this.topSongs = topSongs;
    }
}
