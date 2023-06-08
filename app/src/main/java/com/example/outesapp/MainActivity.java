package com.example.outesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    ArrayList<model> Caategories=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {
        rcv=findViewById(R.id.rcv);

        model m1=new model();
        m1.setName("Mother");
        m1.setImage( R.drawable.i1);
        Caategories.add(m1);

        model m12=new model();
        m12.setName("Father");
        m12.setImage( R.drawable.i2);
        Caategories.add(m12);

        model m11=new model();
        m11.setName("Sister");
        m11.setImage( R.drawable.sisiter);
        Caategories.add(m11);

        model m2=new model();
        m2.setName("Sad");
        m2.setImage( R.drawable.i4);
        Caategories.add(m2);

        model m3=new model();
        m3.setName("Angry");
        m3.setImage( R.drawable.i13);
        Caategories.add(m3);

        model m4=new model();
        m4.setName("Love");
        m4.setImage( R.drawable.i5);
        Caategories.add(m4);

        model m5=new model();
        m5.setName("Car");
        m5.setImage( R.drawable.i6);
        Caategories.add(m5);

        model m6=new model();
        m6.setName("Enjoy");
        m6.setImage( R.drawable.i12);
        Caategories.add(m6);

        model m7=new model();
        m7.setName("Friends");
        m7.setImage( R.drawable.i10);
        Caategories.add(m7);

        model m8=new model();
        m8.setName("Happy");
        m8.setImage(R.drawable.i9);
        Caategories.add(m8);

        model m9=new model();
        m9.setName("beard");
        m9.setImage( R.drawable.i11);
        Caategories.add(m9);

        model m10=new model();
        m10.setName("Attitude");
        m10.setImage( R.drawable.i7);
        Caategories.add(m10);

        interface1 interface1=new interface1() {
            @Override
            public void categoriesclick(String name) {
                Intent i=new Intent(MainActivity.this,Oqtesactivity.class);
                i.putExtra( "categories",name );
                startActivity( i );
             }
        };

        Rcycleviewadpter adpter =new Rcycleviewadpter(MainActivity.this,Caategories,interface1);
        rcv.setAdapter(adpter);
        GridLayoutManager manager=new GridLayoutManager(MainActivity.this,2);
        rcv.setLayoutManager(manager);
    }
}