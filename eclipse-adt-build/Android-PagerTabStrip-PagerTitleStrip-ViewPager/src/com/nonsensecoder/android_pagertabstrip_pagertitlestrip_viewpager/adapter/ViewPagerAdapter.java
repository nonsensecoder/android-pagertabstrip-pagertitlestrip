package com.nonsensecoder.android_pagertabstrip_pagertitlestrip_viewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.nonsensecoder.android_pagertabstrip_pagertitlestrip_viewpager.ui.fragment.TestFragment;

import java.util.ArrayList;

/**
 * Created by Ratul Ghosh on 1/7/2015.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

	private final ArrayList<TestFragment> fragments;

	public ViewPagerAdapter(FragmentManager fm,
			ArrayList<TestFragment> fragments) {
		super(fm);
		this.fragments = fragments;
	}

	@Override
	public Fragment getItem(int position) {
		return fragments.get(position);
	}

	@Override
	public int getCount() {
		return fragments.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return fragments.get(position).getName();
	}

}
