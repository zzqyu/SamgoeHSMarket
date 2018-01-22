package com.DOLdevelop.samgoe_market.Sundies;

import com.DOLdevelop.samgoe_market.R;
import com.actionbarsherlock.app.SherlockActivity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Image_Sundies2_17 extends SherlockActivity {
	WebView mWeb;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item_image);

		mWeb = (WebView)findViewById(R.id.item_image);
		mWeb.setWebViewClient(new MyWebClient());
		WebSettings set = mWeb.getSettings();
		set.setBuiltInZoomControls(true);
		mWeb.loadUrl("http://blogfiles.naver.net/20130716_246/wjdrb0626_1373953730758hyu6Y_JPEG/17.JPG");
	}

	
	
	class MyWebClient extends WebViewClient {
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	}
}