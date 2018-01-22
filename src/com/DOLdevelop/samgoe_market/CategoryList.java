package com.DOLdevelop.samgoe_market;

import com.actionbarsherlock.app.SherlockActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoryList extends SherlockActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

		setContentView(R.layout.category);
		
	}
		
	public void book(View v) {
		Intent intent = new Intent(this, com.DOLdevelop.samgoe_market.Book.Book_List.class);
		startActivity(intent);

	}
	public void workbook(View v) {
		Intent intent = new Intent(this, com.DOLdevelop.samgoe_market.Workbook.Workbook_List.class);
		startActivity(intent);

	}
	public void sundies(View v) {
		Intent intent = new Intent(this, com.DOLdevelop.samgoe_market.Sundies.Sundies_List.class);
		startActivity(intent);

	}
	public void clothes(View v) {
		Intent intent = new Intent(this, com.DOLdevelop.samgoe_market.Clothes.Clothes_List.class);
		startActivity(intent);

	}
	public void cosmetic(View v) {
		Intent intent = new Intent(this, com.DOLdevelop.samgoe_market.Cosmetic.Cosmetic_List.class);
		startActivity(intent);

	}

	    
		
	}

		