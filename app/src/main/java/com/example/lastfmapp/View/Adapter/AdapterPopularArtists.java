package com.example.lastfmapp.View.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lastfmapp.Model.Entitis.Artists;
import com.example.lastfmapp.R;

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
