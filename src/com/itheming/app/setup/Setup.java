package com.itheming.app.setup;

import com.itheming.app.ForumBrowser;

import de.itheming.app.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

@SuppressLint("CommitPrefEdits")
public class Setup extends Activity {
    SharedPreferences prefs;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        prefs = getSharedPreferences("de.itheming.app", MODE_PRIVATE);
    }
	public void skip (final View view) {
		prefs.edit().putBoolean("nosetup", false).commit();
    	startActivity (new Intent (this,ForumBrowser.class));
    	finish();
}
	public void next (final View view) {
		startActivity (new Intent (this,Login.class));
		finish();
}
}