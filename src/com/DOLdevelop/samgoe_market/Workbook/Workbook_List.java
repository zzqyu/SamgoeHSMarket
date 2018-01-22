package com.DOLdevelop.samgoe_market.Workbook;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.DOLdevelop.samgoe_market.R;
import com.actionbarsherlock.app.SherlockActivity;


public class Workbook_List extends SherlockActivity {
	// 예제가 있는 시작 챕터. 스피너의 첨자에 이 값을 더해야 장 번호가 된다.

	static final int START_CHAPTER = 1;

	class Alist {
		Alist(Class<?> acls, int aName, int aPrice) {
			cls = acls;
			Name = aName;
			Price = aPrice;
		}

		Class<?> cls;
		int Name;
		int Space;
		int Price;
	}

	ArrayList<Alist> arlist = new ArrayList<Alist>();

	// 요청한 장의 예제들을 배열에 채운다.
	void FillAlist(int chapter) {
		arlist.clear();

		switch (chapter) {
		case 1: //ebs수능문제집
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook1_1.class,
					R.string.workbook1_title_1, R.string.workbook1_price_1));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook1_2.class,
					R.string.workbook1_title_2, R.string.workbook1_price_2));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook1_3.class,
					R.string.workbook1_title_3, R.string.workbook1_price_3));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook1_4.class,
					R.string.workbook1_title_4, R.string.workbook1_price_4));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook1_5.class,
					R.string.workbook1_title_5, R.string.workbook1_price_5));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook1_6.class,
					R.string.workbook1_title_6, R.string.workbook1_price_6));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook1_7.class,
					R.string.workbook1_title_7, R.string.workbook1_price_7));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook1_8.class,
					R.string.workbook1_title_8, R.string.workbook1_price_8));
			
			break;
		case 2: //수학문제집
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook2_1.class,
					R.string.workbook2_title_1, R.string.workbook2_price_1));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook2_2.class,
					R.string.workbook2_title_2, R.string.workbook2_price_2));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook2_3.class,
					R.string.workbook2_title_3, R.string.workbook2_price_3));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook2_4.class,
					R.string.workbook2_title_4, R.string.workbook2_price_4));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook2_5.class,
					R.string.workbook2_title_5, R.string.workbook2_price_5));
			break;
		case 3: //언어문제집
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook3_1.class,
					R.string.workbook3_title_1, R.string.workbook3_price_1));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook3_2.class,
					R.string.workbook3_title_2, R.string.workbook3_price_2));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook3_3.class,
					R.string.workbook3_title_3, R.string.workbook3_price_3));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook3_4.class,
					R.string.workbook3_title_4, R.string.workbook3_price_4));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook3_5.class,
					R.string.workbook3_title_5, R.string.workbook3_price_5));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook3_6.class,
					R.string.workbook3_title_6, R.string.workbook3_price_6));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook3_7.class,
					R.string.workbook3_title_7, R.string.workbook3_price_7));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook3_8.class,
					R.string.workbook3_title_8, R.string.workbook3_price_8));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook3_9.class,
					R.string.workbook3_title_9, R.string.workbook3_price_9));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook3_10.class,
					R.string.workbook3_title_10, R.string.workbook3_price_10));
			
			
			break;
		case 4: //영어문제집
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook4_1.class,
					R.string.workbook4_title_1, R.string.workbook4_price_1));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook4_2.class,
					R.string.workbook4_title_2, R.string.workbook4_price_2));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook4_3.class,
					R.string.workbook4_title_3, R.string.workbook4_price_3));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook4_4.class,
					R.string.workbook4_title_4, R.string.workbook4_price_4));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook4_5.class,
					R.string.workbook4_title_5, R.string.workbook4_price_5));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook4_6.class,
					R.string.workbook4_title_6, R.string.workbook4_price_6));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook4_7.class,
					R.string.workbook4_title_7, R.string.workbook4_price_7));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook4_8.class,
					R.string.workbook4_title_8, R.string.workbook4_price_8));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook4_9.class,
					R.string.workbook4_title_9, R.string.workbook4_price_9));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook4_10.class,
					R.string.workbook4_title_10, R.string.workbook4_price_10));
			
			break;
			
		case 5: //사탐 문제집
			
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook5_1.class,
					R.string.workbook5_title_1, R.string.workbook5_price_1));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook5_2.class,
					R.string.workbook5_title_2, R.string.workbook5_price_2));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook5_3.class,
					R.string.workbook5_title_3, R.string.workbook5_price_3));
			break;
			
		case 6: //과탐 문제집
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook6_1.class,
					R.string.workbook6_title_1, R.string.workbook6_price_1));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook6_2.class,
					R.string.workbook6_title_2, R.string.workbook6_price_2));
			
			break;
			
		case 7: //기타
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook7_1.class,
					R.string.workbook7_title_1, R.string.workbook7_price_1));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook7_2.class,
					R.string.workbook7_title_2, R.string.workbook7_price_2));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook7_3.class,
					R.string.workbook7_title_3, R.string.workbook7_price_3));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook7_4.class,
					R.string.workbook7_title_4, R.string.workbook7_price_4));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook7_5.class,
					R.string.workbook7_title_5, R.string.workbook7_price_5));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook7_6.class,
					R.string.workbook7_title_6, R.string.workbook7_price_6));
			arlist.add(new Alist(
					com.DOLdevelop.samgoe_market.Workbook.Item_Workbook7_7.class,
					R.string.workbook7_title_7, R.string.workbook7_price_7));
			break;

		}
	}

	String[] arChapter = {"EBS수능문제집", "수학문제집", "언어문제집", "영어문제집", "사탐 문제집", "과탐 문제집", "기타"};

	ArrayAdapter<CharSequence> mAdapter;
	ListView marlist;
	Spinner mSpinner;
	boolean mInitSelection = true;
	int mBackType;
	boolean mDescSide;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.categorylist);
		
		TextView tv = (TextView)findViewById(R.id.info);
		tv.setSelected(true);  //포커스 없어도 자동으로 흐르게
		
		

		marlist = (ListView) findViewById(R.id.list);
		mSpinner = (Spinner) findViewById(R.id.spinnerchapter);
		mSpinner.setPrompt("장을 선택하세요.");

		mAdapter = new ArrayAdapter<CharSequence>(this,
				android.R.layout.simple_spinner_item, arChapter);
		mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mSpinner.setAdapter(mAdapter);

		mSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// 최초 전개시에도 Selected가 호출되는데 이때는 프레퍼런스에서 최후 장을 찾아 로드한다.
				// 이후부터는 사용자가 선택한 장을 로드한다.
				if (mInitSelection) {
					mInitSelection = false;
					SharedPreferences pref = getSharedPreferences("AndExam", 0);
					int lastchapter = pref.getInt(null, START_CHAPTER);
					mSpinner.setSelection(lastchapter - START_CHAPTER);
					ChangeChapter(lastchapter);
				} else {
					// 장을 변경할 때마다 프레퍼런스에 기록한다.
					int chapter = position + START_CHAPTER;
					ChangeChapter(chapter);
					SharedPreferences pref = getSharedPreferences("AndExam", 0);
					SharedPreferences.Editor edit = pref.edit();
					edit.putInt("LastChapter", chapter);
					edit.commit();
				}
			}

			public void onNothingSelected(AdapterView<?> parent) {
			}
		});

		ReadOption();

		// 자동실행 옵션의 디폴트는 false로 설정한다. 한 예제만 반복적으로 테스트할 때 이 옵션을
		// 사용하되 예외 처리가 어려우므로 왠만하면 사용하지 않는 것이 좋다.
		boolean bRunLast = false;
		if (bRunLast) {
			SharedPreferences pref = getSharedPreferences("AndExam", 0);
			int pkg = pref.getInt("LastChapter", START_CHAPTER);
			int pos = pref.getInt("LastPosition", 0);
			ChangeChapter(pkg);
			Intent intent = new Intent(this, arlist.get(pos).cls);
			startActivity(intent);
		}

	}

	public void ReadOption() {
		SharedPreferences pref = getSharedPreferences("AndExam", 0);
		mBackType = pref.getInt("mBackType", 0);
		mDescSide = pref.getBoolean("mDescSide", false);

		if (mBackType != 0) {
			marlist.setBackgroundColor(0x00000000);
			marlist.setDivider(new ColorDrawable(0x00000000));
			marlist.setDividerHeight(4);
		} else {
			marlist.setBackgroundColor(0x00000000);
			marlist.setDivider(new ColorDrawable(0x00000000));
			marlist.setDividerHeight(4);
		}
	}

	// 장을 변경한다. 인수로 전달되는 chapter는 첨자가 아니라 장 번호이다.
	public void ChangeChapter(int chapter) {
		FillAlist(chapter);
		ExamListAdapter Adapter = new ExamListAdapter(this, arlist);
		marlist.setAdapter(Adapter);

		final Context ctx = this;
		marlist.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				SharedPreferences pref = getSharedPreferences("AndExam", 0);
				SharedPreferences.Editor edit = pref.edit();
				edit.putInt("LastPosition", position);
				edit.commit();
				Intent intent = new Intent(ctx, arlist.get(position).cls);
				startActivity(intent);
			}
		});
	}

	// 어댑터 클래스
	class ExamListAdapter extends BaseAdapter {
		Context maincon;

		LayoutInflater Inflater;

		ArrayList<Alist> arlist;

		public ExamListAdapter(Context context, ArrayList<Alist> aarlist) {
			maincon = context;
			Inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

			arlist = aarlist;
		}

		public int getCount() {
			return arlist.size();
		}

		public Object getItem(int position) {
			return arlist.get(position).Name;
		}

		public long getItemId(int position) {
			return position;
		}

		// 각 항목의 뷰 생성
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = Inflater.inflate(R.layout.listview_bg, parent,
						false);

			}

			LinearLayout examlayout = (LinearLayout) convertView
					.findViewById(R.id.listview_bg);

			TextView txt1 = (TextView) convertView.findViewById(R.id.text1);
			TextView txt2 = (TextView) convertView.findViewById(R.id.text2);

			if (mDescSide) {
				examlayout.setOrientation(LinearLayout.HORIZONTAL);

			}

			if (mBackType != 0) {
				txt1.setTextColor(Color.WHITE);
				txt2.setTextColor(Color.LTGRAY);
			}

			txt1.setText(arlist.get(position).Name);
			txt2.setText(arlist.get(position).Price);

			return convertView;
		}
	}
}
