package com.example.mediaplayer.test;

import android.graphics.Bitmap;

import com.example.mediaplayer.models.Song;

import org.junit.Test;

import static org.junit.Assert.*;

public class SongTest extends Song {

    Song song = new Song();

    @Test
    public void testGetAlbumID() {
        long songAlbumId = song.getAlbumID();
        assertEquals(songAlbumId,song.getAlbumID());
    }

    @Test
    public void testSetAlbumID() {
        for (int i = 1000; i < 1056; i++){
            song.setAlbumID(i);
            assertEquals(i,song.getAlbumID());
        }
    }

    @Test
    public void testGetIm() {
        int Im = song.getIm();
        assertEquals(Im,song.getIm());
    }

    @Test
    public void testSetIm() {
        for (int i = 1000; i < 1056; i++){
            song.setIm(i);
            assertEquals(i,song.getIm());
        }
    }



}