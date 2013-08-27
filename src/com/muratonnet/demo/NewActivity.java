package com.muratonnet.demo;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AnimatedActivity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_activity);

		TextView textView = (TextView) findViewById(R.id.textView);
		String text = getIntent().getExtras().getString("text");
		textView.setText(text);

	}

}
