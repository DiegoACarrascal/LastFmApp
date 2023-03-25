package com.example.lastfmapp.Model.PopularSongs;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TopSongs {

    @SerializedName("track")
    List<Track> track;

    public List<Track> getTrack() {
        return track;
    }

    public void setTrack(List<Track> track) {
        this.track = track;
    }
}
