package com.nonsensecoder.android_pagertabstrip_pagertitlestrip_viewpager.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.nonsensecoder.android_pagertabstrip_pagertitlestrip_viewpager.R;

public class MainActivity extends ActionBarActivity implements
		View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewsAndConfigure();
	}

	private void findViewsAndConfigure() {
		findViewById(R.id.btPageTabStrip).setOnClickListener(this);
		findViewById(R.id.btPageTitleStrip).setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		Intent intent;
		switch (v.getId()) {
		case R.id.btPageTabStrip:
			intent = new Intent(this, PagerTabStripActivity.class);
			startActivity(intent);
			break;
		case R.id.btPageTitleStrip:
			intent = new Intent(this, PagerTitleStripActivity.class);
			startActivity(intent);
			break;
		}
	}
}
