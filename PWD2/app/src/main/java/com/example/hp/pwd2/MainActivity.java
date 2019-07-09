package com.example.hp.pwd2;

import android.content.Intent;
import android.net.Network;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerlayout;
    private ActionBarDrawerToggle ntogg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerlayout = (DrawerLayout) findViewById(R.id.drawer);
        ntogg = new ActionBarDrawerToggle(this,mDrawerlayout,R.string.open , R.string.close);
        mDrawerlayout.addDrawerListener(ntogg);
        NavigationView mDrawer = (NavigationView) findViewById(R.id.nv);
        ntogg.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setupDrawerContent(mDrawer);

        Fragment myFragment = null;
        try {
             myFragment = (Fragment) Events.class.newInstance();

        }
        catch (Exception e) {
            e.printStackTrace();
        }


        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flcontent,myFragment).commit();



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

   @Override
    public boolean onOptionsItemSelected(MenuItem item){

       int id = item.getItemId();
       if (ntogg.onOptionsItemSelected(item)){
           return true;
       }

       if (id == R.id.action_settings) {

           startActivityForResult(new Intent(android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS), 0);
           return true;
       }

       return super.onOptionsItemSelected(item);


   }

   @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
   public void selectItemDrawer(MenuItem menuItem){
        Fragment myFragment = null;
        Class fragmentClass = null;

        switch(menuItem.getItemId()){
            case R.id.event:
                fragmentClass = Events.class;
                break;


            case R.id.search:
                fragmentClass = Search.class;
                break;

            case R.id.settings:
                fragmentClass = Settings.class;
                break;

            case R.id.login:
                fragmentClass = Login.class;
                break;

        }

        try{
            myFragment = (Fragment) fragmentClass.newInstance();
         }
        catch (Exception e){
              e.printStackTrace();
        }

       FragmentManager fragmentManager = getSupportFragmentManager();
       fragmentManager.beginTransaction().replace(R.id.flcontent,myFragment).commit();
       menuItem.setChecked(true);
       setTitle(menuItem.getTitle());
       mDrawerlayout.closeDrawers();


   }




   private void setupDrawerContent(NavigationView navigationView){
       navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
              selectItemDrawer(item);
               return true;
           }
       });
   }




}
