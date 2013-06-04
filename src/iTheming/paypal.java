package iTheming;

import de.itheming.app.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class paypal extends Activity {
	private WebView mWebView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
    	mWebView = (WebView) findViewById(R.id.webview);
    	mWebView.getSettings().setJavaScriptEnabled(true);
    	mWebView.loadUrl("http://yanniks.de/ithemingpaypal");
    }
}