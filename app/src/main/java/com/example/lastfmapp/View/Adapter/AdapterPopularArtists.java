package com.example.lastfmapp.View.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.lastfmapp.Model.PopularArtists.Artists;
import com.example.lastfmapp.R;
import com.example.lastfmapp.View.PopularSongs;

import java.util.List;

public class AdapterPopularArtists extends RecyclerView.Adapter<AdapterPopularArtists.viewHolderPA> {

    private List<Artists> artistsList;
    private Context context;


    public AdapterPopularArtists(List<Artists> artists, Context context) {
        this.artistsList=artists;
        this.context=context;

    }


    @NonNull
    @Override
    public AdapterPopularArtists.viewHolderPA onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_artists_list,null,false);
        return new viewHolderPA(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPopularArtists.viewHolderPA holder, int position) {

        Artists artists= artistsList.get(position);
        holder.nombre.setText(artists.getName());
        holder.oyentes.setText(artists.getListeners());
        holder.url.setText(artists.getUrl());
        String urlImage= artists.getImage().get(2).getText();
        Glide.with(context).load(urlImage).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.img);

        holder.itemView.setOnClickListener(view -> {

            Intent intent= new Intent(context, PopularSongs.class);
            intent.putExtra("nombre",artists.getName());
            context.startActivity(intent);

        });


    }

    @Override
    public int getItemCount() {
        return artistsList.size();
    }

    public class viewHolderPA extends RecyclerView.ViewHolder {

        private TextView nombre, oyentes, url;
        private ImageView img;

        public viewHolderPA(@NonNull View itemView) {
            super(itemView);
            nombre= itemView.findViewById(R.id.nombrePA);
            oyentes= itemView.findViewById(R.id.oyentesPA);
            url= itemView.findViewById(R.id.urlPA);
            img= itemView.findViewById(R.id.imagePA);

        }
    }
}
