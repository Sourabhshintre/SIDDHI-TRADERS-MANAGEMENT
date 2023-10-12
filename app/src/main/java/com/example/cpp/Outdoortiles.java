package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Outdoortiles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoortiles);
    }

    public void o1(View view) {
        Intent i = new Intent(this,o1.class);
        startActivity(i);
    }

    public void o2(View view) {
        Intent i = new Intent(this,o2.class);
        startActivity(i);
    }

    public void o3(View view) {
        Intent i = new Intent(this,o3.class);
        startActivity(i);
    }

    public void o4(View view) {
        Intent i = new Intent(this,o4.class);
        startActivity(i);
    }

    public void o5(View view) {
        Intent i = new Intent(this,o5.class);
        startActivity(i);
    }

    public void o6(View view) {
        Intent i = new Intent(this,o6.class);
        startActivity(i);
    }

    public void o7(View view) {
        Intent i = new Intent(this,o7.class);
        startActivity(i);
    }

    public void o8(View view) {
        Intent i = new Intent(this,o8.class);
        startActivity(i);
    }

    public void o9(View view) {
        Intent i = new Intent(this,o9.class);
        startActivity(i);
    }

    public void o10(View view) {
        Intent i = new Intent(this,o10.class);
        startActivity(i);
    }
}