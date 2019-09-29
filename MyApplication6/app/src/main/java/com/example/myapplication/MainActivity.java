package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        button2.setOnClickListener((View.OnClickListener) this);
    }

    public void calculation() {

        TextView textView;

        int i=0; //Индикатор заполненности до 70%
        int k=0; //Индикатор кол-ва баллов по неправильный ответам
        int j=0; //Индиактор кол-ва баллов по правильным ответам
        int z=0; //Индикатор кол-ва неправильно выбранных  ответов

        while (i!=70) {

            if (check()==) {
                i = i + 10;
            } else if(check()) {
                i=i+10;
            } else if (check()) {
                k=k-5;
            } else if (check()) {
                continue;
            }
        }
        if (z<4) {
            textView = (TextView) findViewById(R.id.textViewWin);
        } else {
            textView = (TextView) findViewById(R.id.textViewLose);
        }

        int Zdr, Obr, Cos, Arm = 0;
        while (j>0) {

        }


    }

    private boolean check(int ver) {
        if (ver==1) {
            return (true);
        } else if (ver==0){
            return (false);
        }
        return false;
    }

    public void onClick(View v) {
        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе
        switch (v.getId()) {
            case R.id.button1:
                check(1);
                break;
            case R.id.button2:
                check(0);
                break;

            default:
                break;
        }}
}
