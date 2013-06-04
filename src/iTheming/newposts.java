package iTheming;

import de.itheming.app.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class newposts extends Activity {
	private WebView mWebView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
    	mWebView = (WebView) findViewById(R.id.webview);
    	mWebView.getSettings().setJavaScriptEnabled(true);
    	mWebView.loadUrl("http://itheming.de/search.php?do=getnew&styleid=12");
    	mWebView.setWebViewClient(new PostsClient());
    }
    private class PostsClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}