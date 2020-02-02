package com.rage.splash;

import androidx.appcompat.app.AppCompatActivity;
import io.radar.sdk.Radar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Radar.initialize(publishableKey);
    }
}
