package com.example.yeniactivity.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yeniactivity.R;
import com.example.yeniactivity.models.DietModel;

import org.w3c.dom.Text;

import java.util.List;

public class DietListAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<DietModel>dietList;

    public DietListAdapter(LayoutInflater layoutInflater,List<DietModel>dietList) {
        this.layoutInflater = layoutInflater;
        this.dietList=dietList;
    }

    @Override
    public int getCount() {
        return dietList.size();
    }

    @Override
    public Object getItem(int position) {
        return dietList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View dietView=layoutInflater.inflate(R.layout.item_diet_layout,null);
        ImageView foodPicture=(ImageView)dietView.findViewById(R.id.custom_diet_food_picture);
        TextView foodName=(TextView)dietView.findViewById(R.id.custom_diet_food_name);
        TextView foodCalorie =(TextView)dietView.findViewById(R.id.custom_diet_food_calorie);

        DietModel diet=dietList.get(position);
        foodPicture.setImageResource(diet.getFoodPicture());
        foodName.setText(diet.getFoodName());
        foodCalorie.setText(diet.getTotalCalorie());

        return dietView;
    }

}
