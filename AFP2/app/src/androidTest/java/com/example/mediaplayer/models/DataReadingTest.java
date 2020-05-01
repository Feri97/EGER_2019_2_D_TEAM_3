package com.example.mediaplayer.models;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.hamcrest.collection.IsMapContaining;

import com.example.mediaplayer.models.DataReading;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DataReadingTest  {
    private Context context;
    private HashMap<String, List<Song>> albums=new HashMap<>();
    private HashMap<String,List<Song>>Artists=new HashMap<>();
    private Song song1=new Song("alpa","alpa1","alpachino","rap",1);
    private List<Song> songs=new ArrayList<Song>();


    DataReading dR=new DataReading(context);


    @Test
    public void testGetAlbums() {
        assertEquals(albums,dR.getAlbums());

    }

    @Test
    public void setAlbums() {
        songs.add(song1);
        albums.put("first", songs);
        dR.setAlbums(albums);
        assertThat(dR.getAlbums(),is (albums));
    }



    @Test
    public void getAllAudioFromDevice() {
    }
}