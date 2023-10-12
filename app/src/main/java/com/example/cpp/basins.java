package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class basins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basins);
    }

    public void submit(View view) {
        Intent i1=new Intent(this,Countertypes.class);
        startActivity(i1);
    }

    public void submit1(View view) {
        Intent i1=new Intent(this,FreeStandingtypes.class);
        startActivity(i1);
    }

    public void submit3(View view) {
        Intent i1=new Intent(this,ceramicbasins.class);
        startActivity(i1);
    }

    public void submit4(View view) {
        Intent i1=new Intent(this,regularbasins.class);
        startActivity(i1);

    }
}