package edu.psu.bd.csse.crowdfundinghubclient.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Use this class as a "temporary database" for campaigns retrieved from the server
 * Implements the DAO interface using a ArrayList of campaigns.  The app will have to
 * request the server every time the app runs to fill this list with campaigns.
 *
 * Use this if we decide:
 *     1. We should request for campaigns every time the user opens the app
 *
 * Another option: use a local sqlite database to store campaigns
 *                 acts like a "cache" for new campaigns on that day
 *     1. Good: a request does not need send every time the user opens the app
 *     2. Good: we can use SQL to list campaigns in many different ways
 *     3. Bad : possibly bad for device storage? should not be too demanding
 *
 * Created by Zach on 1/31/2016.
 */
public class CampaignDAOArray implements ICampaignCrud {

    private ArrayList<Campaign> campaignsdb;

    public CampaignDAOArray(ArrayList<Campaign> campaignsdb) {
        this.campaignsdb = campaignsdb;
    }

    @Override
    public void addCampaign(Campaign campaign) {
        campaignsdb.add(campaign);
    }

    @Override
    public List<Campaign> getCampaigns() {
        return campaignsdb;
    }

    @Override
    public List<Campaign> getCampaigns(int section) {
        String type;
        switch (section) {
            case 1:
                type = Campaign.TYPE_REWARDS;
                break;
            case 2:
                type = Campaign.TYPE_DONATION;
                break;
            case 3:
                type = Campaign.TYPE_EQUITY;
                break;
            default:
                type = Campaign.TYPE_REWARDS;
        }


        List<Campaign> campaignsOfType = new ArrayList<>();
        for (Campaign c : campaignsdb)
            if (c.getType().equals(type))
                campaignsOfType.add(c);

        return campaignsOfType;
    }

    @Override
    public List<Campaign> getCampaigns(int section, String clause) {
        return null;
    }
}
