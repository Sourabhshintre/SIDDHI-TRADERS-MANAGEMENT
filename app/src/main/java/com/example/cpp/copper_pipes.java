package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class copper_pipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copper_pipes);
    }

    public void click1(View view) {
        Intent i= new Intent(this,pc2.class);
        startActivity(i);
    }

    public void click(View view) {
        Intent i= new Intent(this,pc1.class);
        startActivity(i);
    }
}