package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pvc_pipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pvc_pipes);
    }

    public void click1(View view) {
        Intent i=new Intent(this,ppv1.class);
        startActivity(i);
    }

    public void click4(View view) {
        Intent i=new Intent(this,ppv4.class);
        startActivity(i);
    }

    public void click3(View view) {
        Intent i=new Intent(this,ppv2.class);
        startActivity(i);
    }

    public void click2(View view) {
        Intent i=new Intent(this,ppv3.class);
        startActivity(i);
    }
}