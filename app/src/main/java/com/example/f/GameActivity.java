package com.example.f;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class GameActivity extends AppCompatActivity {
    ImageView waveView, circleView,circleView2,circleView3,circleView4,circleView5,circleView6;
    Animation animation,animation2,animation3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        UsersRepo usersRepo = new UsersRepo();
//        User user = usersRepo.usersRepo.get(0);
//        int target = user.getBussines();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        waveView = findViewById(R.id.wave_view);
        circleView = findViewById(R.id.orangeCircle);
        circleView2 = findViewById(R.id.blueCircle);
        circleView3 = findViewById(R.id.fioletCircle);
        circleView4 = findViewById(R.id.yellowCircle);
        circleView5 = findViewById(R.id.goluboCircle);
        circleView6 = findViewById(R.id.orange2Circle);

        waveView.setBackgroundResource(R.drawable.wave_acnimation);
        animation = AnimationUtils.loadAnimation(this, R.anim.transl);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.transl);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.transl);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.transl);
        Animation animation4 = AnimationUtils.loadAnimation(this, R.anim.transl);
        Animation animation5 = AnimationUtils.loadAnimation(this, R.anim.transl);
        final AnimationDrawable animationDrawable = (AnimationDrawable)waveView.getBackground();
        animationDrawable.start();
        //------------> Start Animation <----------------
        animation.setDuration(7000);
        startAnim(circleView,animation);
        animation1.setStartOffset(8000);
        animation1.setDuration(7000);
        startAnim(circleView2,animation1);
        animation2.setStartOffset(16000);
        animation2.setDuration(7000);
        startAnim(circleView3,animation2);
        animation3.setStartOffset(24000);
        animation3.setDuration(7000);
        startAnim(circleView4,animation3);
        animation4.setStartOffset(32000);
        animation4.setDuration(7000);
        startAnim(circleView5,animation4);
        animation5.setStartOffset(40000);
        animation5.setDuration(7000);
        startAnim(circleView6,animation5);
        }
        public void startAnim(ImageView imageView, Animation animationForFabric){
        imageView.startAnimation(animationForFabric);
        }
}

