package com.example.mediaplayer.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.example.mediaplayer.R;
import com.example.mediaplayer.activities.MainActivity;
import com.example.mediaplayer.models.Song;

import java.util.ArrayList;

import interfaces.OnClickListen;

import static com.example.mediaplayer.adapters.SongAdapter.myfont;

public class SongPlaylistAdapter extends RecyclerView.Adapter<SongPlaylistAdapter.ViewHolder> implements Filterable {

    private OnClickListen alclicklisten;
    public static ArrayList<Song> playlistSong;
    private static LayoutInflater inflater=null;
    public SongPlaylistAdapter(ArrayList<Song>playlistSong,OnClickListen alclicklisten){
        this.alclicklisten = alclicklisten;
        inflater=(LayoutInflater) MainActivity.getInstance().getSystemService(MainActivity.getInstance().LAYOUT_INFLATER_SERVICE);
        this.playlistSong=playlistSong;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_song_layout,viewGroup,false);
        return new SongPlaylistAdapter.ViewHolder(view,alclicklisten);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Song song= playlistSong.get(i);
        viewHolder.textView.setText(" -  "+song.getName());

    }

    @Override
    public int getItemCount() {
        return playlistSong.size();
    }

    @Override
    public Filter getFilter() {
        return null;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView textView;
        OnClickListen onClickListen;
        public ViewHolder(@NonNull View itemView, OnClickListen onClickListen) {
            super(itemView);
            textView=itemView.findViewById(R.id.text_song);
            textView.setTypeface(myfont);
            this.onClickListen=onClickListen;
            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            onClickListen.onClick(getAdapterPosition());
        }
    }
}
