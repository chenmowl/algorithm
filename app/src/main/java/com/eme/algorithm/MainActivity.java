package com.eme.algorithm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG=MainActivity.this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //测试单词反转
//        Log.e(TAG,WordConverse.converse("1G"));
//        Log.e(TAG,WordConverse.converse("1GH8S"));
//        Log.e(TAG,WordConverse.converse("1 GH8S"));

        //测试猫扑素数
//        for(int i=2;i<=1000000;i++){
//            if(MopPrime.isMopNumber(i) && MopPrime.isPrime(i)){
//                Log.e(TAG,i+"");
//            }
//        }

//        Log.e(TAG,-23%4+"");
        Log.e(TAG,OneNumber.getOneNumberFromRange(1,100)+"");

    }
}
