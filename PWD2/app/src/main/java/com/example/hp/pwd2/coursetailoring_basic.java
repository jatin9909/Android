package com.example.hp.pwd2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class coursetailoring_basic extends AppCompatActivity {

    YouTubePlayerView v1;
    Button b1;
    YouTubePlayer.OnInitializedListener onInitializedListener;


    private Course_Tailoring.OnFragmentInteractionListener mListener;

    Spinner spinner , spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursetailoring_basic);


        //   b1 = (Button)findViewById(R.id.play);
        // v1 = (YouTubePlayerView)findViewById(R.id.youtube);
        //onInitializedListener = new YouTubePlayer.OnInitializedListener() {
        //  @Override
        //public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

//                youTubePlayer.loadVideo("srH-2pQdKhg");
        //          }

        //        @Override
        //      public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {


        ;


        spinner = (Spinner) findViewById(R.id.spin);

        android.app.ActionBar actionBar = getActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        String[] content = {"Week 1:", "Beginners Sewing Course Day1 : The Basics", "Beginners Sewing Course Day2 : Fabric Prepartion"
                , "How to Measure Yourself", "How to Finish A Seam", "How to Trace DressMaking Pattern", "How to Grade Increase Decrease Dress Making Pattern"
                , "Cutting and Tailoring", "Machine Embroidery Book", "Indian Garment Design Course Book", " Week 1 : Assessment"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, content);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String s="";

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner.setSelection(0);

                switch (i) {
                    case 1:  s=spinner.getItemAtPosition(1).toString();
                        Intent intent = new Intent(coursetailoring_basic.this,  video_coursetailoring.class);
                        intent.putExtra("value", s);
                        startActivity(intent);
                        break;
                    case 2:  s=spinner.getItemAtPosition(2).toString();
                        Intent i1 = new Intent(coursetailoring_basic.this,  video_coursetailoring.class);
                        i1.putExtra("value", s);
                        startActivity(i1);
                        break;
                    case 3:s=spinner.getItemAtPosition(3).toString();
                        Intent i2 = new Intent(coursetailoring_basic.this,  video_coursetailoring.class);
                        i2.putExtra("value", s);
                        startActivity(i2);
                        break;
                    case 4:s=spinner.getItemAtPosition(4).toString();
                        Intent i3 = new Intent(coursetailoring_basic.this,  video_coursetailoring.class);
                        i3.putExtra("value", s);
                        startActivity(i3);
                        break;
                    case 5:s=spinner.getItemAtPosition(5).toString();
                        Intent i4 = new Intent(coursetailoring_basic.this,  video_coursetailoring.class);
                        i4.putExtra("value", s);
                        startActivity(i4);
                        break;
                    case 6: s=spinner.getItemAtPosition(6).toString();
                        Intent i5 = new Intent(coursetailoring_basic.this,  video_coursetailoring.class);
                        i5.putExtra("value", s);
                        startActivity(i5);
                        break;
                    case 7: s=spinner.getItemAtPosition(7).toString();
                        Intent i6 = new Intent(coursetailoring_basic.this, tailoring_pdf1.class);
                        i6.putExtra("value",s);
                        startActivity(i6);
                        break;

                    case 8:s=spinner.getItemAtPosition(8).toString();
                        Intent i7 = new Intent(coursetailoring_basic.this, tailoring_pdf2.class);
                        i7.putExtra("value",s);
                        startActivity(i7);
                        break;

                    case 9: s=spinner.getItemAtPosition(9).toString();
                        Intent i8 = new Intent(coursetailoring_basic.this, tailoring_pdf3.class);
                        i8.putExtra("value",s);
                        startActivity(i8);
                        break;


                    case 10:
                        Intent intent1 = new Intent(coursetailoring_basic.this, tailoring_assesment.class);
                        startActivity(intent1);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        spinner1 = (Spinner) findViewById(R.id.spin1);
        String[] content1 = {"Week 2:" , "What is Interlining and UnderLining", "New Model Blouse Cutting and Stiching Pattern"
                , "Front Slit A line Kurti Salwar Kameez Marking", "Beginners Sewing Course ZigZag stitches", "Mens Shirt Cutting and stitching"
                , "Practical Sewing and dress Making", "Sewing and Design", "Final Assessment"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, content1);
        spinner1.setAdapter(adapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String s="" ;
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner1.setSelection(0);

                switch (i) {
                    case 1: s=spinner1.getItemAtPosition(1).toString();
                        Intent intent = new Intent(coursetailoring_basic.this, video_coursetailoring.class);
                        intent.putExtra("value", s);
                        startActivity(intent);
                        break;

                    case 2: s=spinner1.getItemAtPosition(2).toString();
                        Intent i1 = new Intent(coursetailoring_basic.this, video_coursetailoring.class);
                        i1.putExtra("value", s);
                        startActivity(i1);
                        break;

                    case 3: s=spinner1.getItemAtPosition(3).toString();
                        Intent i2 = new Intent(coursetailoring_basic.this, video_coursetailoring.class);
                        i2.putExtra("value", s);
                        startActivity(i2);
                        break;

                    case 4: s=spinner1.getItemAtPosition(4).toString();
                        Intent i3 = new Intent(coursetailoring_basic.this, video_coursetailoring.class);
                        i3.putExtra("value", s);
                        startActivity(i3);
                        break;

                    case 5: s=spinner1.getItemAtPosition(5).toString();
                        Intent i4 = new Intent(coursetailoring_basic.this, video_coursetailoring.class);
                        i4.putExtra("value", s);
                        startActivity(i4);
                        break;

                    case 6: s=spinner1.getItemAtPosition(7).toString();
                        Intent i6 = new Intent(coursetailoring_basic.this, tailoring_pdf4.class);
                        i6.putExtra("value",s);
                        startActivity(i6);
                        break;


                    case 7: s=spinner1.getItemAtPosition(8).toString();
                        Intent i7 = new Intent(coursetailoring_basic.this, tailoring_pdf5.class);
                        i7.putExtra("value",s);
                        startActivity(i7);
                        break;


                    case 8:
                        Intent intent1 = new Intent(coursetailoring_basic.this, tailoring_assesment1.class);
                        startActivity(intent1);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    /*   b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1.initialize(playerconfig.API_KEY,onInitializedListener);
            }
        }); */
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(coursetailoring_basic.this, Tab1.class);
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


   /* @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        youTubePlayer.loadVideo("srH-2pQdKhg");

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    } */
}


