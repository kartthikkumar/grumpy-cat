package com.supreet.memeworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

public class HomeActivity extends SherlockActivity {

	public Activity mActivity = this;
	ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ab = getSupportActionBar();
        setTitle("HEHE");
        ab.setHomeButtonEnabled(false);
        Button b = (Button) findViewById(R.id.list_button);
        b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(mActivity, MemeListActivity.class);
				startActivity(i);
				
			}
		});
    }     

    @Override
    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getSupportMenuInflater().inflate(R.menu.activity_home, menu);
        return true;
    }
    
}
