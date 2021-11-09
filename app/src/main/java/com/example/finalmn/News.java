package com.example.finalmn;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class News extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }

    public void buttonBack_Click(View view) {
        Intent i = new Intent(this,MainMenu.class);
        startActivity(i);
    }
}
