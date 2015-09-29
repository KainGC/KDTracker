package com.kaingc.kdtracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CampaignDBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "KingdomDeath.db";

    public static final String CAMPAIGNS_TABLE = "campaigns";
    public static final String CAMPAIGN_DATA_TABLE = "campaign_data";
    public static final String RESOURCES_TABLE = "resources";

    //Campaign Variables
    public static final String CAMPAIGN_ID = "campaign_id";
    public static final String SETTLEMENT_NAME = "settlement_name";
    public static final String SETTLEMENT_CREATOR_ID = "settlement_creator_id";

    //Settlement Variables
    public static final String SETTLEMENT_ID = "settlement_id";
    public static final String SURVIVAL_LIMIT = "survival_limit";
    public static final String DEATH_COUNT = "death_count";
    public static final String LANTERN_YEAR = "lantern_year";
    public static final String LIFE_PRINCIPLE = "life_principle";
    public static final String DEATH_PRINCIPLE = "death_principle";
    public static final String SOCIETY_PRINCIPLE = "society_principle";
    public static final String CONVICTION_PRINCIPLE = "conviction_principle";
    public static final String INNOVATION_EVENT = "innovation_event";
    public static final String LIFE_EVENT = "life_event";
    public static final String DEATH_EVENT = "death_event";
    public static final String SOCIETY_EVENT = "society_event";
    public static final String LANTERN_HOARD = "lantern_hoard";
    public static final String BONE_SMITH = "bone_smith";
    public static final String SKINNERY = "skinnery";
    public static final String ORGAN_GRINDER = "organ_grinder";
    public static final String CATARIUM = "catarium";
    public static final String WEAPON_CRAFTER = "weapon_crafter";
    public static final String LEATHER_WORKER = "leather_worker";
    public static final String STONE_CIRCLE = "stone_circle";
    public static final String BARBER_SURGEON = "barber_surgeon";
    public static final String PLUMERY = "plumery";
    public static final String BLACKSMITH = "blacksmith";
    public static final String MASK_MAKER = "mask_maker";
    public static final String WHITE_LION = "white_lion";
    public static final String SCREAMING_ANTELOPE = "screaming_antelope";
    public static final String PHOENIX = "phoenix";



    public static final String CREATE_CAMPAIGN_TABLE = "CREATE TABLE "
            + CAMPAIGNS_TABLE + "("
            + CAMPAIGN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SETTLEMENT_NAME + " TEXT,"
            + SETTLEMENT_CREATOR_ID + " INTEGER);";

    public static final String CREATE_CAMPAIGN_DATA_TABLE = "CREATE TABLE "
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

    public CampaignDBHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
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


}
