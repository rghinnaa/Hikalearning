package com.hikalearning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class HiraquizActivity extends Activity {
	Button quiz1, quiz2, quiz3;
	MediaPlayer audioClick;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_hiraquiz);
		addListenerButtonquiz1();
		addListenerButtonquiz2();
		addListenerButtonquiz3();
	}

	private void addListenerButtonquiz1() {

		final Context context = this;
		quiz1 = (Button) findViewById(R.id.buttonquiz1);
		quiz1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
				audioClick.setLooping(false);
				audioClick.start();

				Intent quiz1I = new Intent(context, Hquiz1splashActivity.class);
				startActivity(quiz1I);
			}
		});

	}

	private void addListenerButtonquiz2() {
		final Context context = this;
		quiz2 = (Button) findViewById(R.id.buttonquiz2);
		quiz2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
				audioClick.setLooping(false);
				audioClick.start();

				Intent quiz2I = new Intent(context, Hquiz2splashActivity.class);
				startActivity(quiz2I);
			}
		});
	}

	private void addListenerButtonquiz3() {
		final Context context = this;
		quiz3 = (Button) findViewById(R.id.buttonquiz3);
		quiz3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
				audioClick.setLooping(false);
				audioClick.start();

				Intent quiz3I = new Intent(context, Hquiz3splashActivity.class);
				startActivity(quiz3I);
			}
		});
	}
}