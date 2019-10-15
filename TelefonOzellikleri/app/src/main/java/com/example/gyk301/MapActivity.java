package com.example.gyk301;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        findViewById(R.id.btn_map).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri geoLocation=Uri.parse("geo:41.0138400,28.9496600");
                showMap(geoLocation);


            }
        });


    }

    public void showMap(Uri geoLocation){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(geoLocation);
        if(i.resolveActivity(getPackageManager()) !=null)
        {
            startActivity(i);
        }
    }
}
