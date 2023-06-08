package com.example.outesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class detaisactivity extends AppCompatActivity {

    CheckBox chb123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detaisactivity );
        initview();
    }

    private void initview() {
        chb123=findViewById( R.id.chb123 );
        chb123.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(detaisactivity.this,Loginactivity.class);
                startActivity( i );
            }
        } );


    }
}