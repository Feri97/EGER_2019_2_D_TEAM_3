package com.example.mediaplayer.notification;

import android.content.Context;
import android.content.Intent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChannelTest {

    Channel channel = new Channel();
    Context context;
    Intent intent;

    @Before
    public void setUp() throws Exception {
        Channel channel = new Channel();
    }

    @After
    public void tearDown() throws Exception {
        channel = null;
    }

    @Test
    public void onReceive() {
        channel.onReceive(context, intent);
    }
}