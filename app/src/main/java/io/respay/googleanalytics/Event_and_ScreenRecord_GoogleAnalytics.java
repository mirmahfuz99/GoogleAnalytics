package io.respay.googleanalytics;

import android.content.Context;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by mirmahfuz on 1/6/18.
 */

public class Event_and_ScreenRecord_GoogleAnalytics {
    static Tracker mTracker;
    public static void getScreenRecord(Context context){
               GoogleAanalytics application = (GoogleAanalytics) context.getApplicationContext();
               mTracker = application.getDefaultTracker();
               mTracker.setScreenName(context.getClass().getName());
               mTracker.send(new HitBuilders.ScreenViewBuilder().build());
           }

            public static void getEvent(){
                mTracker.send(new HitBuilders.EventBuilder()
                               .setCategory("Action")
                              .setAction("Share")
                              .build());
           }
}