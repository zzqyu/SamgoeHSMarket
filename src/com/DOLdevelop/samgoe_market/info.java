package com.DOLdevelop.samgoe_market;

import com.actionbarsherlock.app.SherlockActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class info extends SherlockActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.info);

		// TODO Auto-generated method stub
	}

	public void where(View v) {
		Intent intent = new Intent(
				Intent.ACTION_VIEW,
				Uri.parse("http://doldevelop.tistory.com/m/19"));
		startActivity(intent);
	}
	
	public void setting(View v) {
		Intent intent = new Intent(this, setting.class);
		startActivity(intent);
	}

}
