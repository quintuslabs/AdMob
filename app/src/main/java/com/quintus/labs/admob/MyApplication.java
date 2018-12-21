package com.quintus.labs.admob;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

/**
 * Created by Santosh on 21/12/18
 * www.quintuslabs.com
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
    }
}
