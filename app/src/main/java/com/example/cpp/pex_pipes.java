package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pex_pipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pex_pipes);
    }

    public void click1(View view) {
        Intent i= new Intent(this,px1.class);
        startActivity(i);
    }

    public void click2(View view) {
        Intent i= new Intent(this,px2.class);
        startActivity(i);

    }

    public void click3(View view) {
        Intent i= new Intent(this,px3.class);
        startActivity(i);
    }

    public void click4(View view) {
        Intent i= new Intent(this,px4.class);
        startActivity(i);
    }

    public void click5(View view) {
        Intent i= new Intent(this,px5.class);
        startActivity(i);
    }

    public void click6(View view) {
        Intent i= new Intent(this,px6.class);
        startActivity(i);
    }

    public void click7(View view) {
        Intent i= new Intent(this,px7.class);
        startActivity(i);
    }

    public void clcik8(View view) {
        Intent i= new Intent(this,px8.class);
        startActivity(i);
    }

    public void click9(View view) {
        Intent i= new Intent(this,px9.class);
        startActivity(i);
    }

    public void click10(View view) {
        Intent i= new Intent(this,px10.class);
        startActivity(i);
    }

    public void click11(View view) {
        Intent i= new Intent(this,px11.class);
        startActivity(i);
    }

    public void click12(View view) {
        Intent i= new Intent(this,px12.class);
        startActivity(i);
    }
}