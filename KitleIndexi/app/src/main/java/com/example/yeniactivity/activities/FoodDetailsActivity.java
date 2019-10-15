package com.example.yeniactivity.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yeniactivity.R;

public class FoodDetailsActivity extends AppCompatActivity {
    ImageView image;
    TextView text_title;
    TextView text_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);
        image =(ImageView)findViewById(R.id.health_picture);
        text_title=(TextView)findViewById(R.id.healty);
        text_desc=(TextView)findViewById(R.id.health_desc);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        int picture=getIntent().getIntExtra("foodPicture",R.drawable.image4);
        String title=getIntent().getStringExtra("title");
        String desc=getIntent().getStringExtra("desc");

        image.setImageResource(picture);
        text_title.setText(title);
        text_desc.setText(desc);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
