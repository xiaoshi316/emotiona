package com.example.drawinganimate;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

import com.example.drawinganimate.util.AnimatedMuzeiLogoFragment;

public class ShowAnimateActivity extends Activity {
	private Handler mHandler = new Handler();
	public static ArrayList<String> mPathStringList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final AnimatedMuzeiLogoFragment logoFragment = (AnimatedMuzeiLogoFragment) getFragmentManager().findFragmentById(R.id.animated_logo_fragment);
		mHandler.postDelayed(new Runnable() {
			@Override
			public void run() {
				logoFragment.start();
			}
		}, 1000);

	}
}
