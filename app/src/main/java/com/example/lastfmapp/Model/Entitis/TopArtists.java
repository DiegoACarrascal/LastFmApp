package com.example.lastfmapp.Model.Entitis;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TopArtists {

    @SerializedName("artist")
    List<Artists> artist;

    public List<Artists> getArtist() {
        return artist;
    }

    public void setArtist(List<Artists> artist) {
        this.artist = artist;
    }
}
