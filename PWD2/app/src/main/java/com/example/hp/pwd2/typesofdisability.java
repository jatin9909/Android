package com.example.hp.pwd2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class typesofdisability extends AppCompatActivity {

    static typesofdisability INSTANCE;
    ListView lv ;
    String[] disability = {"Blindness", "Low-vision", "Leprosy-cured", "Hearing Imapairment", "Loco motor disability", "Mental retardation", "Mental Illness"};
    String getdis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typesofdisability);
        lv = (ListView)findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, disability);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                 getdis =  (lv.getItemAtPosition(i).toString());

                if(i == 0){

                    Intent i1 = new Intent(typesofdisability.this , loginbasic.class);
                    startActivity(i1);
                }

                if(i == 1){
                    Intent i2 = new Intent(typesofdisability.this , loginbasic.class);
                    startActivity(i2);
                }

                if(i == 2){
                    Intent i3 = new Intent(typesofdisability.this , loginbasic.class);
                    startActivity(i3);
                }

                if(i == 3){
                    Intent i4 = new Intent(typesofdisability.this , loginbasic.class);
                    startActivity(i4);

                }

                if(i == 4){
                    Intent i5 = new Intent(typesofdisability.this , loginbasic.class);
                    startActivity(i5);
                }

                if(i == 5){
                    Intent i6 = new Intent(typesofdisability.this , login_mental.class);
                    startActivity(i6);
                }

                if(i == 6){
                    Intent i7 = new Intent(typesofdisability.this , login_mental.class);
                    startActivity(i7);
                }


            }
        });
    }

    public static typesofdisability getActivityInstance()
    {
        return INSTANCE;
    }

    public String getData()
    {
        return this.getdis;
    }
}

