package com.kaingc.kdtracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class CampaignDBHelper extends SQLiteOpenHelper {
    // Logcat tag
    private static final String LOG = "DatabaseHelper";

    //Database and version
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "KingdomDeath.db";

    //Tables
    private static final String CAMPAIGNS_TABLE = "campaigns";
    private static final String CAMPAIGN_DATA_TABLE = "campaign_data";
    private static final String RESOURCES_TABLE = "resources";
    private static final String PLAYERS_TABLE = "players";
    private static final String CAMPAIGN_RESOURCES_TABLE = "campaign_resources";
    private static final String GEAR_TABLE = "gear";

    //Campaign Variables
    private static final String CAMPAIGN_ID = "campaign_id";
    private static final String SETTLEMENT_NAME = "settlement_name";
    private static final String SETTLEMENT_CREATOR_ID = "settlement_creator_id";
    private static final String SETTLEMENT_CREATOR_NAME = "settlement_creator_name";

    //Settlement Variables
    private static final String SETTLEMENT_ID = "settlement_id";
    private static final String SURVIVAL_LIMIT = "survival_limit";
    private static final String DEATH_COUNT = "death_count";
    private static final String LANTERN_YEAR = "lantern_year";
    private static final String LIFE_PRINCIPLE = "life_principle";
    private static final String DEATH_PRINCIPLE = "death_principle";
    private static final String SOCIETY_PRINCIPLE = "society_principle";
    private static final String CONVICTION_PRINCIPLE = "conviction_principle";
    private static final String INNOVATION_EVENT = "innovation_event";
    private static final String LIFE_EVENT = "life_event";
    private static final String DEATH_EVENT = "death_event";
    private static final String SOCIETY_EVENT = "society_event";
    private static final String LANTERN_HOARD = "lantern_hoard";
    private static final String BONE_SMITH = "bone_smith";
    private static final String SKINNERY = "skinnery";
    private static final String ORGAN_GRINDER = "organ_grinder";
    private static final String CATARIUM = "catarium";
    private static final String WEAPON_CRAFTER = "weapon_crafter";
    private static final String LEATHER_WORKER = "leather_worker";
    private static final String STONE_CIRCLE = "stone_circle";
    private static final String BARBER_SURGEON = "barber_surgeon";
    private static final String PLUMERY = "plumery";
    private static final String BLACKSMITH = "blacksmith";
    private static final String MASK_MAKER = "mask_maker";
    private static final String WHITE_LION = "white_lion";
    private static final String SCREAMING_ANTELOPE = "screaming_antelope";
    private static final String PHOENIX = "phoenix";

    //Resource Variables
    private static final String RESOURCE_ID = "resource_id";
    private static final String RESOURCE_NAME = "resource_name";

    private static final String CREATE_CAMPAIGN_TABLE = "CREATE TABLE IF NOT EXISTS "
            + CAMPAIGNS_TABLE + "("
            + CAMPAIGN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SETTLEMENT_NAME + " TEXT,"
            + SETTLEMENT_CREATOR_ID + " INTEGER);";

    private static final String CREATE_CAMPAIGN_DATA_TABLE = "CREATE TABLE IF NOT EXISTS "
            + CAMPAIGN_DATA_TABLE + "("
            + SETTLEMENT_ID + " INTEGER PRIMARY KEY,"
            + SURVIVAL_LIMIT + " INTEGER,"
            + DEATH_COUNT + " INTEGER,"
            + LANTERN_YEAR + " INTEGER,"
            + LIFE_PRINCIPLE + " TEXT,"
            + DEATH_PRINCIPLE + " TEXT,"
            + SOCIETY_PRINCIPLE + " TEXT,"
            + CONVICTION_PRINCIPLE + " TEXT,"
            + INNOVATION_EVENT + " INTEGER,"
            + LIFE_EVENT + " INTEGER,"
            + DEATH_EVENT + " INTEGER,"
            + SOCIETY_EVENT + " INTEGER,"
            + LANTERN_HOARD  + " BOOLEAN,"
            + BONE_SMITH + " BOOLEAN,"
            + SKINNERY + " BOOLEAN,"
            + ORGAN_GRINDER + " BOOLEAN,"
            + CATARIUM + " BOOLEAN,"
            + WEAPON_CRAFTER + " BOOLEAN,"
            + LEATHER_WORKER + " BOOLEAN,"
            + STONE_CIRCLE + " BOOLEAN,"
            + BARBER_SURGEON + " BOOLEAN,"
            + PLUMERY + " BOOLEAN,"
            + BLACKSMITH + " BOOLEAN,"
            + MASK_MAKER + " BOOLEAN,"
            + WHITE_LION + " BOOLEAN,"
            + SCREAMING_ANTELOPE + " BOOLEAN,"
            + PHOENIX + " BOOLEAN,"
            + "FOREIGN KEY(" + SETTLEMENT_ID + ") REFERENCES " + CAMPAIGNS_TABLE + "(" + CAMPAIGN_ID + "));";

    private static final String CREATE_RESOURCES_TABLE = "CREATE TABLE IF NOT EXISTS "
            + RESOURCES_TABLE + "("
            + RESOURCE_ID + " INT PRIMARY KEY"
            + RESOURCE_NAME + " TEXT);";

    public CampaignDBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CAMPAIGN_TABLE);
        db.execSQL(CREATE_CAMPAIGN_DATA_TABLE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + CAMPAIGNS_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + CAMPAIGN_DATA_TABLE);
        // create new tables
        onCreate(db);
    }

    public List<Campaign> getAllCampaigns(int aCreatorId){
        List<Campaign> campaigns = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT * FROM " + CAMPAIGNS_TABLE + " WHERE "
                + SETTLEMENT_CREATOR_ID + "=" + aCreatorId;
        Cursor c = db.rawQuery(selectQuery, null);

        if(c.moveToFirst()) {
            do{
                Campaign campaign = new Campaign();
                campaign.setCampaignId(c.getInt(c.getColumnIndex(CAMPAIGN_ID)));
                campaign.setSettlementName(c.getString(c.getColumnIndex(SETTLEMENT_NAME)));
                campaign.setSettlementCreator(c.getString(c.getColumnIndex(SETTLEMENT_CREATOR_ID)));

                campaigns.add(campaign);
            }
            while(c.moveToNext());
        }

        return campaigns;
    }

    public long createCampaign(int aCreatorId) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(SETTLEMENT_NAME, "");
        values.put(SETTLEMENT_CREATOR_ID, aCreatorId);

        return db.insert(CAMPAIGNS_TABLE, null, values);
    }

    public Campaign getCampaign(int aCampaignId) {
        Campaign campaign = new Campaign();
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT * FROM " + CAMPAIGNS_TABLE
                + " WHERE " + CAMPAIGN_ID + "=" +aCampaignId;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if(c.moveToFirst()){
            do{
                campaign.setCampaignId(c.getInt(c.getColumnIndex(CAMPAIGN_ID)));
                campaign.setSettlementName(c.getString(c.getColumnIndex(SETTLEMENT_NAME)));
                campaign.setSettlementCreator(c.getString(c.getColumnIndex(SETTLEMENT_CREATOR_ID)));
            }
            while(c.moveToNext());
        }

        return campaign;
    }

    public int updateCampaign(Campaign aCampaign) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(SETTLEMENT_NAME, aCampaign.getSettlementName());

        return db.update(CAMPAIGNS_TABLE, values, CAMPAIGN_ID + "=?", new String[] {String.valueOf(aCampaign.getCampaignId())});
    }

    public void deleteCampaign(int aCampaignId) {
        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(CAMPAIGNS_TABLE, CAMPAIGN_ID + "=?", new String[]{String.valueOf(aCampaignId)});
    }

    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }
}
