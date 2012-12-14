package com.supreet.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class OrionListView {
	public int icon;
	public String title;
	public Boolean hasArrow;
	
	public OrionListView(){
		super();
	}
	
	public OrionListView(String _title){
		this.icon = -1;
		this.title = _title;
		this.hasArrow = true;
	}
	
	public OrionListView(String _title, int _icon){
		this.icon = _icon;
		this.title = _title;
		this.hasArrow = true;
	}
	

}
