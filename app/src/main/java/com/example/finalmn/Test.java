package com.example.finalmn;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Test extends AppCompatActivity {

    RadioButton radioButton1;
    RadioButton radioButton2;
    int counter =1;
    int score;
    Button btn;
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acriviry_test);
    }

    public void buttonNext_Click(View view) {
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        btn= findViewById(R.id.buttonNext);
        textView= findViewById(R.id.textViewQuestion);
        switch (counter) {
            case 1:
                if(radioButton1.isChecked())
                {
                    score++;
                }
                radioButton1.setText("Нет");
                radioButton2.setText("Да");
                textView.setText("Вы шизофреник?");

                counter++;
                break;
            case 2:
                if(radioButton2.isChecked())
                {
                    score++;
                }
                radioButton1.setText("Нет");
                radioButton2.setText("Да");
                textView.setText("Вы слышите голоса в голове?");
                btn.setText("Посмотреть результат");

                counter++;
                break;
            case 3:
                if(radioButton2.isChecked())
                {
                    score++;
                }
                radioButton1.setVisibility(View.GONE);
                radioButton2.setVisibility(View.GONE);
                if(score>1)
                {
                    Toast.makeText(getApplicationContext(), "Поздравляю, вы - шизофреник!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Поздравляю, вы не шизофреник!", Toast.LENGTH_LONG).show();
                }

                break;
            case 4:

                break;
    }

}

    public void buttonBackToMainMenu_Click(View view) {
        Intent i = new Intent(this,MainMenu.class);
        startActivity(i);
    }
    }
