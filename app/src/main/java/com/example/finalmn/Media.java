package com.example.finalmn;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Media extends AppCompatActivity {

    VideoView videoView;
    MediaPlayer mediaPlayer;
    AudioManager audioManager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        videoView = findViewById(R.id.videoView);
        Uri videoUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.scp);
        videoView.setVideoURI(videoUri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoView);

        mediaPlayer = MediaPlayer.create(this,R.raw.zvuki);

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                stopPlay();
            }
        });
    }
    private void stopPlay() {
        mediaPlayer.stop();
        try{
            mediaPlayer.prepare();
            mediaPlayer.seekTo(0);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void btnPlay_onClick(View view) {
        mediaPlayer.start();
    }

    public void btnPause_onClick(View view) {mediaPlayer.pause(); }

    public void btnStop_onClick(View view) {
        stopPlay();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer.isPlaying()){stopPlay();}
    }
}
