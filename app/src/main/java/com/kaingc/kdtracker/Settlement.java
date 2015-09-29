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

    public void setSettlementId(int aId) {
        this.settlementId = aId;
    }

    public int getSettlementId() {
        return this.settlementId;
    }

    public void setSurvivalLimit(int aSurvival) {
        this.survivalLimit = aSurvival;
    }

    public int getSurvivalLimit() {
        return this.survivalLimit;
    }

    public void setDeathCount(int aDeathCount) {
        this.deathCount = aDeathCount;
    }

    public int getDeathCount() {
        return this.deathCount;
    }

    public void setLanternYear(int aLanternYear) {
        this.lanternYear = aLanternYear;
    }

    public int getLanternYear() {
        return this.lanternYear;
    }

    public void setPopulation(int aPopulation) {
        this.population = aPopulation;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setLifePrinciple(String aPrinciple) {
        this.lifePrinciple = aPrinciple;
    }

    public String getLifePrinciple() {
        return this.lifePrinciple;
    }

    public void setDeathPrinciple(String aPrinciple) {
        this.deathPrinciple = aPrinciple;
    }

    public String getDeathPrinciple() {
        return this.deathPrinciple;
    }

    public void setSocietyPrinciple(String aPrinciple) {
        this.societyPrinciple = aPrinciple;
    }

    public String getSocietyPrinciple() {
        return this.societyPrinciple;
    }

    public void setConvictionPrinciple(String aPrinciple) {
        this.convictionPrinciple = aPrinciple;
    }

    public String getConvictionPrinciple() {
        return this.convictionPrinciple;
    }

    public void setInnovationEvent(boolean aEvent) {
        this.innovationEvent = aEvent;
    }

    public boolean getInnovationEvent() {
        return this.innovationEvent;
    }

    public void setGameOverEvent(boolean aEvent) {
        this.gameOverEvent = aEvent;
    }

    public boolean getGameOverEvent() {
        return this.gameOverEvent;
    }

    public void setLifeEvent(boolean aEvent){
        this.lifeEvent = aEvent;
    }

    public boolean getLifeEvent() {
        return this.lifeEvent;
    }

    public void setDeathEvent(boolean aEvent) {
        this.deathEvent = aEvent;
    }

    public boolean getDeathEvent() {
        return this.deathEvent;
    }

    public void setSocietyEvent(boolean aEvent) {
        this.societyEvent = aEvent;
    }

    public boolean getSocietyEvent() {
        return this.societyEvent;
    }

    public void setLanternHoard(boolean isOwned) {
        this.lanternHoard = isOwned;
    }

    public boolean getLanternHoard() {
        return this.lanternHoard;
    }

    public void setBoneSmith(boolean isOwned) {
        this.boneSmith = isOwned;
    }

    public boolean getBoneSmith() {
        return this.boneSmith;
    }

    public void setSkinnery(boolean isOwned) {
        this.skinnery = isOwned;
    }

    public boolean getSkinnery() {
        return this.skinnery;
    }

    public void setOrganGrinder(boolean isOwned) {
        this.organGrinder = isOwned;
    }

    public boolean getOrganGrinder() {
        return this.organGrinder;
    }

    public void setCatarium(boolean isOwned) {
        this.catarium = isOwned;
    }

    public boolean getCatarium() {
        return this.catarium;
    }

    public void setWeaponCrafter(boolean isOwned) {
        this.weaponCrafter = isOwned;
    }

    public boolean getWeaponCrafter() {
        return this.weaponCrafter;
    }

    public void setLeatherWorker(boolean isOwned) {
        this.leatherWorker = isOwned;
    }

    public boolean getLeatherWorker() {
        return this.leatherWorker;
    }

    public void setStoneCircle(boolean isOwned) {
        this.stoneCircle = isOwned;
    }

    public boolean getStoneCircle() {
        return this.stoneCircle;
    }

    public void setBarberSurgeon(boolean isOwned) {
        this.barberSurgeon = isOwned;
    }

    public boolean getBarberSurgeon() {
        return this.barberSurgeon;
    }

    public void setPlumery(boolean isOwned) {
        this.plumery = isOwned;
    }

    public boolean getPlumery() {
        return this.plumery;
    }

    public void setBlacksmith(boolean isOwned) {
        this.blacksmith = isOwned;
    }

    public boolean getBlacksmith() {
        return this.blacksmith;
    }

    public void setMaskMaker(boolean isOwned) {
        this.maskMaker = isOwned;
    }

    public boolean getMaskMaker() {
        return this.maskMaker;
    }

    public void setWhiteLion(boolean isQuarry) {
        this.whiteLion = isQuarry;
    }

    public boolean getWhiteLion() {
        return this.whiteLion;
    }

    public void setScreamingAntelope(boolean isQuarry) {
        this.screamingAntelope = isQuarry;
    }

    public boolean getScreamingAntelope() {
        return this.screamingAntelope;
    }

    public void setPhoenix(boolean isQuarry) {
        this.phoenix = isQuarry;
    }

    public boolean getPhoenix() {
        return this.phoenix;
    }
}
