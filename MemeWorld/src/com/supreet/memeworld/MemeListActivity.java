package com.supreet.memeworld;

import android.os.Bundle;
import com.actionbarsherlock.app.ActionBar;

import com.actionbarsherlock.app.SherlockActivity;

public class MemeListActivity extends SherlockActivity{
	
	ActionBar ab;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_home);
	        ab = getSupportActionBar();
	        setTitle("Pick a meme");
	        ab.setHomeButtonEnabled(true);
	    }

	    @Override
	    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getSupportMenuInflater().inflate(R.menu.activity_home, menu);
	        return true;
	    }

}
