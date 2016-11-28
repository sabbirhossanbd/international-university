package com.example.saabir.internationaluniversityinfo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by saabir on 10/23/16.
 */

public class InternationalAdapter extends BaseAdapter {

    String[] names;
    String[] link;
    int[] varsityimg;
     Context context;


    public static LayoutInflater inflater = null;

    public InternationalAdapter(InternationalActivity internationalActivity, String[]namez,String[] links,int[]imagess){
        names = namez;
        link = links;
        varsityimg = imagess;
        context = internationalActivity;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }




    public class MyHolder{
        TextView txt;
        ImageView img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        MyHolder holder = new MyHolder();
        View view;

        view = inflater.inflate(R.layout.international_layout,null);
        holder.txt =(TextView) view.findViewById(R.id.txtInternational);
        holder.img =(ImageView) view.findViewById(R.id.imageInternational);

        holder.txt.setText(names[position]);
        holder.img.setImageResource(varsityimg[position]);

        return view;

    }
}
