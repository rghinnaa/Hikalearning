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

public class HiraganaActivity extends Activity {
	Button hiral,hiraq;
	MediaPlayer audioClick;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.activity_hiragana);
	        addListenerButtonLearnHira();
	        addListenerButtonQuizHira();
	    }
	 	private void addListenerButtonQuizHira() {

	 		final Context context = this;
			hiraq = (Button) findViewById (R.id.button2);
			hiraq.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg3) {

					audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
					audioClick.setLooping(false);
					audioClick.start();

					Intent quizI = new Intent(context, HiraquizActivity.class);
					startActivity(quizI);
				}
			});
		
	}
		private void addListenerButtonLearnHira() {

		 final Context context = this;
			hiral = (Button) findViewById (R.id.button1);
			hiral.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg3) {

					audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
					audioClick.setLooping(false);
					audioClick.start();

					Intent learnI = new Intent(context, HiralearnActivity.class);
					startActivity(learnI);
				}
			});
		
	}
}