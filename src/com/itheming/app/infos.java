package com.itheming.app;

import de.itheming.app.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;

public class infos extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infos);
        getActionBar().setDisplayHomeAsUpEnabled(true);
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