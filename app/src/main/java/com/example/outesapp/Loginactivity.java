package com.example.outesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Loginactivity extends AppCompatActivity {
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        Initview();
    }

    private void Initview() {
        btnregister=findViewById( R.id.btnregister );
        btnregister.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Loginactivity.this,MainActivity.class);
                startActivity( i );
            }
        } );
    }
}