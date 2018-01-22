package com.DOLdevelop.samgoe_market.Home;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;
import android.widget.AdapterView.OnItemClickListener;

import com.DOLdevelop.samgoe_market.R;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;



public class Home_Activity extends SherlockActivity
implements View.OnTouchListener, OnItemClickListener {
	// 예제가 있는 시작 챕터. 스피너의 첨자에 이 값을 더해야 장 번호가 된다.

	
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Used to put dark icons on light action bar

        menu.add(0,1,0,"어플정보")
            .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_WITH_TEXT);

        
        return true;
    }
	
	boolean mbRunLast;
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case 1:
			startActivityForResult(new Intent(this, com.DOLdevelop.samgoe_market.setting.class), SETTING_ACTIVITY);
			return true;
		
		}
		return false;
		
	}
	
	
	
	ViewFlipper flipper;

	// ��ġ �̺�Ʈ �߻� ������ x��ǥ ����
	float xAtDown;
	float xAtUp;

		static final int SETTING_ACTIVITY = 1;
		
		private ArrayList<HomeActivity> homeList = new ArrayList<Home_Activity.HomeActivity>();

		public void HomeListview() {
			homeList.add(new HomeActivity(R.drawable.project1, Project1.class));
			
			homeList.add(new HomeActivity(R.drawable.project4, com.DOLdevelop.samgoe_market.Cosmetic.Item_Cosmetic1_2.class));
			homeList.add(new HomeActivity(R.drawable.project5, com.DOLdevelop.samgoe_market.Cosmetic.Item_Cosmetic1_8.class));
			homeList.add(new HomeActivity(R.drawable.project2, Project2.class));
			homeList.add(new HomeActivity(R.drawable.project3, com.DOLdevelop.samgoe_market.Book.Book_List.class));
			
			}

	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_list);
		
		
		HomeListview();

		ListView homeListView = (ListView) findViewById(R.id.list);
		homeListView.setAdapter(new ServiceAdapter(homeList));
		homeListView.setOnItemClickListener(this);


		flipper = (ViewFlipper) findViewById(R.id.viewFlipper);
		flipper.setOnTouchListener(this);

		flipper.setInAnimation(AnimationUtils.loadAnimation(this,
				R.anim.push_left_in));
		flipper.setOutAnimation(AnimationUtils.loadAnimation(this,
				R.anim.push_left_out));

		// �ڵ� Flipping ���� (���� 3��)
		flipper.setFlipInterval(4000);
		flipper.startFlipping();

	}
		
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// ��ġ �̺�Ʈ�� �Ͼ �䰡 ViewFlipper�� �ƴϸ� return
		if(v != flipper) return false;		
		
		if(event.getAction() == MotionEvent.ACTION_DOWN) {
			xAtDown = event.getX(); // ��ġ �������� x��ǥ ����			
		}
		else if(event.getAction() == MotionEvent.ACTION_UP){
			xAtUp = event.getX(); 	// ��ġ �������� x��ǥ ����
			
			if( xAtUp < xAtDown ) {
				// ���� ���� ���ϸ��̼� ����
				flipper.setInAnimation(AnimationUtils.loadAnimation(this,
		        		R.anim.push_left_in));
		        flipper.setOutAnimation(AnimationUtils.loadAnimation(this,
		        		R.anim.push_left_out));
		        		
		        // ���� view ������
				flipper.showNext();
			}
			else if (xAtUp > xAtDown){
				// ������ ���� ���ϸ��̼� ����
				flipper.setInAnimation(AnimationUtils.loadAnimation(this,
		        		R.anim.push_right_in));
		        flipper.setOutAnimation(AnimationUtils.loadAnimation(this,
		        		R.anim.push_right_out));
		        // �� view ������
				flipper.showPrevious();			
			}
		}		
		return true;
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		this.homeList.get(arg2).onclick();
	}
	private class HomeActivity {
		protected int image;
		protected Class<?> cls;

		public HomeActivity(int image, Class<?> cls) {
			this.image = image;
			this.cls = cls;
		}


		public int getimage() {
			// return (this.cls != null) ? this.name + cls.getSimpleName() :
			// this.name;
			return this.image;
		}

		public void onclick() {
			if (cls == null) {
				return;
			}

			Intent intent = new Intent(Home_Activity.this, cls);
			startActivity(intent);
		}
	}

	private class ServiceAdapter extends BaseAdapter {

		private ArrayList<HomeActivity> mList;

		public ServiceAdapter(ArrayList<HomeActivity> list) {
			mList = list;
		}

		@Override
		public int getCount() {
			return mList.size();
		}

		@Override
		public Object getItem(int position) {
			return mList.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View v = convertView;
			if (v == null) {
				v = View.inflate(Home_Activity.this,
						R.layout.homelistview_bg, null);
			}
			HomeActivity ha = mList.get(position);
			if (ha != null) {
				ImageView img = (ImageView) v.findViewById(R.id.image);
				img.setImageResource(ha.getimage());
			}
			return v;
		}

	}
}
