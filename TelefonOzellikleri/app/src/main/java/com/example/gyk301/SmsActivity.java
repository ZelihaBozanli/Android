package com.example.gyk301;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SmsActivity extends AppCompatActivity {

    EditText senderMessage;
    EditText receiverPhone;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        senderMessage = (EditText) findViewById(R.id.et_msj);
        receiverPhone = (EditText) findViewById(R.id.et_tel);
        send = (Button) findViewById(R.id.btn_gndr);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = senderMessage.getText().toString();
                String phoneNumber = receiverPhone.getText().toString();
                composeMmsMessage(message,phoneNumber);
            }
        });
    }

    public void composeMmsMessage(String message, String phoneNumber) {
        Uri uri = Uri.parse("smsto:" + phoneNumber);
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        intent.putExtra("sms_body", message);
        startActivity(intent);
    }
}