package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cpvc_pipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpvc_pipes);
    }

    public void click1(View view) {
        Intent i=new Intent(this,pvc1.class);
        startActivity(i);
    }

    public void click2(View view) {
        Intent i=new Intent(this,pvc2.class);
        startActivity(i);
    }

    public void click3(View view) {
        Intent i=new Intent(this,pvc3.class);
        startActivity(i);
    }

    public void click4(View view) {
        Intent i=new Intent(this,pvc4.class);
        startActivity(i);
    }
}