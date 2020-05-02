package com.example.mediaplayer.activities;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.view.View;

import com.example.mediaplayer.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

public class AlbumActivityTest {

    @Rule
    public ActivityTestRule<AlbumActivity> aActivityTestRule= new ActivityTestRule<AlbumActivity>(AlbumActivity.class);
    private AlbumActivity aActivity=null;


    @Before
    public void setUp() throws Exception {
        aActivity=aActivityTestRule.getActivity();
    }

    @Test
    public void test1() {
        View view=aActivity.findViewById(R.id.mini_player_title);
        assertNotNull(view);
    }

    @Test
    public void test2(){
        aActivityTestRule.launchActivity(new Intent());
        onView(withId(R.id.mini_player_image)).perform(click());
    }


    @After
    public void tearDown() throws Exception {
        aActivity = null;
    }

}