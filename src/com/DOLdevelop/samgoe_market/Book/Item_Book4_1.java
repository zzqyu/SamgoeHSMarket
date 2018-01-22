package com.DOLdevelop.samgoe_market.Book;

import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

import com.DOLdevelop.samgoe_market.R;
import com.actionbarsherlock.app.SherlockActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Item_Book4_1 extends SherlockActivity {

	/** Called when the activity is first created. */

	private ImageView img;
	private Bitmap bm;
	private ProgressBar progress;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item);
		
		if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            BitmapDrawable bg = (BitmapDrawable)getResources().getDrawable(R.drawable.bg_titlebar);
            getSupportActionBar().setBackgroundDrawable(bg);

        }
		
		TextView tv = (TextView)findViewById(R.id.title);
		tv.setSelected(true);  //포커스 없어도 자동으로 흐르게

		title();
		price();
		donate();
		stork();

		img = (ImageView) findViewById(R.id.image);
		progress = (ProgressBar) findViewById(R.id.progress);

		if (bm == null) {
			try {
				mImageDownThread async = new mImageDownThread(
						"http://blogfiles.naver.net/20130713_286/wjdrb0626_1373720517412PuItJ_PNG/%C1%A6%B8%F1_%BE%F8%C0%BD-1_%BB%E7%BA%BB.png");
				// Toast.makeText(AsyncTestActivity.this,
				// "m_data: "+m_data.getPicture(), 2222).show();
				async.start();
			} catch (URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
		Log.e("이미지 다운로드", "이미지 배치");

	}

	void title() {
		TextView result = (TextView) findViewById(R.id.title);
		result.setText(R.string.book4_title_1);
	}

	void price() {
		TextView result = (TextView) findViewById(R.id.price);
		result.setText(R.string.book4_price_1);
	}

	void donate() {
		TextView result = (TextView) findViewById(R.id.donate);
		result.setText(R.string.book4_donate_1);
	
	}

	void stork() {
		TextView result = (TextView) findViewById(R.id.stork);
		result.setText(R.string.book4_stork_1);
	
	}

	public void image(View v) {
		Intent intent = new Intent(this, Image_Book4_1.class);
		startActivity(intent);

	}

	private class mImageDownThread extends Thread {
		URL url;

		public mImageDownThread(String u) throws URISyntaxException {
			try {
				url = new URL(u);
			} catch (MalformedURLException e) {
				e.printStackTrace();
				return;
			}
			// Log.e("----url", m_data.getPicture());
		}

		@Override
		public void run() {
			try {

				Log.e("log_tag", "runned");
				URLConnection conn = url.openConnection();
				conn.connect();
				BufferedInputStream bis = new BufferedInputStream(
						conn.getInputStream());
				bm = BitmapFactory.decodeStream(bis);
				Log.d("tag", "" + bm.getWidth());

				runOnUiThread(new Runnable() {
					public void run() {
						Drawable d = new BitmapDrawable(bm);
						img.setImageDrawable(d);
						img.setVisibility(View.VISIBLE);
						progress.setVisibility(View.INVISIBLE);
					}
				});

				bis.close();

			} catch (Exception e) {
				Log.e("log_tag", "Error in http connection " + e.toString());
			}
		}

	}

}
