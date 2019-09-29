package com.example.finlinapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageButton playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = findViewById(R.id.btnPlay);
    }

    public void onClickBtnPlay(View view){
        Intent intent = new Intent("com.example.finlin.FirstMenuActivity");
        startActivity(intent);
    }
}
