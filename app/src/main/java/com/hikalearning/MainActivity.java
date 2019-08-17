package com.hikalearning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {
private static int SPLASH_TIME_OUT = 4000;
ImageView gambar;
Animation anima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
        	@Override
        	public void run(){
        		Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
        		startActivity(homeIntent);
        		finish();
        	}
        	
        },SPLASH_TIME_OUT);
        gambar=(ImageView)findViewById(R.id.imageView1);
        anima = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
