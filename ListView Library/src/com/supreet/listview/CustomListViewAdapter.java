package com.supreet.listview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListViewAdapter extends ArrayAdapter<OrionListView>{

	Context context; 
    int layoutId;    
    OrionListView data[] = null;
	
	public CustomListViewAdapter(Context _context, int _layoutId, OrionListView[]	 _data) {
		super(_context, _layoutId, _data);
		this.context = _context;
		this.layoutId = _layoutId;
		this.data = _data;
	}
	
	@Override
	public View getView(int position, View _view, ViewGroup _viewGroup) {
        View row = _view;
        OrionConfigData data = null;
        
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutId, _viewGroup, false);
            
            holder = new OrionConfigData();
            holder.imgIcon = (ImageView)row.findViewById(R.id.list_image);
            holder.txtTitle = (TextView)row.findViewById(R.id.title);
            
            row.setTag(holder);
        }
        else
        {
            holder = (WeatherHolder)row.getTag();
        }
        
        Weather weather = data[position];
        holder.txtTitle.setText(weather.title);
        holder.imgIcon.setImageResource(weather.icon);
        
        return row;
    }
    
    static class OrionConfigData
    {
        ImageView imgIcon;
        TextView txtTitle;
        ImageView arrowIcon;
    }
	
	
	

}
