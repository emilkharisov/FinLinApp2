package com.example.space;

import android.content.Context;

import java.util.Random;

public class Asteroid {
    private int radius = 2; // радиус
    private float minSpeed = (float) 0.1; // минимальная скорость
    private float maxSpeed = (float) 0.5; // максимальная скорость

    public Asteroid(Context context) {
        Random random = new Random();

        Object bitmapId = R.drawable.asteroid;
        int y = 0;
        int x = random.nextInt(GameView.maxX) - radius;
        int size = radius * 2;
        float speed = minSpeed + (maxSpeed - minSpeed) * random.nextFloat();

        init(context);
        public void update() {
            y += speed;
        }
        public boolean isCollision( float shipX, float shipY, float shipSize){
            return !(((x + size) < shipX) || (x > (shipX + shipSize)) || ((y + size) < shipY) || (y > (shipY + shipSize)));
        }
    }

    private void init(Context context) {
    }

    public void update() {
    }
}


