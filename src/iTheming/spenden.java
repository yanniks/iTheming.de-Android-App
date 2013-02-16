package iTheming;

import de.itheming.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class spenden extends Activity {
	private WebView mWebView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spenden);
	}       
    	public void paypal (final View view) {
	    	startActivity (new Intent (this, paypal.class));
	}
        
    }
