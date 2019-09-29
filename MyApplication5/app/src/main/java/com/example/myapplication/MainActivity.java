package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.jgabrielfreitas.core.BlurImageView;

public class MainActivity extends AppCompatActivity {

    private BlurImageView blur_img;
    private ImageButton play, stop;
    private MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blur_img =(BlurImageView)findViewById(R.id.bg_blur);
        blur_img.setBlur(5);

        play = (ImageButton) findViewById(R.id.playButton);
        stop = (ImageButton) findViewById(R.id.stopButton);
        audio = MediaPlayer.create(getApplicationContext(), R.raw.muz);

   }

   /*public void OnClickBth(View v){
        switch (v.getId()){
            case R.id.playButton:
                if (audio==null){
                    audio.start();
                    play.setImageResource(R.drawable.pause);
                } else if (audio.isPlaying()) {
                    audio.pause();
                    pausePos = audio.getCurrentPosition();
                }
                break;
            case R.id.stopButton:
                if(audio!=null) {
                    audio.stop();
                    audio = null;
                }
                break;
        }
   }*/
}

