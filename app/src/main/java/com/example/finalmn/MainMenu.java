package com.example.finalmn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

    }

    public void buttonMore_Click(View view) {
        Intent i = new Intent(this,News.class);
        startActivity(i);
    }

    public void buttonTest_Click(View view) {
        Intent i = new Intent(this,Test.class);
        startActivity(i);
    }

    public void buttonMedia_Click(View view) {
        Intent i = new Intent(this,Media.class);
        startActivity(i);
    }

    public void buttonRecord_Click(View view) {
        Intent i = new Intent(this,Record.class);
        startActivity(i);
    }
}
