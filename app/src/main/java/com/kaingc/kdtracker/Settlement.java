package com.kaingc.kdtracker;

public class Settlement {
    private int settlementId, survivalLimit, deathCount, lanternYear, population;
    private String lifePrinciple, deathPrinciple, societyPrinciple, convictionPrinciple;
    private boolean innovationEvent, gameOverEvent, lifeEvent, deathEvent, societyEvent,
            lanternHoard, boneSmith, skinnery, organGrinder, catarium, weaponCrafter,
            leatherWorker, stoneCircle, barberSurgeon, plumery, blacksmith, maskMaker,
            whiteLion, screamingAntelope, phoenix;

    public Settlement() {}

    public Settlement(int aCampaignId) {
        this.settlementId = aCampaignId;
        this.survivalLimit = 1;
        this.deathCount = 0;
        this.lanternYear = 0;
        this.population = 0;
        this.lifePrinciple = "unselected";
        this.deathPrinciple = "unselected";
        this.societyPrinciple = "unselected";
        this.convictionPrinciple = "unselected";
        this.innovationEvent = false;
        this.gameOverEvent = false;
        this.lifeEvent = false;
        this.deathEvent = false;
        this.societyEvent = false;
        this.lanternHoard = false;
        this.boneSmith = false;
        this.skinnery = false;
        this.organGrinder = false;
        this.catarium = false;
        this.weaponCrafter = false;
        this.leatherWorker = false;
        this.stoneCircle = false;
        this.barberSurgeon = false;
        this.plumery = false;
        this.blacksmith = false;
        this.maskMaker = false;
        this.whiteLion = false;
        this.screamingAntelope = false;
        this.phoenix = false;
    }
}
