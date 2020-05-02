package com.example.mediaplayer.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class SongTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void compareTo() {

        assertEquals(0,("asd").compareTo("asd"));
        assertEquals(-1, ("asd").compareTo("asdf"));
        assertEquals(1, ("asdf").compareTo("asd"));
    }

    @Test
    public void compareToFail() {

        assertNotEquals(0,("asdf").compareTo("asd"));
        assertNotEquals(-1, ("asd").compareTo("asd"));
        assertNotEquals(1, ("asd").compareTo("asd"));
    }
}