package edu.psu.bd.csse.crowdfundinghubclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import edu.psu.bd.csse.crowdfundinghubclient.model.Campaign;

/**
 * Created by Zach on 2/15/2016.
 */
public class CampaignListAdapter extends ArrayAdapter<Campaign> {

    public CampaignListAdapter(Context context, List<Campaign> campaignList) {
        super(context, 0, campaignList);
    }

    @Override
    public View getView(int position, View campaignView, ViewGroup parent) {
        // get campaign model for this position
        Campaign campaign = getItem(position);

        // if the view is not being reused
        if (campaignView == null)
            campaignView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_campaign, parent, false);

        // populate the campaignView with model data
        TextView title = (TextView)campaignView.findViewById(R.id.campaignTitle);

        title.setText(campaign.getTitle());

        return campaignView;
    }
}
