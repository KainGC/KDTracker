package com.kaingc.kdtracker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CampaignListAdapter extends ArrayAdapter<Campaign> {
    Context context;
    int layourResourceId;
    Campaign campaignList[] = null;

    public CampaignListAdapter(Context aContext, int aId, Campaign[] data) {
        super(aContext, aId, data);
        this.context = aContext;
        this.layourResourceId = aId;
        this.campaignList = data;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        return convertView;
    }

    static class CampaignHolder {
        TextView campaignName;
        TextView campaignSubtitle;
    }
}
