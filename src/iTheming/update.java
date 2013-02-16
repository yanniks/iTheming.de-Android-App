package iTheming;

import de.itheming.app.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class update extends Activity {
	private WebView mWebView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update);
    	mWebView = (WebView) findViewById(R.id.webupdate);
    	mWebView.getSettings().setJavaScriptEnabled(true);
    	mWebView.loadUrl("http://yanniks.de/itheming/201.html");        
    }
}