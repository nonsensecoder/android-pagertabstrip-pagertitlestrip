package com.nonsensecoder.android_pagertabstrip_pagertitlestrip_viewpager.ui.fragment;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nonsensecoder.android_pagertabstrip_pagertitlestrip_viewpager.R;


public class TestFragment extends Fragment
{

	private static final String TAG = "TestFragment";

	private String color, name;
	public static final String ARG_COLOR = "color";


	public static TestFragment newInstance(String name, String color)
	{
		TestFragment fragment = new TestFragment();
		Bundle args = new Bundle();
		args.putString(ARG_COLOR, color);
		fragment.setArguments(args);
		fragment.setName(name);
		return fragment;
	}



	public TestFragment()
	{
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		if (savedInstanceState != null)
		{
			//fragment recreated from orientation change or activity recreated by ActivityManager
			color = savedInstanceState.getString(ARG_COLOR);
		} else
		{
			// for the first time , when fragment created, it should have argument passed by newInstance(String name, String color)
			Bundle args = getArguments();
			color = args.getString(ARG_COLOR);
		}
		Log.d(TAG, name + ": onCreate");
	}

	@Override
	public void onSaveInstanceState(Bundle outState)
	{

		// saving fragment state
		Log.d(TAG, name + ": onSaveInstanceState");
		outState.putString(ARG_COLOR, color);
		super.onSaveInstanceState(outState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		Log.d(TAG, name + ": onCreateView");

		// Inflate the layout for this fragment
		View v = inflater.inflate(R.layout.fragment_test, container, false);
		TextView tv = (TextView) v.findViewById(R.id.tvFragment);
		tv.setText(name);
		v.setBackgroundColor(Color.parseColor(color));
		return v;
	}

	@Override
	public void onDestroyView()
	{
		super.onDestroyView();
		Log.d(TAG, name + ": onDestroyView");
	}

	@Override
	public void onDestroy()
	{
		super.onDestroy();
		Log.d(TAG, name + ": onDestroy");
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
}
