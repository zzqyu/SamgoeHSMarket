package com.DOLdevelop.samgoe_market.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.DOLdevelop.samgoe_market.R;
import com.actionbarsherlock.app.SherlockActivity;

public class Project2 extends SherlockActivity {
	WebView mWeb;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.project);
		button1();
		button2();
		button3();
		mWeb = (WebView)findViewById(R.id.item_image);
		mWeb.setWebViewClient(new MyWebClient());
		WebSettings set = mWeb.getSettings();
		set.setBuiltInZoomControls(true);
		mWeb.loadUrl("http://blogfiles.naver.net/20130715_40/wjdrb0626_13738433921129T8vp_JPEG/project2.jpg");
	}

	public void button1(View v) {
		Intent intent = new Intent(this,
				com.DOLdevelop.samgoe_market.Workbook.Item_Workbook1_1.class);
		startActivity(intent);
	}
	
	public void button2(View v) {
		Intent intent = new Intent(this,
				com.DOLdevelop.samgoe_market.Workbook.Item_Workbook1_2.class);
		startActivity(intent);
	}
	
	public void button3(View v) {
		Intent intent = new Intent(this,
				com.DOLdevelop.samgoe_market.Workbook.Item_Workbook1_3.class);
		startActivity(intent);
	}
	

	void button1() {
		TextView result = (TextView) findViewById(R.id.button1);
		result.setText("수능특강");
	}
	
	void button2() {
		TextView result = (TextView) findViewById(R.id.button2);
		result.setText("인터넷수능");
	}
	
	void button3() {
		TextView result = (TextView) findViewById(R.id.button3);
		result.setText("수능N제");
	}
	class MyWebClient extends WebViewClient {
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	}
	
}