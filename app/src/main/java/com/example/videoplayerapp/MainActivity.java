package com.example.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    VideoView videoView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    videoView  = findViewById(R.id.videoview);
    videoView2 = findViewById(R.id.videoview2);
//URL local
    videoView.setVideoPath("android/resource://" + getPackageName() + "/" + R.raw.fragments);
        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);

    // URL external
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=fis26HvvDII&t=23s");
        videoView2.setVideoURI(uri);
        MediaController mc2 = new MediaController(this);
        mc2.setAnchorView(videoView2);
        mc2.setMediaPlayer(videoView2);
        videoView2.setMediaController(mc2);
//        videoView2.start();
    }
}