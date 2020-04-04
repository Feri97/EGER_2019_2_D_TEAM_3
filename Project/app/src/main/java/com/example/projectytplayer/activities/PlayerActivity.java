package com.example.projectytplayer.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.palette.graphics.Palette;

import com.example.projectytplayer.notification.NotificationCenter;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerActivity extends AppCompatActivity {

    public static boolean playin;
    private ArrayList<Song> Asongs;
    private static SeekBar mSeekBar;
    private static PlayerActivity instance;
    int position;
    private static TextView curTime,totTime;
    private TextView songTitle,artistname;
    private static ImageView pause,prev,next;
    private ImageView imageView;
    protected int val;
    protected boolean place;
    private Palette.Swatch DarkVibrantSwatch;
    private Palette.Swatch darkMutedSwatch;


    protected NotificationCenter nofiticationCenter;
    protected LinearLayout linearLayout,linear1;
    private static MediaPlayer mMediaPlayer;

    public int getPosition() {
        return position;
    }


    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        nofiticationCenter = new NotificationCenter();
        mSeekBar = findViewById(R.id.seek);
        songTitle = findViewById(R.id.song_name);
        artistname = findViewById(R.id.artist_name);
        totTime = findViewById(R.id.total_time);
        pause = findViewById(R.id.pause);
        linearLayout = findViewById(R.id.linear_layout);
        prev = findViewById(R.id.previous);
        next = findViewById(R.id.next);
        curTime = findViewById(R.id.current_time);
        imageView = findViewById(R.id.imageplayer);
        linear1=findViewById(R.id.linear1);
        Intent i = getIntent();
        Bundle bundle = i.getExtras();
        position = bundle.getInt("index");
        val = bundle.getInt("val");
        place = bundle.getBoolean("from");
        if(instance!=null&&place==false){
            songTitle.setText(instance.songTitle.getText());
            artistname.setText(instance.artistname.getText());
            totTime.setText(instance.totTime.getText());
            curTime.setText(instance.curTime.getText());
            imageView.setImageDrawable(instance.imageView.getDrawable());
            initiateSeekBar();
            Asongs=instance.Asongs;
            position=instance.position;
            setBackground();
        }else {
            if (mMediaPlayer != null) {
                mMediaPlayer.stop();
            }
            instance = this;
            if (val == 1) {
                Asongs = SongAlbumAdapter.albumSong;
            } else if (val == 2) {
                Asongs = com.example.mediaplayer.adapters.SongAdapter.songs;
                Collections.shuffle(Asongs);
            } else {
                Asongs = com.example.mediaplayer.adapters.SongAdapter.songs;
            }
            if (Asongs.get(position).getName() == "shufflee")
                position = (position + 1) % Asongs.size();
            initPlayer(position);
            MainActivity.imageView.setBackgroundResource(R.drawable.pause_24dp);
        }
        Buttons();


    }

    public static PlayerActivity getInstance() {
        return instance;
    }

    public static void initiateSeekBar(){
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mMediaPlayer.seekTo(progress*1000);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void play() {

        if (mMediaPlayer != null && !mMediaPlayer.isPlaying()) {
            playin=true;
            mMediaPlayer.start();
            pause.setBackgroundResource(R.drawable.pause_24dp);
            MainActivity.getInstance().sendOnChannel( Asongs.get(position).getName(), Asongs.get(position).getArtist(),position);
            MainActivity.imageView.setBackgroundResource(R.drawable.pause_24dp);
        } else {
            pause();
        }

    }

    public void pause() {
        if (mMediaPlayer.isPlaying()) {
            playin=false;
            mMediaPlayer.pause();
            pause.setBackgroundResource(R.drawable.play_arrow_24dp);
            MainActivity.getInstance().sendOnChannel( Asongs.get(position).getName(), Asongs.get(position).getArtist(),position);
            MainActivity.imageView.setBackgroundResource(R.drawable.play_arrow_24dp);
        }

    }


    public void setBackground(){
        Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();

        Palette.from(bitmap).maximumColorCount(32).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                DarkVibrantSwatch = palette.getDarkVibrantSwatch();
                darkMutedSwatch = palette.getDarkMutedSwatch();
                if (DarkVibrantSwatch!= null) {
                    linearLayout.setBackgroundColor( DarkVibrantSwatch.getRgb());
                    linear1.setBackgroundColor( DarkVibrantSwatch.getRgb());

                } else {
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    linear1.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                }
            }
        });
    }

    public static boolean isPlayin() {
        return playin;
    }
}



