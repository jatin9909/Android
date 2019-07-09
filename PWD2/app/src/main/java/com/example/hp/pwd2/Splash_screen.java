package com.example.hp.pwd2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_screen extends AppCompatActivity {
    private TextView tv, tv1;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        tv = (TextView) findViewById(R.id.textView);
        tv1 = (TextView)findViewById(R.id.textView13);
        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/Zap-Chance.ttf");
        tv.setTypeface(font);
        tv1.setTypeface(font);

        iv = (ImageView) findViewById(R.id.imageView);

        Animation myanime = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.mytansition);
        tv.startAnimation(myanime);
        tv1.startAnimation(myanime);
        iv.startAnimation(myanime);


        Thread timer = new Thread(){

            @Override
            public void run(){

                try{
                    sleep(5000);
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    finish();

                } catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
        };

            timer.start();
    }
}
