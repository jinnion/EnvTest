package com.example.envtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.sentry.core.Sentry;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            throw new Exception("This is  a test.");
        } catch(Exception e) {
            Sentry.captureException(e);
        }
        // setContentView(R.layout.activity_main);
        // Temporary Text
    }
}