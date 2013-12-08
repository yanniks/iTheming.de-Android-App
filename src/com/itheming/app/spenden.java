package com.itheming.app;

import de.itheming.app.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

public class spenden extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spenden);
        getActionBar().setDisplayHomeAsUpEnabled(true);
	}
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        	{
        	       switch (item.getItemId()) 
        	        {
        	        case android.R.id.home: 
        	            onBackPressed();
        	            break;
        	        default:
        	}
        	}
    		return false;
        }
    }
