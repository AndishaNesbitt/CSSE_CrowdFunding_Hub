package edu.psu.bd.csse.crowdfundinghubclient.model;

/**
 * Created by Zach on 1/31/2016.
 */
public class Campaign {


    public static final int SECTION_REWARDS  = 1;
    public static final int SECTION_DONATION = 2;
    public static final int SECTION_EQUITY   = 3;
    public static final String TYPE_REWARDS  = "Rewards";
    public static final String TYPE_DONATION = "Donations";
    public static final String TYPE_EQUITY   = "Equity";

    private String title;
    private String url;
    private String type;
    private double amountRaised;
    private double percentComplete;

    public Campaign() {
        this.setTitle("");
        this.setUrl("");
        this.setType(TYPE_REWARDS);
        this.setAmountRaised(0.0);
        this.setPercentComplete(0.0);
    }

    public Campaign(String title, String url, String type, double amountRaised, double percentComplete) {
        this.setTitle(title);
        this.setUrl(url);
        this.setType(type);
        this.setAmountRaised(amountRaised);
        this.setPercentComplete(percentComplete);
    }

    public static String getTypeName(int section) {
        switch (section) {
            case Campaign.SECTION_REWARDS:
                return Campaign.TYPE_REWARDS;
            case Campaign.SECTION_DONATION:
                return Campaign.TYPE_DONATION;
            case Campaign.SECTION_EQUITY:
                return Campaign.TYPE_EQUITY;
            default:
                return Campaign.TYPE_REWARDS;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmountRaised() {
        return amountRaised;
    }

    public void setAmountRaised(double amountRaised) {
        this.amountRaised = amountRaised;
    }


    public double getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(double percentComplete) {
        this.percentComplete = percentComplete;
    }
}
