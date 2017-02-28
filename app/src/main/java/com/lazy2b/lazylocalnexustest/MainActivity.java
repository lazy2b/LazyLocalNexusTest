package com.lazy2b.lazylocalnexustest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lazy2b.localnexuslibs.CalculatorFun;

import io.reactivex.Observer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalculatorFun.add(1,2);

        Observer<String> observer = null;


    }
}
