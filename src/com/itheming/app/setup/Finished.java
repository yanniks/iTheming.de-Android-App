package com.itheming.app.setup;

import com.itheming.app.ForumBrowser;

import de.itheming.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Finished extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setupdone);
    }
	public void next (final View view) {
		startActivity (new Intent (this,ForumBrowser.class));
		finish();
}
}