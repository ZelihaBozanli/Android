package com.example.myaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class WelcomeActivity extends AppCompatActivity {
    private ArrayList<String> cities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ListView mListView = findViewById(R.id.listv_ozellik_id);

        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("Kocaeli");
        cities.add("Erzurum");
        cities.add("Trabzon");
        cities.add("Sivas");

        final ArrayAdapter<String> myAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, cities);


        mListView.setAdapter(myAdapter);
    }
}
