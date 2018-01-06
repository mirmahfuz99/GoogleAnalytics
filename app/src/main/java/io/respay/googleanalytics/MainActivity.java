package io.respay.googleanalytics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //add screen record for google analytics
        Event_and_ScreenRecord_GoogleAnalytics.getScreenRecord(this);

        setContentView(R.layout.activity_main);

    }
}
