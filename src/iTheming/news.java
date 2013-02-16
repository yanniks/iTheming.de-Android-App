package iTheming;

import de.itheming.app.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class news extends Activity {
	private WebView mWebView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);
    	mWebView = (WebView) findViewById(R.id.news);
    	mWebView.getSettings().setJavaScriptEnabled(true);
    	mWebView.loadUrl("http://itheming.de/content.php?styleid=12");
    	mWebView.setWebViewClient(new LoginClient());
    }
    private class LoginClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}