package com.example.gyk301;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button openPhotoandVideo;
    Button openVoice;
    Button openMap;
    Button openWeb;
    Button dialcall;
    Button sendSms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openPhotoandVideo = (Button) findViewById(R.id.btn_foto);
        openPhotoandVideo.setOnClickListener(this);
        openVoice = (Button) findViewById(R.id.btn_ses);
        openVoice.setOnClickListener(this);
        openMap = (Button) findViewById(R.id.btn_harita);
        openMap.setOnClickListener(this);
        openWeb = (Button) findViewById(R.id.btn_web);
        openWeb.setOnClickListener(this);
        dialcall = (Button) findViewById(R.id.btn_arama);
        dialcall.setOnClickListener(this);
        sendSms = (Button) findViewById(R.id.btn_sms);
        sendSms.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v==openPhotoandVideo) {
            Intent i=new Intent(MainActivity.this,CameraActivity.class);
            startActivity(i);

        }
        else if(v==openVoice) {
            Intent i=new Intent(MainActivity.this,VoiceActivity.class);
            startActivity(i);

        }

        else if(v==openMap) {
            Intent i=new Intent(MainActivity.this,MapActivity.class);
            startActivity(i);

        }

        else if(v==openWeb) {
            Intent i=new Intent(MainActivity.this,WebActivity.class);
            startActivity(i);

        }

        else if(v==dialcall) {
            Intent i=new Intent(MainActivity.this,CallActivity.class);
            startActivity(i);

        }

        else if(v==sendSms) {
            Intent i=new Intent(MainActivity.this,SmsActivity.class);
            startActivity(i);

        }


        }

    }

