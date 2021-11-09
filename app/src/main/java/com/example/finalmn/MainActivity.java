package com.example.finalmn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.load);
        imageView.startAnimation(animation);

        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(4);
                    Intent i = new Intent(MainActivity.this,MainMenu.class);
                    startActivity(i);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }; thread.start();
    }
}