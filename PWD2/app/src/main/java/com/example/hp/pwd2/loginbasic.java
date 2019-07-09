package com.example.hp.pwd2;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

public class loginbasic extends AppCompatActivity {

    EditText e1, e2;
    Button b1;
    String username,password;
    ProgressDialog progressDialog;
    public String check;
   // private final String server = "https://anmolgoel.000webhostapp.com/powerwithindisability/htmlphp/login.php";
    String s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginbasic);


        android.app.ActionBar actionBar = getActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        e1 = (EditText)findViewById(R.id.username);
        e2 = (EditText)findViewById(R.id.pass);

        b1 = (Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = e1.getText().toString();
                password = e2.getText().toString();



                 /*if (s2.equals("logged in")) {
                    Intent i1= new Intent(loginbasic.this,Events.class);
                    finish();

                } else {
                    Toast.makeText(loginbasic.this, "INVALID USERNAME AND PASSWORD", Toast.LENGTH_SHORT).show();
                }*/
                new getEventJason().execute();
            }

        });


        TextView tv = (TextView)findViewById(R.id.textView2);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginbasic.this , signup_basic.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(loginbasic.this, Events.class);
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    class getEventJason extends AsyncTask<Void, Void, String> {




        @Override
        protected String doInBackground(Void... voids) {

            ArrayList<NameValuePair> nameValuePairs = new ArrayList<>();
            nameValuePairs.add(new BasicNameValuePair("Login", "" + ""));
            nameValuePairs.add(new BasicNameValuePair("uname", username));
            nameValuePairs.add(new BasicNameValuePair("psw", password));
            String jsonData = QueryOnlineInterface.process("https://anmolgoel.000webhostapp.com/powerwithindisability/htmlphp/login-process2.php", "login", nameValuePairs, null);
            Log.e("yes",jsonData);
            return jsonData;
            //return null;
        }

        @Override
        protected void onPostExecute(String httpResponseMsg) {

//           Toast.makeText(loginbasic.this,s2, Toast.LENGTH_SHORT).show();
            super.onPostExecute(httpResponseMsg);
            s2=httpResponseMsg;
            if (httpResponseMsg.equals("logged in")) {
               // Toast.makeText(loginbasic.this, httpResponseMsg, Toast.LENGTH_SHORT).show();
                Toast.makeText(loginbasic.this, "Logged in", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(loginbasic.this , Events.class);
                finish();
            } else  {
                 Toast.makeText(loginbasic.this, "Incorrect", Toast.LENGTH_SHORT).show();
            }
            //Toast.makeText(loginbasic.this,httpResponseMsg, Toast.LENGTH_SHORT).show();
        }
    }


}
