package com.example.hp.pwd2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class mspowerpoint_assesment extends AppCompatActivity implements View.OnClickListener {


    Button btn1, btn2;
    int score = 0;
    CheckBox ck1, ck2, ck3, ck4, ck5, ck6, ck7, ck8, ck9, ck10, ck11, ck12, ck13, ck14, ck15, ck16, ck17, ck18, ck19, ck20,
            ck21, ck22, ck23, ck24, ck25, ck26, ck27, ck28, ck29, ck30, ck31, ck32, ck33, ck34, ck35, ck36, ck37, ck38, ck39, ck40;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mspowerpoint_assesment);


        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button1);
        tv1 = (TextView) findViewById(R.id.text);

        ck1 = (CheckBox) findViewById(R.id.checkBox);
        ck2 = (CheckBox) findViewById(R.id.checkBox2);
        ck3 = (CheckBox) findViewById(R.id.checkBox3);
        ck4 = (CheckBox) findViewById(R.id.checkBox5);
        ck5 = (CheckBox) findViewById(R.id.checkBox6);
        ck6 = (CheckBox) findViewById(R.id.checkBox7);
        ck7 = (CheckBox) findViewById(R.id.checkBox8);
        ck8 = (CheckBox) findViewById(R.id.checkBox9);
        ck9 = (CheckBox) findViewById(R.id.checkBox10);
        ck10 = (CheckBox) findViewById(R.id.checkBox11);
        ck11 = (CheckBox) findViewById(R.id.checkBox12);
        ck12 = (CheckBox) findViewById(R.id.checkBox13);
        ck13 = (CheckBox) findViewById(R.id.checkBox14);
        ck14 = (CheckBox) findViewById(R.id.checkBox15);
        ck15 = (CheckBox) findViewById(R.id.checkBox16);
        ck16 = (CheckBox) findViewById(R.id.checkBox17);
        ck17 = (CheckBox) findViewById(R.id.checkBox18);
        ck18 = (CheckBox) findViewById(R.id.checkBox19);
        ck19 = (CheckBox) findViewById(R.id.checkBox20);
        ck20 = (CheckBox) findViewById(R.id.checkBox21);
        ck21 = (CheckBox) findViewById(R.id.checkBox22);
        ck22 = (CheckBox) findViewById(R.id.checkBox23);
        ck23 = (CheckBox) findViewById(R.id.checkBox24);
        ck24 = (CheckBox) findViewById(R.id.checkBox25);
        ck25 = (CheckBox) findViewById(R.id.checkBox26);
        ck26 = (CheckBox) findViewById(R.id.checkBox27);
        ck27 = (CheckBox) findViewById(R.id.checkBox28);
        ck28 = (CheckBox) findViewById(R.id.checkBox29);
        ck29 = (CheckBox) findViewById(R.id.checkBox30);
        ck30 = (CheckBox) findViewById(R.id.checkBox31);
        ck31 = (CheckBox) findViewById(R.id.checkBox32);
        ck32 = (CheckBox) findViewById(R.id.checkBox33);
        ck33 = (CheckBox) findViewById(R.id.checkBox34);
        ck34 = (CheckBox) findViewById(R.id.checkBox34);
        ck35 = (CheckBox) findViewById(R.id.checkBox36);
        ck36 = (CheckBox) findViewById(R.id.checkBox37);
        ck37 = (CheckBox) findViewById(R.id.checkBox38);
        ck38 = (CheckBox) findViewById(R.id.checkBox39);
        ck39 = (CheckBox) findViewById(R.id.checkBox40);
        ck40 = (CheckBox) findViewById(R.id.checkBox41);

        tv1 = (TextView) findViewById(R.id.text);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);


        ck1.setOnClickListener(this);
        ck2.setOnClickListener(this);
        ck3.setOnClickListener(this);
        ck4.setOnClickListener(this);
        ck5.setOnClickListener(this);
        ck6.setOnClickListener(this);
        ck7.setOnClickListener(this);
        ck8.setOnClickListener(this);
        ck9.setOnClickListener(this);
        ck10.setOnClickListener(this);
        ck11.setOnClickListener(this);
        ck12.setOnClickListener(this);
        ck13.setOnClickListener(this);
        ck14.setOnClickListener(this);
        ck15.setOnClickListener(this);
        ck16.setOnClickListener(this);
        ck17.setOnClickListener(this);
        ck18.setOnClickListener(this);
        ck19.setOnClickListener(this);
        ck20.setOnClickListener(this);
        ck21.setOnClickListener(this);
        ck22.setOnClickListener(this);
        ck23.setOnClickListener(this);
        ck24.setOnClickListener(this);
        ck25.setOnClickListener(this);
        ck26.setOnClickListener(this);
        ck27.setOnClickListener(this);
        ck28.setOnClickListener(this);
        ck29.setOnClickListener(this);
        ck30.setOnClickListener(this);
        ck31.setOnClickListener(this);
        ck32.setOnClickListener(this);
        ck33.setOnClickListener(this);
        ck34.setOnClickListener(this);
        ck35.setOnClickListener(this);
        ck36.setOnClickListener(this);
        ck37.setOnClickListener(this);
        ck38.setOnClickListener(this);
        ck39.setOnClickListener(this);
        ck40.setOnClickListener(this);

        tv1.setVisibility(View.INVISIBLE);



        android.app.ActionBar actionBar = getActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(mspowerpoint_assesment.this, Course_Basic_computing.class);
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button) {
            score = 0;


            if (ck1.isChecked() || ck2.isChecked() || ck3.isChecked() || ck4.isChecked()) {

                if (!ck1.isChecked() && !ck2.isChecked() && ck3.isChecked() && !ck4.isChecked()) {

                    score++;

                }
            }

            if (ck5.isChecked() || ck6.isChecked() || ck7.isChecked() || ck8.isChecked()) {

                if (!ck5.isChecked() && !ck6.isChecked() && !ck7.isChecked() && ck8.isChecked()) {
                    score++;

                }
            }

            if (ck9.isChecked() || ck10.isChecked() || ck11.isChecked() || ck12.isChecked()) {

                if (!ck9.isChecked() && !ck10.isChecked() && !ck11.isChecked() && ck12.isChecked()) {

                    score++;

                }
            }

            if (ck13.isChecked() || ck14.isChecked() || ck15.isChecked() || ck16.isChecked()) {

                if (ck13.isChecked() && !ck14.isChecked() && !ck15.isChecked() && !ck16.isChecked()) {

                    score++;

                }
            }

            if (ck17.isChecked() || ck18.isChecked() || ck19.isChecked() || ck20.isChecked()) {

                if (!ck17.isChecked() && ck18.isChecked() && !ck19.isChecked() && !ck20.isChecked()) {

                    score++;

                }
            }

            if (ck21.isChecked() || ck22.isChecked() || ck23.isChecked() || ck24.isChecked()) {

                if (!ck21.isChecked() && !ck22.isChecked() && ck23.isChecked() && !ck24.isChecked()) {

                    score++;

                }
            }

            if (ck25.isChecked() || ck26.isChecked() || ck27.isChecked() || ck28.isChecked()) {

                if (!ck25.isChecked() && !ck26.isChecked() && !ck27.isChecked() && ck28.isChecked()) {

                    score++;

                }
            }

            if (ck29.isChecked() || ck30.isChecked() || ck31.isChecked() || ck32.isChecked()) {

                if (ck29.isChecked() && !ck30.isChecked() && !ck31.isChecked() && !ck32.isChecked()) {

                    score++;

                }
            }

            if (ck33.isChecked() || ck34.isChecked() || ck35.isChecked() || ck36.isChecked()) {

                if (!ck33.isChecked() && !ck34.isChecked() && ck35.isChecked() && !ck36.isChecked()) {

                    score++;

                }
            }

            if (ck37.isChecked() || ck38.isChecked() || ck39.isChecked() || ck40.isChecked()) {

                if (!ck37.isChecked() && ck38.isChecked() && !ck39.isChecked() && !ck40.isChecked()) {

                    score++;

                }
            }

            Toast.makeText(this, " score = " + score, Toast.LENGTH_SHORT).show();

            ck1.setEnabled(false);
            ck2.setEnabled(false);
            ck3.setEnabled(false);
            ck4.setEnabled(false);
            ck5.setEnabled(false);
            ck6.setEnabled(false);
            ck7.setEnabled(false);
            ck8.setEnabled(false);
            ck9.setEnabled(false);
            ck10.setEnabled(false);
            ck11.setEnabled(false);
            ck12.setEnabled(false);
            ck13.setEnabled(false);
            ck14.setEnabled(false);
            ck15.setEnabled(false);
            ck16.setEnabled(false);
            ck17.setEnabled(false);
            ck18.setEnabled(false);
            ck19.setEnabled(false);
            ck20.setEnabled(false);
            ck21.setEnabled(false);
            ck22.setEnabled(false);
            ck23.setEnabled(false);
            ck24.setEnabled(false);
            ck25.setEnabled(false);
            ck26.setEnabled(false);
            ck27.setEnabled(false);
            ck28.setEnabled(false);
            ck29.setEnabled(false);
            ck30.setEnabled(false);
            ck31.setEnabled(false);
            ck32.setEnabled(false);
            ck33.setEnabled(false);
            ck34.setEnabled(false);
            ck35.setEnabled(false);
            ck36.setEnabled(false);
            ck37.setEnabled(false);
            ck38.setEnabled(false);
            ck39.setEnabled(false);
            ck40.setEnabled(false);


            tv1.setVisibility(View.VISIBLE);
        }

        if (v.getId() == R.id.button1) {
            tv1.setVisibility(View.INVISIBLE);

            ck1.setChecked(false);
            ck2.setChecked(false);
            ck3.setChecked(false);
            ck4.setChecked(false);
            ck5.setChecked(false);
            ck6.setChecked(false);
            ck7.setChecked(false);
            ck8.setChecked(false);
            ck9.setChecked(false);
            ck10.setChecked(false);
            ck11.setChecked(false);
            ck12.setChecked(false);
            ck13.setChecked(false);
            ck14.setChecked(false);
            ck15.setChecked(false);
            ck16.setChecked(false);
            ck17.setChecked(false);
            ck18.setChecked(false);
            ck19.setChecked(false);
            ck20.setChecked(false);
            ck21.setChecked(false);
            ck22.setChecked(false);
            ck23.setChecked(false);
            ck24.setChecked(false);
            ck25.setChecked(false);
            ck26.setChecked(false);
            ck27.setChecked(false);
            ck28.setChecked(false);
            ck29.setChecked(false);
            ck30.setChecked(false);
            ck31.setChecked(false);
            ck32.setChecked(false);
            ck33.setChecked(false);
            ck34.setChecked(false);
            ck35.setChecked(false);
            ck36.setChecked(false);
            ck37.setChecked(false);
            ck38.setChecked(false);
            ck39.setChecked(false);
            ck40.setChecked(false);



            ck1.setEnabled(true);
            ck2.setEnabled(true);
            ck3.setEnabled(true);
            ck4.setEnabled(true);
            ck5.setEnabled(true);
            ck6.setEnabled(true);
            ck7.setEnabled(true);
            ck8.setEnabled(true);
            ck9.setEnabled(true);
            ck10.setEnabled(true);
            ck11.setEnabled(true);
            ck12.setEnabled(true);
            ck13.setEnabled(true);
            ck14.setEnabled(true);
            ck15.setEnabled(true);
            ck16.setEnabled(true);
            ck17.setEnabled(true);
            ck18.setEnabled(true);
            ck19.setEnabled(true);
            ck20.setEnabled(true);
            ck21.setEnabled(true);
            ck22.setEnabled(true);
            ck23.setEnabled(true);
            ck24.setEnabled(true);
            ck25.setEnabled(true);
            ck26.setEnabled(true);
            ck27.setEnabled(true);
            ck28.setEnabled(true);
            ck29.setEnabled(true);
            ck30.setEnabled(true);
            ck31.setEnabled(true);
            ck32.setEnabled(true);
            ck33.setEnabled(true);
            ck34.setEnabled(true);
            ck35.setEnabled(true);
            ck36.setEnabled(true);
            ck37.setEnabled(true);
            ck38.setEnabled(true);
            ck39.setEnabled(true);
            ck40.setEnabled(true);


        }


    }
}
