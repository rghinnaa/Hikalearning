package com.hikalearning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeActivity extends Activity {
Button hira,kata,about;
MediaPlayer audioBg, audioClick;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.activity_home);

			playsound();


	        addListenerOnButton();
	        addListenerOnButton2();
	        addListenerButton3();
	        
	    }

	private void playsound() {
	 	try {
			if (audioBg.isPlaying()) {
				audioBg.stop();
				audioBg.release();
			}
		}catch (Exception ex){

		}
		audioBg = MediaPlayer.create(this, R.raw.bg);
	 	audioBg.setLooping(true);
	 	audioBg.start();
	}

	private void addListenerButton3() {
		 final Context context = this;
			about = (Button) findViewById (R.id.buttonabout);
			about.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg1) {


					audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
					audioClick.setLooping(false);
					audioClick.start();

					Intent aboutI = new Intent(context, AboutActivity.class);
					startActivity(aboutI);
				}
			});
		
	}
	private void addListenerOnButton2() {
		 final Context context = this;
			kata = (Button) findViewById (R.id.buttonkatakana);
			kata.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg1) {
					audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
					audioClick.setLooping(false);
					audioClick.start();
					Intent katakanaI = new Intent(context, KatakanaActivity.class);
					startActivity(katakanaI);
				}
			});
		
	}
	private void addListenerOnButton() {
		final Context context = this;
		hira = (Button) findViewById (R.id.buttonhiragana);
		hira.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
				audioClick.setLooping(false);
				audioClick.start();
				Intent hiraganaI = new Intent(context, HiraganaActivity.class);
				startActivity(hiraganaI);
			}
		});
		
	}

	@Override
	public void onBackPressed() {

	 	audioBg.pause();

		super.onBackPressed();
	}

	@Override
	protected void onPause() {

	 	audioBg.pause();

		super.onPause();
	}

	@Override
	protected void onResume() {

	 	audioBg.start();

		super.onResume();
	}
}
