package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class regularbasins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regularbasins);
    }

    public void click1(View view) {
        Intent i= new Intent(this,br1.class);
        startActivity(i);
    }

    public void click2(View view) {
        Intent i= new Intent(this,br2.class);
        startActivity(i);
    }

    public void click3(View view) {
        Intent i= new Intent(this,br3.class);
        startActivity(i);
    }

    public void click4(View view) {
        Intent i= new Intent(this,br5.class);
        startActivity(i);

    }

    public void click6(View view) {
        Intent i= new Intent(this,br6.class);
        startActivity(i);
    }
}