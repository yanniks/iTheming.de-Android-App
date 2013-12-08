package iTheming;

import de.itheming.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class changelog extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.changelog);
    }
    public void changelog_10 (final View view) {
    	startActivity (new Intent (this, changelog_10.class));
    }
    public void changelog_20 (final View view) {
    	startActivity (new Intent (this, changelog_20.class));
    }
    public void changelog2 (final View view) {
    	startActivity (new Intent (this, changelog2.class));
    }

}