package com.example.hp.pwd2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.channels.InterruptedByTimeoutException;

public class login_mental extends AppCompatActivity {

    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mental);


        android.app.ActionBar actionBar = getActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        b1 = (Button) findViewById(R.id.button);
        TextView tv = (TextView) findViewById(R.id.textView2);
         e1 = (EditText) findViewById(R.id.username);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login_mental.this, signup_mental.class);
                startActivity(intent);


            }


        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                if (s1.equals("1234567890")){
                    Toast.makeText(login_mental.this, "Logeed in", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(login_mental.this , Events.class);
                    finish();
                }

                else{
                    Toast.makeText(login_mental.this, "Failed", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }


        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    Intent intent = new Intent(login_mental.this, Events.class);
                    finish();
                    return true;
            }

            return super.onOptionsItemSelected(item);
        }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


    }

