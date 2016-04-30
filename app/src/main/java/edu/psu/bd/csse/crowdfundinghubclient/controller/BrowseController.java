package edu.psu.bd.csse.crowdfundinghubclient.controller;

import android.content.Context;

import edu.psu.bd.csse.crowdfundinghubclient.model.DbHandler;

/**
 * Created by Zach on 4/10/2016.
 */
public class BrowseController {

    private DbHandler db;

    public BrowseController(Context context) {
        // create instance of the Database handler to get campaigns
        db = new DbHandler(context, null, null, 1);
    }
}
