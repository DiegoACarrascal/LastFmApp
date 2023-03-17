package com.example.lastfmapp.View.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lastfmapp.Model.PopularSongs.Track;
import com.example.lastfmapp.R;

import java.util.List;

public class AdapterPopularSongs extends RecyclerView.Adapter<AdapterPopularSongs.viewHolderPS> {

    private List<Track> trackList;
    private Context context;


    public AdapterPopularSongs(List<Track> tracks, Context context) {
        this.context=context;
        this.trackList=tracks;

    }

    @NonNull
    @Override
    public AdapterPopularSongs.viewHolderPS onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_songs_list,null,false);
        return new viewHolderPS(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPopularSongs.viewHolderPS holder, int position) {

        Track track= trackList.get(position);
        holder.nombre.setText(track.getName());
        holder.reproducciones.setText(track.getPlaycount());
        holder.url.setText(track.getUrl());




    }

    @Override
    public int getItemCount() {
        return trackList.size();
    }

    public class viewHolderPS extends RecyclerView.ViewHolder {

        private TextView nombre, reproducciones, url;

        public viewHolderPS(@NonNull View itemView) {
            super(itemView);
            nombre= itemView.findViewById(R.id.nombrePS);
            reproducciones= itemView.findViewById(R.id.oyentesPS);
            url=itemView.findViewById(R.id.urlPS);
        }
    }
}
