package com.example.mediaplayer.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mediaplayer.R;
import com.example.mediaplayer.activities.MainActivity;


import interfaces.OnClickListen;


public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.ViewHolder> implements Filterable {
    private OnClickListen alclicklisten;
    private LayoutInflater inflater;

    public PlaylistAdapter(OnClickListen alclicklisten) {
        this.alclicklisten = alclicklisten;
        inflater=(LayoutInflater) MainActivity.getInstance().getSystemService(MainActivity.getInstance().LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public PlaylistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_playlist_layout,viewGroup,false);
        return new ViewHolder(view,alclicklisten);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaylistAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public Filter getFilter() {
        return null;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView playlist;
        private OnClickListen onClickListen;
        public ViewHolder(@NonNull View itemView,OnClickListen onClickListen) {
            super(itemView);
            playlist=itemView.findViewById(R.id.playlist_name);
            this.onClickListen=onClickListen;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onClickListen.onClick(getAdapterPosition());
        }
    }

}
