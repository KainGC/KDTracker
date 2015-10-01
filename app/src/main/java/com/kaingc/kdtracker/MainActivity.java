package com.kaingc.kdtracker;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private static final String LOG = "MainActivity";
    CampaignDBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences sPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String creatorId = sPrefs.getString("kdm_uuid", null);

        if(creatorId == null)
        {
            SharedPreferences.Editor sPrefsEditor = sPrefs.edit();
            sPrefsEditor.putString("kdm_uuid", UUID.randomUUID().toString());
            sPrefsEditor.commit();
            creatorId = sPrefs.getString("kdm_uuid", null);
        }

        ArrayList<String> campaignNames = new ArrayList<>();
        RecyclerView.Adapter campaignAdapter;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView campaignListElement = (RecyclerView) findViewById(R.id.campaignList);


        db = new CampaignDBHelper(getApplicationContext());

        List<Campaign> campaignArray = db.getAllCampaigns(creatorId);

        // Test campaigns database
        /*for(int i = 0; i < campaignArray.size(); i++) {
            db.deleteCampaign(campaignArray.get(i).getCampaignId());
        }
        db.createCampaign(1);
        db.createCampaign(1);
        db.createCampaign(1);
        db.createCampaign(1);
        db.createCampaign(1);
        campaignArray = db.getAllCampaigns(1);*/

        if(campaignArray.size() <= 0) {
            Log.e(LOG, "The campaign list is empty");
            campaignNames.add("No settlements found");
            //campaignAdapter = new ArrayAdapter<>(MainActivity.this, R.layout.campaign_list_layout, R.id.campaign_name, campaignNames);
        }
        else
        {
            Campaign tempCampaign;
            for (int i = 0; i < campaignArray.size(); i++){
                tempCampaign = campaignArray.get(i);
                campaignNames.add(tempCampaign.getSettlementName());
            }
            //campaignAdapter = new ArrayAdapter<>(MainActivity.this, R.layout.campaign_list_layout, R.id.campaign_name, campaignNames);
        }
        //campaignListElement.setAdapter(campaignAdapter);

        db.closeDB();
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