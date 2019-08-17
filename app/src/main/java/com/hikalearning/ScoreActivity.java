package com.hikalearning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ScoreActivity extends Activity {
TextView skor, benar, salah;
ImageView back;
String benarr, salahh, skorr;
final Context context = this;
MediaPlayer audioClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);


            benarr = getIntent().getExtras().getString("totalbenar");
            salahh = getIntent().getExtras().getString("totalsalah");
            skorr = getIntent().getExtras().getString("totalskor");

            skor = (TextView) findViewById(R.id.tvskor);
            benar = (TextView) findViewById(R.id.tvbetul);
            salah = (TextView) findViewById(R.id.tvsalah);
            back = (ImageView) findViewById(R.id.backbtn);

            skor.setText(skorr);
            benar.setText(benarr);
            salah.setText(salahh);

            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
                    audioClick.setLooping(false);
                    audioClick.start();

                    Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(i);
                    finish();
                }
            });
    }
}
