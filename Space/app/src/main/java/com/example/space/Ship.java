package com.example.space;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Ship {
    public Ship(Context context) {
        bitmapId = R.drawable.ship; // определяем начальные параметры
        size = 5;
        x=7;
        y=GameView.maxY - size - 1;
        speed = (float) 0.2;

        init(context); // инициализируем корабль
    }
    @Override
    public void update() { // перемещаем корабль в зависимости от нажатой кнопки
        if(MainActivity.isLeftPressed && x >= 0){
            x -= speed;
        }
        if(MainActivity.isRightPressed && x <= GameView.maxX - 5){
            x += speed;
        }
    }

    public void drow(Paint paint, Canvas canvas) {
    }
}
