package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Services extends AppCompatActivity {
    ImageView Cleaning,Batteries,Painting,Denting,AC,Puncture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        Cleaning=findViewById(R.id.Cleaning);
        Batteries=findViewById(R.id.Batteries);
        Painting=findViewById(R.id.Painting);
        Denting=findViewById(R.id.Denting);
        AC=findViewById(R.id.AC);
        Puncture=findViewById(R.id.Puncture);

        Cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Services.this, comingsoon.class);
                startActivity(intent);
            }
        });
        Batteries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Services.this, comingsoon.class);
                startActivity(intent);
            }
        });
        Painting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Services.this, comingsoon.class);
                startActivity(intent);
            }
        });
        Denting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Services.this, comingsoon.class);
                startActivity(intent);
            }
        });
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Services.this, comingsoon.class);
                startActivity(intent);
            }
        });
        Puncture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Services.this, comingsoon.class);
                startActivity(intent);
            }
        });
    }}