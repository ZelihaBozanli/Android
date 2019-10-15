package com.example.yeniactivity.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.yeniactivity.R;
import com.example.yeniactivity.activities.FoodDetailsActivity;
import com.example.yeniactivity.adapters.DietListAdapter;
import com.example.yeniactivity.models.DietModel;

import java.util.ArrayList;
import java.util.List;




public class DietListFragment extends Fragment {
    final  List<DietModel> dietModelList=new ArrayList<>();



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_diet_list,null);
        dietModelList.add(new DietModel(R.drawable.image1,"menu1","500c",getString(R.string.title_elma)));
        dietModelList.add(new DietModel(R.drawable.image2,"menu2","500c",getString(R.string.title_armut)));
        dietModelList.add(new DietModel(R.drawable.images3,"menu3","500c",getString(R.string.title_karpuz)));


        ListView myDietList=(ListView)view.findViewById(R.id.list_fragment_diet_listview);
        myDietList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DietModel diet=dietModelList.get(position);
                Intent intent=new Intent(getActivity(), FoodDetailsActivity.class);

                intent.putExtra("title",diet.getFoodName());
                intent.putExtra("desc",diet.getFoodDesc());
                intent.putExtra("picture",diet.getFoodPicture());

                startActivity(intent);
            }
        });
        DietListAdapter dietListAdapter=new DietListAdapter(getLayoutInflater(),dietModelList);
        myDietList.setAdapter(dietListAdapter);
        return view;
    }




}
