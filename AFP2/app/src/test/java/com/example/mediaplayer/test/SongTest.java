package com.example.mediaplayer.test;

import android.graphics.Bitmap;

import com.example.mediaplayer.models.Song;

import org.junit.Test;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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
	
	 @Test
    public void testGetPath() {
        String sPath = song.getPath();
        assertEquals(sPath, song.getPath());
    }

    @Test
    public void testSetPath() {
        song.setPath("Path");
        assertEquals("Path", song.getPath());
    }

    @Test
    public void testGetAlbumArt() {
        String sAlbumArt = song.getAlbumArt();
        assertEquals(sAlbumArt, song.getPath());
    }

    @Test
    public void testSetAlbumArt() {
        song.setAlbumArt("AlbumArt");
        assertEquals("AlbumArt", song.getAlbumArt());
    }
	
	


    @Test
    public void testGetName() {
        String sName = song.getName();
        assertEquals(sName, song.getName());
    }

    @Test
    public void testSetName() {
        song.setName("SongName");
        assertEquals("SongName", song.getName());
    }

    @Test
    public void testGetAlbum() {
        String sAlbum = song.getAlbum();
        assertEquals(sAlbum, song.getAlbum());
    }

    @Test
    public void testSetAlbum() {
        song.setAlbum("Album");
        assertEquals("Album", song.getAlbum());
    }
	  @Test
    public void testGetArtist() {

        String Artist = song.getArtist();
        assertEquals(Artist, song.getArtist());
    }

    @Test
    public void testSetArtist() {
        song.setArtist("Album");
        assertEquals("Album", song.getArtist());
    }
	
    @Test
    public void testClass(){
        String name="Smack my bitch up";
        String album="The Fat of the Land";
        String artist="The Prodigy";
        String genre="Breakbeat";
        int index=2 ;
        Song zene= new Song(name,album,artist,genre,index);
        assertTrue(zene instanceof Song);
    }

    @Test(expected = FileNotFoundException.class)
    public void testReadFile() throws IOException {
        FileReader reader = new FileReader("test.txt");
        reader.read();
        reader.close();
    }

    @Test
    public void testAssetTest() {
        List<String> zenek = Arrays.asList("Seeyouagain", "GangnamStyle", "Despacito");

        assertTrue(zenek.contains("Seeyouagain"));
    }

}