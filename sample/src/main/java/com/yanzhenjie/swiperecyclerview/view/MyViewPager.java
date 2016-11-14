package com.yanzhenjie.swiperecyclerview.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by GYX on 2016/11/14.
 */
public class MyViewPager extends ViewPager {
	public MyViewPager(Context context) {
		super(context);
	}

	public MyViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}


	//向内部控件传
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		return false;//false:传递给子控件 true自己使用
	}

	//不响应事
	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		return false; //false:传递给父控件  true 不传递给父控件
	}
}
