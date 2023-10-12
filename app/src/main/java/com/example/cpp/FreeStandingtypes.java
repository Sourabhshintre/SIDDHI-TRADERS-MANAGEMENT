package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FreeStandingtypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_standingtypes);
    }

    public void click1(View view) {
        Intent i1=new Intent(this,bf1.class);
        startActivity(i1);
    }

    public void click2(View view) {
        Intent i2=new Intent(this,bf2.class);
        startActivity(i2);
    }

    public void click3(View view) {
        Intent i3= new Intent(this,bf3.class);
        startActivity(i3);
    }

    public void click4(View view) {
        Intent i4= new Intent(this,bf4.class);
        startActivity(i4);
    }

    public void click5(View view) {
        Intent i3= new Intent(this,bf5.class);
        startActivity(i3);
    }

    public void click6(View view) {
        Intent i3= new Intent(this,bf6.class);
        startActivity(i3);
    }

    public void click7(View view) {
        Intent i3= new Intent(this,bf7.class);
        startActivity(i3);
    }
}