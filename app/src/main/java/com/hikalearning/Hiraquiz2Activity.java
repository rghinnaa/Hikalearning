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
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Hiraquiz2Activity extends Activity implements OnClickListener {
	Button a,b,c,d, answer;
	TextView soalnya,benar,salah,jumsoal;
	String jaw;
	ProgressBar pb;
	int i=0;
	int skor=0;
	int ben,sal;
	private QuestionQuiz2 questbank = new QuestionQuiz2();
	private String checkjaw;
	private int nosoal = 0;
	private int benarr=0,salahh=0,skorrr=0;
	private int no = 0;

	MediaPlayer audioClick;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         requestWindowFeature(Window.FEATURE_NO_TITLE);
         setContentView(R.layout.activity_hiraquiz2);
         final Context context = this;
         a = (Button) findViewById(R.id.button1);
         b = (Button) findViewById(R.id.button2);
         c = (Button) findViewById(R.id.button3);
         d = (Button) findViewById(R.id.button4);
         a.setOnClickListener(this);
         b.setOnClickListener(this);
         c.setOnClickListener(this);
         d.setOnClickListener(this);
         soalnya = (TextView) findViewById(R.id.tvsoal);
         benar = (TextView) findViewById(R.id.bbenar);
         salah = (TextView) findViewById(R.id.bsalah);
         jumsoal = (TextView) findViewById(R.id.textView1);
         updateQuestion();
         updateSoal(nosoal);
         updateBenar(benarr);
         updateSalah(salahh);

     }
     private void updateQuestion(){
	     if(nosoal<questbank.getLength()){
	         soalnya.setText(questbank.getPertanyaan(nosoal));
	         a.setText(questbank.getPilihan(nosoal,1));
	         b.setText(questbank.getPilihan(nosoal,2));
	         c.setText(questbank.getPilihan(nosoal,3));
	         d.setText(questbank.getPilihan(nosoal,4));
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

     public void onClick(View view){
         audioClick = MediaPlayer.create(this, R.raw.hikaclicksound);
         audioClick.setLooping(false);
         audioClick.start();
	     answer = (Button) view;
	     if(answer.getText().equals(checkjaw)){
	         nosoal = nosoal+1;
	         benarr = benarr+1;
	         skorrr = skorrr+5;
         }else{
	         nosoal = nosoal+1;
	         salahh = salahh+1;
         }
         updateSoal(nosoal);
         updateQuestion();
         updateBenar(benarr);
         updateSalah(salahh);
     }

}