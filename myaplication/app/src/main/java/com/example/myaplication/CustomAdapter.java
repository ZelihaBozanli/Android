package com.example.myaplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter<Cont> extends BaseAdapter {

    private List<NewsModel> mList;
    private Context mContext;

    public CustomAdapter(Context context ,List<NewsModel>list)
    {
        this.mContext=context;
        this.mList=list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final NewsModel model = mList.get(i);
        CustomAdapter.Holder holder;

        if (view == null) {
            holder = new CustomAdapter.Holder();

            view = LayoutInflater.from(mContext).inflate(R.layout.item_news,null);
            holder.tvTitle = (TextView) view.findViewById(R.id.tv_title);
            holder.tvDesc = (TextView) view.findViewById(R.id.tv_desc);
            view.setTag(holder);


        }else
        {
            holder= (CustomAdapter.Holder)view.getTag();
        }
        holder.tvTitle.setText(model.getTitle());
        holder.tvDesc.setText(model.getDesc());
        return view;
    }

    public class Holder {
        TextView tvTitle;
        TextView tvDesc;
    }
}