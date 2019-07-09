package com.example.hp.pwd2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class course_basic_computing_basic extends AppCompatActivity {

    Spinner spinner , spinner1 , spinner2 , spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_basic_computing_basic);

        android.app.ActionBar actionBar = getActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        spinner = (Spinner)findViewById(R.id.spin);
        String[] content = {" Week 1: Microsoft Word" , "Microsoft Word pt 1 Enter , Edit , Backspace , Save , Print" , "Microsoft Word pt 2 Fonts , Alignment, Borders, Bullets, Tab stop",
                "Microsoft Word pt 3 Insert picture, Table , Clip art , Header footer, Date, Samrt Art, Chart" ,
                "Microsoft Word pt 4 Insert Cover page, Table, Picture, Clip art, Smart Art" , "Microsoft Word pt 5 Hyperlink, Bookmark, Header Fooder, Page number, Drop cap",
                "Microsoft Word pt 6 Page Setup, Orientation, Margins, Breaks, Line number", "Microsoft Word 7 Table of Content, Bibliography, Footnote, Index" ,
                " Microsoft Word pt 8 Create Mail Merge Letter, Envelopes and Labels",  "MS Word Book" , "MS Word Tutorial" , "Week 1 : MS Word Assessment"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, content);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spinner.setSelection( 0 );

                switch (i){
                    case 11:
                        Intent intent = new Intent(course_basic_computing_basic.this, msword_assesment.class);
                        startActivity(intent);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





        spinner1 = (Spinner)findViewById(R.id.spin1);
        String[] content1 = { "Week 2: Microsoft PowerPoint " , "Add slides, picture, chart, transition, Design" , "Animation, Rehearse timings, Add Sound Video "
                , "Rehearse Timings, Insert Sound, slide master & more" , "How To Insert Embed Video In PowerPoint" , "How to make Portfolio Layout in PowerPoint"
                , "PowerPoint Animation Tutorial" , "MS PowerPoint Book" , "Ms PowerPoint Tutorial", "Week 2: MS PowerPoint Final Assessment"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, content1);
        spinner1.setAdapter(adapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spinner1.setSelection( 0 );

                switch (i){
                    case 9:
                        Intent intent = new Intent(course_basic_computing_basic.this, mspowerpoint_assesment.class);
                        startActivity(intent);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        spinner2 = (Spinner)findViewById(R.id.spin2);
        String[] content2 ={ " Week 3: Microsoft Excel", "Microsoft Excel Part 1" , "Microsoft Excel Part 2", "Microsoft Excel Part 3", "Microsoft Excel part 4 Charts",
                "Microsoft Excel part 5 Name ranges, Absolute reference, Conditional format" , "Microsoft Excel pt 6 If Function, Sub Total, Vlookup 1" , "Microsoft Excel pt 7 Sort Filter, Freeze, Pivot Table" , "MS Excel" , "MS Excel Tutorial" , "Week 3: Ms Excel Final Assessment"};

        ArrayAdapter<String>adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, content2);
        spinner2.setAdapter(adapter2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spinner2.setSelection( 0 );

                switch (i){
                    case 10:
                        Intent intent = new Intent(course_basic_computing_basic.this, msexcel_assesment.class);
                        startActivity(intent);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spinner3 = (Spinner)findViewById(R.id.spin3);
        String [] content3 = {"Week 4: Microsoft Access" , "Microsoft Access Part 1: Tables, Forms" , "Microsoft Access Part 2: Tables, Query, Reports",
                "Table Relationships" ,"Query Expression Builder" , "Create Tab, Navigation Form, Calculate Fields" , "Microsoft Access pt 6 Report Invoice, Macro Find, Email, Print, Search",
                "Microsoft Access pt 7 Auto Complete & input box on form" , "Cascading Combo Box" ,"Invoice PAyments & Dlookups" , "Adding Buttons on Form" ,"MS Access Book" , "Ms Access Tutorial Point" , "week 4: Ms Access Final Assessment" };

        ArrayAdapter<String>adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,content3);
        spinner3.setAdapter(adapter3);

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spinner3.setSelection( 0 );

                switch (i){
                    case 13:
                        Intent intent = new Intent(course_basic_computing_basic.this, mspowerpoint_assesment.class);
                        startActivity(intent);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(course_basic_computing_basic.this, Tab1.class);
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}
