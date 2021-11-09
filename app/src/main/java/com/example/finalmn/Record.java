package com.example.finalmn;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Record extends AppCompatActivity {

    EditText ETFIO;
    EditText ETService;
    EditText ETDate;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        ETFIO=findViewById(R.id.editTextFIO);
        ETService=findViewById(R.id.editTextService);
        ETDate=findViewById(R.id.editTextDate);
    }

    public void buttonRecord2_Click(View view) {

       Toast.makeText(getApplicationContext(), ETFIO.getText()+" Записался\n"+"На "+ ETService.getText()+"\n"+ ETDate.getText()+" числа", Toast.LENGTH_LONG).show();
    }
}
