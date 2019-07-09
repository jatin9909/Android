package com.example.hp.pwd2;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class signup_basic extends AppCompatActivity {

    Spinner spinner, spinner2;
    Button b1;
    EditText Fname, Lname, email, Pass, Cpass;
    EditText Age, cnum, adress;
    ArrayList<NameValuePair> nameValuePairs;
    public String check;
    String getfname;
    String getlName;
    String getemail;
    String getpass;
    String getcpass;
    String getage;
    String getnum;
    String getaddress;
    String disbaility;
    String Gender;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_basic);

        Fname = (EditText) findViewById(R.id.fname);
        Lname = (EditText) findViewById(R.id.lname);
        email = (EditText) findViewById(R.id.Email);
        Pass = (EditText) findViewById(R.id.pass);
        Cpass = (EditText) findViewById(R.id.cpass);

        Age = (EditText) findViewById(R.id.age);
        cnum = (EditText) findViewById(R.id.number);
        adress = (EditText) findViewById(R.id.address);

        b1 = (Button) findViewById(R.id.button);



        spinner2 = (Spinner) findViewById(R.id.spin2);
        String[] Disability = {"Blindness", "Low-vision", "Leprosy-cured", "Hearing Imapairment", "Loco motor disability", "Mental retardation", "Mental Illness"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, Disability);
        spinner2.setAdapter(adapter1);


        spinner = (Spinner) findViewById(R.id.spin);
        String[] SEX = {" Male", "Female ", " Transgender"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, SEX);
        spinner.setAdapter(adapter);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getfname = Fname.getText().toString();
                getlName = Lname.getText().toString();
                getemail = email.getText().toString();
                getpass = Pass.getText().toString();
                getcpass = Cpass.getText().toString();
                getage = Age.getText().toString();
                getnum = cnum.getText().toString();
                getaddress = adress.getText().toString();
                Gender = spinner.getSelectedItem().toString();
                disbaility = spinner2.getSelectedItem().toString();

                if (getfname.equals("") || getfname.length() == 0 || Gender.equals("") || disbaility.equals("") || disbaility.length() == 0
                        || Gender.length() == 0 || getlName.equals("") || getlName.length() == 0 || getemail.equals("") || getemail.length() == 0
                        || getpass.equals("") || getpass.length() == 0 || getcpass.equals("") || getcpass.length() == 0
                        || getage.equals("") || getage.length() == 0 || getnum.equals("") || getnum.length() == 0
                        || getaddress.equals("") || getaddress.length() == 0) {
                    Toast.makeText(signup_basic.this, " All fields are requires", Toast.LENGTH_SHORT).show();
                } else {


                    Log.i("Enter", "In ELse part of nameValur Pair");

                    nameValuePairs = new ArrayList<>();
                    nameValuePairs.add(new BasicNameValuePair("SIGNUP", "" + ""));
                    nameValuePairs.add(new BasicNameValuePair("fname", getfname));
                    nameValuePairs.add(new BasicNameValuePair("lname", getlName));
                    nameValuePairs.add(new BasicNameValuePair("gender", Gender));
                    nameValuePairs.add(new BasicNameValuePair("age", getage));
                    nameValuePairs.add(new BasicNameValuePair("email", getemail));
                    nameValuePairs.add(new BasicNameValuePair("password", getpass));
                    nameValuePairs.add(new BasicNameValuePair("confirmpassword", getcpass));
                    nameValuePairs.add(new BasicNameValuePair("phoneNumber", getnum));
                    nameValuePairs.add(new BasicNameValuePair("disability", disbaility));
                    nameValuePairs.add(new BasicNameValuePair("address", getaddress));

                    Toast.makeText(signup_basic.this, "Signing up...", Toast.LENGTH_SHORT).show();
                    new getEventJason().execute();
                    Intent i = new Intent(signup_basic.this, Events.class);
                    finish();





                }


            }
        });


        android.app.ActionBar actionBar = getActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(signup_basic.this, Events.class);
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    class getEventJason extends AsyncTask<String, Void, String> {
        Context context;




        @Override
        protected String doInBackground(String... parms) {

            int success;



            Log.i("Enter", nameValuePairs.size() + "");

            String jsonData = QueryOnlineInterface.process("https://anmolgoel.000webhostapp.com/powerwithindisability/htmlphp/register.php", " register", nameValuePairs, null);

            //String jsonData = QueryOnlineInterface.process("http://cshansraj.in/announcementsJson.php", null,null, null);



              //ohh okk intead of loachost should we try with ip address?? wait
            if (jsonData == "byeeee") {
                Log.e("yes", jsonData);
            } else {
                Log.e("no", jsonData);
            }
            return check;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
         }


        }
    }










