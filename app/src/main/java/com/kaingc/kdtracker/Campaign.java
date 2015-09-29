package com.kaingc.kdtracker;

public class Campaign {
    private int campaignId;
    private String settlementName, settlementCreator;

    public Campaign() {

    }

    public Campaign(int aCampaignId) {
        this.campaignId = aCampaignId;
    }

    public void setCampaignId(int aId)  {
        this.campaignId = aId;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setSettlementName(String aName) {
        this.settlementName = aName;
    }

    public String getSettlementName() {
        return this.settlementName;
    }

    public void setSettlementCreator(String aCreator) {
        this.settlementCreator = aCreator;
    }

    public String getSettlementCreator() {
        return this.settlementCreator;
    }
}
