package iTheming;

import de.itheming.app.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class pn extends Activity {
	private WebView mWebView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pn);
    	mWebView = (WebView) findViewById(R.id.pn);
    	mWebView.getSettings().setJavaScriptEnabled(true);
    	mWebView.loadUrl("http://itheming.de/private.php?folderid=0&styleid=12");
    	mWebView.setWebViewClient(new RegisterClient());
    }
    private class RegisterClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}