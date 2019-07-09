package com.example.hp.pwd2;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class video_coursetailoring extends YouTubeBaseActivity {

    TextView t1;
    YouTubePlayerView v1;
    Button b1;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    String getValue;

String JSON_STRING,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_coursetailoring);

        b1 = (Button)findViewById(R.id.play);
        v1 = (YouTubePlayerView)findViewById(R.id.youtube);
        t1=(TextView)findViewById(R.id.t1);



        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                if(getValue.equals("Beginners Sewing Course Day1 : The Basics"))
                youTubePlayer.loadVideo("QmNVPJ5D77I");

                if(getValue.equals("Beginners Sewing Course Day2 : Fabric Prepartion"))
                    youTubePlayer.loadVideo("nPKTfnVA1PE&t");

                if(getValue.equals("How to Measure Yourself"))
                    youTubePlayer.loadVideo("YPuy5O8rPS4");

                if(getValue.equals("How to Finish A Seam"))
                    youTubePlayer.loadVideo("cfRUn7838Jo&t");

                if(getValue.equals("How to Trace DressMaking Pattern"))
                    youTubePlayer.loadVideo("wp1jt5M1D80");

                if(getValue.equals("How to Grade Increase Decrease Dress Making Pattern"))
                    youTubePlayer.loadVideo("dF4aqi64i1g");

                if(getValue.equals("What is Interlining and UnderLining"))
                    youTubePlayer.loadVideo("kbFtEo2e7lw");

                if(getValue.equals("New Model Blouse Cutting and Stiching Pattern"))
                    youTubePlayer.loadVideo("Efz9yQgyf8s");

                if(getValue.equals("Front Slit A line Kurti Salwar Kameez Marking"))
                    youTubePlayer.loadVideo("mP8TCRokpEI");

                if(getValue.equals("Beginners Sewing Course ZigZag stitches"))
                    youTubePlayer.loadVideo("mlwh7P-MjWs");

                if(getValue.equals("Mens Shirt Cutting and stitching"))
                    youTubePlayer.loadVideo("M1JdHlOc29o");


            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getValue =getIntent().getExtras().getString("value");
                v1.initialize(playerconfig.API_KEY,onInitializedListener);
                t1.setText(getValue);

               // new getEventJason().execute();
            }
        });

    }

    class getEventJason extends AsyncTask<Void, Void, String> {
        String url;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            url = "https://anmolgoel.000webhostapp.com/powerwithindisability/htmlphp/tailoring2.php";
        }



        @Override
        protected String doInBackground(Void... params) {
            try {
                URL url1 = new URL(url);
                HttpURLConnection httpURLConnection= (HttpURLConnection) url1.openConnection();
//                httpURLConnection.get
                InputStream inputStream= httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder= new StringBuilder();
                while ((JSON_STRING = bufferedReader.readLine())!=null){
                    stringBuilder.append(JSON_STRING+"\n");

                }

                if(JSON_STRING!=null)
                    Log.e("hello", "doInBackground: " );
                else
                    Log.e("byee", " front " );
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return stringBuilder.toString().trim();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }catch(Exception e)
            {
                e.printStackTrace();
            }

            return  null;
        }



        @Override
        protected void onPostExecute(String result) {
            //result.replaceAll("\"\"","a");
            s2=result.substring(39,(result.length()-5));
            System.out.print(result);
            t1.setText(s2);
            super.onPostExecute(result);
        }

}}

