package com.kaingc.kdtracker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CampaignListAdapter extends RecyclerView.Adapter<CampaignListAdapter.ViewHolder> {
    Context context;
    int layourResourceId;
    Campaign campaignList[] = null;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v;
        }
    }

    public CampaignListAdapter(Campaign[] data) {
        this.campaignList = data;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CampaignListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.campaign_list_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters


        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //holder.mTextView.setText(campaignList[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override

    public int getItemCount() {
        return campaignList.length;
    }
}
