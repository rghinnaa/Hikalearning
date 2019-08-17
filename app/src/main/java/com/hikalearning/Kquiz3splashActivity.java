package com.hikalearning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.Window;
import android.widget.ImageView;

public class Kquiz3splashActivity extends Activity {
private static int SPLASH_TIME_OUT = 2000;
ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_quizsplash);
        final Context context = this;
        new Handler().postDelayed(new Runnable(){
        	@Override
        	public void run(){
        		Intent hq1Intent = new Intent(context, Kataquiz3Activity.class);
        		startActivity(hq1Intent);
        		finish();
        	}
        	
        },SPLASH_TIME_OUT);
        gambar=(ImageView)findViewById(R.id.imageView1);
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
