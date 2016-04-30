package edu.psu.bd.csse.crowdfundinghubclient.model;

import java.util.List;

/**
 * Created by Zach on 1/31/2016.
 */
public interface ICampaignCrud {

    void addCampaign(Campaign campaign);

    List<Campaign> getCampaigns();

    List<Campaign> getCampaigns(int section);

    List<Campaign> getCampaigns(int section, String clause);

}
