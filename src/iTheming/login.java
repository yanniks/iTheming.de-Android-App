package iTheming;

import de.itheming.app.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class login extends Activity {
	private WebView mWebView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    	mWebView = (WebView) findViewById(R.id.weblogin);
    	mWebView.getSettings().setJavaScriptEnabled(true);
    	mWebView.loadUrl("http://itheming.de/mobile.php?do=login&styleid=12");
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