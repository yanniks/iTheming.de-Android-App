package iTheming;

import de.itheming.app.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class facebook extends Activity {
	private WebView mWebView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facebook);
    	mWebView = (WebView) findViewById(R.id.fbweb);
    	mWebView.getSettings().setJavaScriptEnabled(true);
    	mWebView.loadUrl("http://facebook.com/itheming.forum");
    }
}