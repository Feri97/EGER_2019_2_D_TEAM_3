package com.example.projectytplayer;

import androidx.appcompat.app.AppCompatActivity;


import android.Manifest;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.SearchView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import android.support.design.widget.TabLayout;

import com.example.mediaplayer.fragments.AlbumsFragment;
import com.example.mediaplayer.fragments.PlaylistFragment;
import com.example.mediaplayer.models.DataReading;
import com.example.mediaplayer.notification.NotiService;
import com.example.mediaplayer.R;
import com.example.mediaplayer.models.Song;
import com.example.mediaplayer.adapters.SongAdapter;
import com.example.mediaplayer.fragments.SongsFragment;
import com.example.mediaplayer.adapters.ViewPagerAdapter;

import static com.example.mediaplayer.notification.NofiticationCenter.channel_1_ID;
import static com.example.mediaplayer.adapters.SongAdapter.songs;

public class MainActivity extends AppCompatActivity {
	private int Storage_Permission_code=1;
    private static final String TAG = "MainActivity";
     DataReading dataReading;
    protected static MainActivity instance;
   private byte arts[];

     private HashMap<String, List<Song> >albums=new HashMap<>();
     public static  ArrayList<ArrayList<Song>>al=new ArrayList<>();



    private NotificationManagerCompat notificationManager;
     MediaMetadataRetriever metadataRetriever;
    private MediaSessionCompat mediaSession;

     TabLayout tableLayout;
     ViewPager viewPager;
     protected ViewPagerAdapter viewPagerAdapter;
    LinearLayout miniplayer;
    TextView textView;
    public static   ImageView imageView;
    public static Notification notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		textView=findViewById(R.id.mini_player_title);
        tableLayout=findViewById(R.id.table_Layout);
        viewPager=findViewById(R.id.view_Pager);
        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());


        viewPagerAdapter.addFragment(new SongsFragment(),"Songs");
        viewPagerAdapter.addFragment(new PlaylistFragment(),"Playlist");
        viewPagerAdapter.addFragment(new AlbumsFragment(),"Albums");
        viewPagerAdapter.addFragment(new SongsFragment(),"Youtube");

        viewPager.setAdapter(viewPagerAdapter);
        tableLayout.setupWithViewPager(viewPager);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setElevation(0);
        imageView=findViewById(R.id.mini_player_play_pause_button);
        miniplayer=findViewById(R.id.mini_player);
        imageView.setBackgroundResource(R.drawable.play_arrow_24dp);
       intializeMini();
        notificationManager = NotificationManagerCompat.from(this);

        mediaSession = new MediaSessionCompat(this, "tag");
        instance=this;

        if(ContextCompat.checkSelfPermission(MainActivity.this,Manifest.permission.READ_EXTERNAL_STORAGE)==PackageManager.PERMISSION_DENIED){
            requestStoragePermission();
        }else {
         start();
    }
	
	public void intializeMini(){
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerActivity.getInstance().play();
                if(PlayerActivity.playin==true){
                    imageView.setBackgroundResource(R.drawable.pause_24dp);
                }else{
                    imageView.setBackgroundResource(R.drawable.play_arrow_24dp);

                }
            }
        });

        miniplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.getInstance(), PlayerActivity.class).putExtra("index", 0).putExtra("val", 0).putExtra("from",false);
                startActivity(intent);
            }
        });


    }
    public static MainActivity getInstance() {
        return instance;
    }

    private void requestStoragePermission(){
        if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.READ_EXTERNAL_STORAGE)){
            new AlertDialog.Builder(this).setTitle("Permission Needed").setMessage("Need to read songs from your storage").setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},Storage_Permission_code);

                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                }
            }).create().show();

        }else{
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},Storage_Permission_code);
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode==Storage_Permission_code){
            if(grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this,"Permission Granted",Toast.LENGTH_SHORT).show();
            start();
            }else{
                Toast.makeText(this,"Permission Denied",Toast.LENGTH_SHORT).show();

            }
        }
    }
}
