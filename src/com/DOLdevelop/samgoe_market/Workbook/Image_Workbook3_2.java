package com.DOLdevelop.samgoe_market.Workbook;

import com.DOLdevelop.samgoe_market.R;
import com.DOLdevelop.samgoe_market.Workbook.Image_Workbook1_1.MyWebClient;
import com.actionbarsherlock.app.SherlockActivity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Image_Workbook3_2 extends SherlockActivity {
	WebView mWeb;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item_image);

		mWeb = (WebView)findViewById(R.id.item_image);
		mWeb.setWebViewClient(new MyWebClient());
		WebSettings set = mWeb.getSettings();
		set.setBuiltInZoomControls(true);
		mWeb.loadUrl("http://blogfiles.naver.net/20130713_182/wjdrb0626_1373683447479fjkbS_JPEG/207194125s.jpg");
	}

	
	
	class MyWebClient extends WebViewClient {
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	}
}