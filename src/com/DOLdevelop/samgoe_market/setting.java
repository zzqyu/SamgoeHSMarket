package com.DOLdevelop.samgoe_market;

import com.actionbarsherlock.app.SherlockActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class setting extends SherlockActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.setting);
	    
	    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            BitmapDrawable bg = (BitmapDrawable)getResources().getDrawable(R.drawable.bg_titlebar);
            getSupportActionBar().setBackgroundDrawable(bg);

        }
	}
	    
	    
	    
	public void doldevelop(View v) {
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.facebook.com/DOLDevelop"));
		startActivity(intent);

	
    
    
    

    // TODO Auto-generated method stub
}
	public void playstore(View v) {
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("https://play.google.com/store/apps/details?id=com.DOLdevelop.samgoe_market"));
		startActivity(intent);

	
    
    
    

    // TODO Auto-generated method stub
}

}
