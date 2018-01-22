package com.DOLdevelop.samgoe_market;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class splash extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		Handler handler = new Handler() {
			@Override
			public void handleMessage(Message msg) {
				// TODO Auto-generated method stub
				super.handleMessage(msg);
				finish();
			}
		};
		handler.sendEmptyMessageDelayed(0, 2400);

	}

	// TODO Auto-generated method stub
}
