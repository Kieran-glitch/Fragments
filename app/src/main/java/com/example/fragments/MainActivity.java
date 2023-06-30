package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    BlankFragment b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=new BlankFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,b).commit();
    }
}