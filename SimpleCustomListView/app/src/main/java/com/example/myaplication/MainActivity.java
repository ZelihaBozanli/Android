package com.example.myaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btnListview =  findViewById(R.id.btn_listview);
       Button btnYonlendir=findViewById(R.id.btn_yonlendir);

       btnListview.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(MainActivity.this, SecondActivity.class);
               startActivity(i);


           }
       });

       btnYonlendir.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(MainActivity.this,DirectionsActivity.class);
               startActivity(i);
           }
       });

    }
}
