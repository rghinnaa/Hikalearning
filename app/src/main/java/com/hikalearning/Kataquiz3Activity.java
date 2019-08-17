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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Kataquiz3Activity extends Activity {
	Button a,b,c,d, answer;
	ImageView enter;
	TextView soalnya,benar,salah,jumsoal;
	String jaw;
	ProgressBar pb;
	EditText anss;
	int i=0;
	int skor=0;
	int ben,sal;
	private QuestionQuiz6 questbank = new QuestionQuiz6();
	private String checkjaw;
	private int nosoal = 0;
	private int benarr=0,salahh=0,skorrr=0;
	private int no = 0;
	MediaPlayer audioClick;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         requestWindowFeature(Window.FEATURE_NO_TITLE);
         setContentView(R.layout.activity_hiraquiz3);
         final Context context = this;
         soalnya = (TextView) findViewById(R.id.tvsoal);
         benar = (TextView) findViewById(R.id.bbenar);
         salah = (TextView) findViewById(R.id.bsalah);
         jumsoal = (TextView) findViewById(R.id.textView1);
         anss = (EditText) findViewById(R.id.ans);
         enter = (ImageView) findViewById(R.id.enter);
         enter.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View view) {

                 audioClick = MediaPlayer.create(getApplicationContext(), R.raw.hikaclicksound);
                 audioClick.setLooping(false);
                 audioClick.start();

                 if(anss.getText().toString().toUpperCase().trim().equals(checkjaw)){
                     nosoal = nosoal+1;
                     benarr = benarr+1;
                     skorrr = skorrr+10;
                 }else{
                     nosoal = nosoal+1;
                     salahh = salahh+1;
                 }
                 updateSoal(nosoal);
                 updateQuestion();
                 updateBenar(benarr);
                 updateSalah(salahh);
                 anss.setText("");
             }
         });
         updateQuestion();
         updateSoal(nosoal);
         updateBenar(benarr);
         updateSalah(salahh);

     }
     private void updateQuestion(){
	     if(nosoal<questbank.getLength()){
	         soalnya.setText(questbank.getPertanyaan(nosoal));
	         checkjaw = questbank.getJawBenar(nosoal);
         }
         else{
             Toast.makeText(this, "The last question!", Toast.LENGTH_SHORT).show();
             Intent i = new Intent(this, ScoreActivity.class);
             i.putExtra("totalskor", String.valueOf(skorrr));
             i.putExtra("totalbenar", String.valueOf(benarr));
             i.putExtra("totalsalah", String.valueOf(salahh));
             startActivity(i);
             finish();

             skorrr = 0;
             benarr = 0;
             salahh = 0;
         }
     }

     private void updateSoal(int point){
	     jumsoal.setText(String.valueOf(point)+"/"+questbank.getLength());
     }

     private void updateBenar(int yes){
	     benar.setText(String.valueOf(yes));
     }
     private void updateSalah(int no){ salah.setText(String.valueOf(no)); }



}