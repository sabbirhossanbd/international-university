package com.example.saabir.internationaluniversityinfo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

import static com.example.saabir.internationaluniversityinfo.InternationalAdapter.inflater;
import static java.lang.System.in;

/**
 * Created by saabir on 11/14/16.
 */

public class PublicUnAdapter extends BaseAdapter {
    String[] name;
    String[] link;
    int[] image;
    Context context;

    public PublicUnAdapter(PublicActivity publicActivity,String[] names,String[] links,int[] images){

        name= names;
        link= links;
        image=images;
        context=publicActivity;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return name.length;
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
        TextView textView;
        ImageView imageView;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        MyHolder holder = new MyHolder();
        View view;
        view=inflater.inflate(R.layout.public_layout,null);
        holder.textView=(TextView) view.findViewById(R.id.txtPublic);
        holder.imageView=(ImageView) view.findViewById(R.id.imagePublic);

        holder.textView.setText(name[position]);
        holder.imageView.setImageResource(image[position]);

        return view;
    }
}
