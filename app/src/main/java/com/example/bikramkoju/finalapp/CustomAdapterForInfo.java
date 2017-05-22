package com.example.bikramkoju.finalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bikramkoju on 5/22/2017.
 */

public class CustomAdapterForInfo extends BaseAdapter {
    Context c;
    ArrayList<InfoModule> mylist;
    LayoutInflater inflater;

    public CustomAdapterForInfo(MainActivity mainActivity, ArrayList<InfoModule> list) {
        c = mainActivity;
        mylist = list;
        inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mylist.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHOld holds;
        if (convertView == null){
            convertView=inflater.inflate(R.layout.list,null);
            holds= new ViewHOld();
            holds.showTitle=(TextView)convertView.findViewById(R.id.title);
            holds.showPrice=(TextView)convertView.findViewById(R.id.price);
            convertView.setTag(holds);
        }
        else {
            holds=(ViewHOld)convertView.getTag();
        }
        holds.showTitle.setText("Title is: " + mylist.get(position).getTitle());
        holds.showPrice.setText("Price is: " + mylist.get(position).getPrice());
        return convertView;
    }
}
