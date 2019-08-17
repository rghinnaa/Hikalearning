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

public class KatakanaActivity extends Activity {
	Button katal;
	MediaPlayer audioClick;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.activity_katakana);
	        addListenerButtonLearnKata();
	        addListenerButtonQuizKata();
	    }

	private void addListenerButtonQuizKata() {
		final Context context = this;
		katal = (Button) findViewById (R.id.button2);
		katal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg3) {

				audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
				audioClick.setLooping(false);
				audioClick.start();

				Intent learnI = new Intent(context, KataquizActivity.class);
				startActivity(learnI);
			}
		});
	}

	private void addListenerButtonLearnKata() {
		 final Context context = this;
			katal = (Button) findViewById (R.id.button1);
			katal.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg3) {

					audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
					audioClick.setLooping(false);
					audioClick.start();

					Intent learnI = new Intent(context, KatalearnActivity.class);
					startActivity(learnI);
				}
			});
	    }
}