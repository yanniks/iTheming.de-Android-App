package com.itheming.app;

import de.itheming.app.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class infos extends Activity {
    private GestureDetector gestureDetector;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infos);
        gestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onDoubleTap(MotionEvent e) {
                Toast.makeText(infos.this, getString(R.string.easteregg), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (!gestureDetector.onTouchEvent(event))
            return super.onTouchEvent(event);
        return true;
    }
	public void spenden (final View view) {
    	startActivity (new Intent (this,spenden.class));
}
	public void changelog (final View view) {
		startActivity (new Intent (this,changelog.class));
}
	public void twitter (final View view) {
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://twitter.com/iThemingde"));
		startActivity(browserIntent);
}
	public void facebook (final View view) {
 	   try {
 		 Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/187629521290702")); 
 		 startActivity(facebookIntent);
   	   } catch (Exception e) {
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com/itheming.forum"));
		startActivity(browserIntent);
   	   }
}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	{
    	       switch (item.getItemId()) 
    	        {
    	        case android.R.id.home: 
    	            finish();
    	            startActivity (new Intent (this,ForumBrowser.class));
    	            break;
    	        default:
    	}
    	}
		return false;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) 
   {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) 
        {
        	finish();
        	startActivity (new Intent (this,ForumBrowser.class));
        }
        return super.onKeyDown(keyCode, event);
   }
}