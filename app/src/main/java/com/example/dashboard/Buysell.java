package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Buysell extends AppCompatActivity {
    ImageView Bicycle,scooter,Car,Bus,Auto1,EV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buysell);
        Bicycle=findViewById(R.id.Bicycle);
        scooter=findViewById(R.id.scooter);
        Car=findViewById(R.id.Car);
        Bus=findViewById(R.id.Bus);
        Auto1=findViewById(R.id.Auto1);
        EV=findViewById(R.id.EV);

        Bicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buysell.this, comingsoon.class);
                startActivity(intent);
            }
        });
        scooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buysell.this, comingsoon.class);
                startActivity(intent);
            }
        });
        Car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buysell.this, comingsoon.class);
                startActivity(intent);
            }
        });
        Bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buysell.this, comingsoon.class);
                startActivity(intent);
            }
        });
        Auto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buysell.this, comingsoon.class);
                startActivity(intent);
            }
        });
        EV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buysell.this, comingsoon.class);
                startActivity(intent);
            }
        });
    }}