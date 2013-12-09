package com.itheming.app.setup;

import de.itheming.app.R;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Login extends Activity {
    private WebView mWebView;
    SharedPreferences prefs;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
    	mWebView = (WebView) findViewById(R.id.webview);
    	mWebView.getSettings().setJavaScriptEnabled(true);
    	mWebView.loadUrl("http://itheming.com/index.php/Login/");
    	mWebView.setWebViewClient(new LoginClient());
        mWebView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                mWebView.loadUrl("file:///android_asset/" + getString(R.string.local) + "-error.html");

            }
        });
    	prefs = getSharedPreferences("de.itheming.app", MODE_PRIVATE);
    }
    private class LoginClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.login, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action buttons
        switch(item.getItemId()) {
        case R.id.next:
        	startActivity (new Intent (this,Finished.class));
        	prefs.edit().putBoolean("nosetup", false).commit();
        	finish();
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}