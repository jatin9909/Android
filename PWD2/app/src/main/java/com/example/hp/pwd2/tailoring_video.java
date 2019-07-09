/*package com.example.hp.pwd2;

import android.content.Context;
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

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class tailoring_video extends YouTubeBaseActivity {

    TextView t1;
    YouTubePlayerView v1;
    Button b1;
    ArrayList<NameValuePair> nameValuePairs;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    String JSON_STRING,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tailoring_video);

        b1 = (Button)findViewById(R.id.play);
        v1 = (YouTubePlayerView)findViewById(R.id.youtube);
        t1=(TextView)findViewById(R.id.t1);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo(s2);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameValuePairs.add(new BasicNameValuePair("SIGNUP", "" + ""));
                nameValuePairs.add(new BasicNameValuePair("name",));

                v1.initialize(playerconfig.API_KEY,onInitializedListener);
                new getEventJason().execute();
            }
        });

    }

    class getEventJason extends AsyncTask<Void, Void, Void> {
        Context context;




        @Override
        protected Void doInBackground(Void... parms) {

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
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
        }


    }
    }

*/