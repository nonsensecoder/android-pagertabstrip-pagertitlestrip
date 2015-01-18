package com.nonsensecoder.android_pagertabstrip_pagertitlestrip_viewpager.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import com.nonsensecoder.android_pagertabstrip_pagertitlestrip_viewpager.R;
import com.nonsensecoder.android_pagertabstrip_pagertitlestrip_viewpager.adapter.ViewPagerAdapter;
import com.nonsensecoder.android_pagertabstrip_pagertitlestrip_viewpager.ui.fragment.TestFragment;

import java.util.ArrayList;



public class PagerTitleStripActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_title_strip);
        findViewsAndConfigure();
    }

    private void findViewsAndConfigure() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setOffscreenPageLimit(2);

        ArrayList<TestFragment> fragments = new ArrayList<TestFragment>();
        fragments.add(TestFragment.newInstance("Fragment A", "#770000"));
        fragments.add(TestFragment.newInstance("Fragment B", "#007700"));
        fragments.add(TestFragment.newInstance("Fragment C", "#000077"));

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), fragments));

    }

}
