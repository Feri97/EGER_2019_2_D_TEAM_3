package com.example.mediaplayer.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mediaplayer.R;
import com.example.mediaplayer.activities.MainActivity;
import com.example.mediaplayer.adapters.PlaylistAdapter;

import interfaces.OnClickListen;

public class PlaylistFragment extends Fragment implements OnClickListen {
    protected View v;
    protected RecyclerView recyclerView;

    ///////////////HERE
    protected RecyclerView.LayoutManager mmanager;
    protected static PlaylistAdapter playlistAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.playlist_fragment,container,false);
        recyclerView = v.findViewById(R.id.playlist_recycleview);
        recyclerView.setHasFixedSize(true);
        mmanager=new GridLayoutManager(getContext(),2);
        playlistAdapter = new PlaylistAdapter(this);
        recyclerView.setLayoutManager(mmanager);
        recyclerView.setAdapter(playlistAdapter);
        return v;

    }
    @Override
    public void onClick(int position) {
        Intent intent=new Intent(MainActivity.getInstance(), PlaylistAdapter.class).putExtra("index",position);
        startActivity(intent);
    }


}
