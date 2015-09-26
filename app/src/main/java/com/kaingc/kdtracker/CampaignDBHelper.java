package com.kaingc.kdtracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CampaignDBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Campaigns.db";


    public CampaignDBHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS Campaigns(settlement_name varchar);");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables

        // create new tables
        onCreate(db);
    }
}
