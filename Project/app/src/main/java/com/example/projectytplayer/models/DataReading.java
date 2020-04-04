package com.example.projectytplayer.models;

import android.content.Context;

import java.util.HashMap;
import java.util.List;

public class DataReading {
    private Context context;
    private HashMap<String, List<Song>> albums=new HashMap<>();
    private HashMap<String,List<Song>>Artists=new HashMap<>();


    public HashMap<String, List<Song>> getAlbums() {
        return albums;
    }

    public void setAlbums(HashMap<String, List<Song>> albums) {
        this.albums = albums;
    }
    public DataReading(Context context){
        this.context=context;
    }
}
