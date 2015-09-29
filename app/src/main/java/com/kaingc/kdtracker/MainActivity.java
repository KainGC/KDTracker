package com.kaingc.kdtracker;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.database.sqlite.*;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] campaignTest = {"campaign 1", "campaign 2"};

        ListView campaignList = (ListView) findViewById(R.id.campaignList);
        ArrayAdapter<String> campaignAdapter = new ArrayAdapter<>(MainActivity.this, R.layout.campaign_list_layout, R.id.campaign_name, campaignTest);
        campaignList.setAdapter(campaignAdapter);

        SQLiteDatabase campaignDB = openOrCreateDatabase("KingdomDeath", MODE_PRIVATE, null);
        campaignDB.execSQL("CREATE TABLE IF NOT EXISTS Campaigns(settlement_name VARCHAR, settlement_creator VARCHAR, settlement_status VARCHAR);");
        campaignDB.close();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void createCampaign(View view){
        //Launch create campaign activity
    }
}