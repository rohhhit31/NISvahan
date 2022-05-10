package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Splashscreen extends AppCompatActivity {
    private static int SPLASH_SCREEN =3000;
//variables
    Animation topAnim , bottomAnim;
    ImageView image;
    TextView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove the status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);

        topAnim= AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

//        image=findViewById(R.id.imageView);
//        logo=findViewById(R.id.textView7);
image =(ImageView) findViewById(R.id.imageView2);
logo =(TextView) findViewById(R.id.textView7);
        //assigning
        //(i have interchanged the names of splash and main in intent filter in manifest files.... reminder )
        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);

        // intent to call out the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent0= new Intent(Splashscreen.this,MainActivity.class);
                startActivity(intent0);
                finish();

            }
        },SPLASH_SCREEN);
    }
}