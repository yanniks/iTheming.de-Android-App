package iTheming;

import de.itheming.app.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class social extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.social);
	}       
    	public void twitter (final View view) {
    		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://twitter.com/iThemingde"));
    		startActivity(browserIntent);
	}
    	public void facebook (final View view) {
    		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com/itheming.forum"));
    		startActivity(browserIntent);
	}
        
    }
