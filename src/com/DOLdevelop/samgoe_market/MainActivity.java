package com.DOLdevelop.samgoe_market;

import android.annotation.SuppressLint;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabWidget;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity implements OnTabChangeListener {

	TabHost mTab;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab);


		startActivity(new Intent(this, splash.class));
		Resources res = getResources();  //리소스 객체 생성
        TabHost.TabSpec spec;    //TabHost.TabSpec 선언
        Intent intent;      //Intent 선언
		mTab = getTabHost();

		Intent int1 = new Intent(this, CategoryList.class);
		int1.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
		mTab.addTab(mTab.newTabSpec("tab1").setIndicator(" ").setContent(int1));

		Intent int2 = new Intent(this,
				com.DOLdevelop.samgoe_market.Home.Home_Activity.class);
		int2.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
		mTab.addTab(mTab.newTabSpec("tab2").setIndicator(" ").setContent(int2));

		Intent int3 = new Intent(this, info.class);
		int3.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
		mTab.addTab(mTab.newTabSpec("tab3").setIndicator(" ").setContent(int3));

		mTab.setOnTabChangedListener(this);
		
			


		// TabWidget의 높이가 너무 높아서 화면 비율에 맞게 좀 낮춰줌..
		TabWidget tw = mTab.getTabWidget();
		for ( int tab = 0; tab < tw.getChildCount(); ++tab )
		{
			tw.getChildAt(tab).getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
		}
		mTab.setCurrentTab(1);
		onTabChanged("tab2");
	}

	/**
	 * 탭을 선택했을때 탭을 노란색 이미지로 설정하고, 선택되지 않은 탭들은 회색 이미지로 설정한다.
	 * 
	 * @see android.widget.TabHost.OnTabChangeListener#onTabChanged(java.lang.String)
	 */
	public void onTabChanged(String tabId) {
		TabWidget tw = mTab.getTabWidget();

		if (tabId.equals("tab1")) {
			tw.getChildAt(0).setBackgroundResource(R.drawable.tab1_p);
			tw.getChildAt(1).setBackgroundResource(R.drawable.tab2_n);
			tw.getChildAt(2).setBackgroundResource(R.drawable.tab3_n);
		} else if (tabId.equals("tab2")) {
			tw.getChildAt(0).setBackgroundResource(R.drawable.tab1_n);
			tw.getChildAt(1).setBackgroundResource(R.drawable.tab2_p);
			tw.getChildAt(2).setBackgroundResource(R.drawable.tab3_n);
		} else if (tabId.equals("tab3")) {
			tw.getChildAt(0).setBackgroundResource(R.drawable.tab1_n);
			tw.getChildAt(1).setBackgroundResource(R.drawable.tab2_n);
			tw.getChildAt(2).setBackgroundResource(R.drawable.tab3_p);
		}
	}

}