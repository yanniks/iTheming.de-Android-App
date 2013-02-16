package iTheming;

import de.itheming.app.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class twitter extends Activity {
	private WebView mWebView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitter);
    	mWebView = (WebView) findViewById(R.id.twitterweb);
    	mWebView.getSettings().setJavaScriptEnabled(true);
    	mWebView.loadUrl("http://twitter.com/iThemingde");
    }
}