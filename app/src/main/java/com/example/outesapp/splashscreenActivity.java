package com.example.outesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class splashscreenActivity extends AppCompatActivity {

    ImageView idIVLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(splashscreenActivity.this,detaisactivity.class);
                startActivity( i );
            }
        }, 2000);
    }

}