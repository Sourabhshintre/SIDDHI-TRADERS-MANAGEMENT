package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ceramicbasins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceramicbasins);
    }

    public void click7(View view) {
        Intent  i = new Intent(this,bce7.class);
        startActivity(i);
    }

    public void click6(View view) {
        Intent  i = new Intent(this,bce6.class);
        startActivity(i);
    }

    public void click5(View view) {
        Intent  i = new Intent(this,bce5.class);
        startActivity(i);
    }

    public void click4(View view) {
        Intent  i = new Intent(this,bce4.class);
        startActivity(i);
    }

    public void click3(View view) {
        Intent  i = new Intent(this,bce3.class);
        startActivity(i);
    }

    public void click2(View view) {
        Intent  i = new Intent(this,bce2.class);
        startActivity(i);
    }

    public void click1(View view) {
        Intent  i = new Intent(this,bce1.class);
        startActivity(i);
    }
}