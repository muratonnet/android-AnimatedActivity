package com.muratonnet.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AnimatedActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		// from left
		Button fromLeft = (Button) findViewById(R.id.fromLeftButton);
		fromLeft.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, NewActivity.class);
				intent.putExtra("text", "FROM LEFT");
				startAnimatedActivity(intent, AnimatedActivity.SLIDE_FROM_LEFT);
			}
		});

		// from right
		Button fromRight = (Button) findViewById(R.id.fromRightButton);
		fromRight.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, NewActivity.class);
				intent.putExtra("text", "FROM RIGHT");
				startAnimatedActivity(intent, AnimatedActivity.SLIDE_FROM_RIGHT);
			}
		});

		// from up
		Button fromUp = (Button) findViewById(R.id.fromTopButton);
		fromUp.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, NewActivity.class);
				intent.putExtra("text", "FROM UP");
				startAnimatedActivity(intent, AnimatedActivity.SLIDE_FROM_TOP);
			}
		});

		// from bottom
		Button fromBottom = (Button) findViewById(R.id.fromBottomButton);
		fromBottom.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, NewActivity.class);
				intent.putExtra("text", "FROM BOTTOM");
				startAnimatedActivity(intent,
						AnimatedActivity.SLIDE_FROM_BOTTOM);
			}
		});

		// from bottom IOS style
		Button fromBottomIOSStyle = (Button) findViewById(R.id.fromBottomIOSStyleButton);
		fromBottomIOSStyle.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, NewActivity.class);
				intent.putExtra("text", "FROM BOTTOM IOS STYLE");
				startAnimatedActivity(intent,
						AnimatedActivity.SLIDE_FROM_BOTTOM_IOS_STYLE);
			}
		});

	}
}