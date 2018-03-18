package com.example.shopingapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 10;
        int b = 0;
        for (int i = 0; i < a; i++)
        {
            b+= a+i;
        }
    }
}
