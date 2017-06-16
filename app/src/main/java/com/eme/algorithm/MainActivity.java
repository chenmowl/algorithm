package com.eme.algorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG=MainActivity.this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //测试单词反转
        Log.e(TAG,WordConverse.converse("1G"));
        Log.e(TAG,WordConverse.converse("1GH8S"));
        Log.e(TAG,WordConverse.converse("1 GH8S"));

    }
}
