package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Floortilestypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floortilestypes);
    }

    public void dynacrema(View view) {
        Intent i = new Intent(this,DynaCrema1.class);
        startActivity(i);
}

    public void flourish(View view) {
        Intent i = new Intent(this,Flourishpink.class);
        startActivity(i);
    }

    public void classico(View view) {
        Intent i = new Intent(this,Bottino.class);
        startActivity(i);
    }

    public void corsicabeige(View view) {
        Intent i = new Intent(this,Beige.class);
        startActivity(i);
    }

    public void agariawhite(View view) {
        Intent i = new Intent(this,Agaria.class);
        startActivity(i);
    }

    public void breccia(View view) {
        Intent i = new Intent(this,Breccia.class);
        startActivity(i);
    }

    public void crosswood(View view) {
        Intent i = new Intent(this,teak.class);
        startActivity(i);
    }

    public void dyna(View view) {
        Intent i = new Intent(this,Dyna.class);
        startActivity(i);
    }

    public void bm(View view) {
        Intent i = new Intent(this,Marquina.class);
        startActivity(i);
    }

    public void de(View view) {
        Intent i = new Intent(this,Empredor.class);
        startActivity(i);
    }

    public void agate(View view) {
        Intent i = new Intent(this,Agate.class);
        startActivity(i);
    }

    public void ba(View view) {
        Intent i = new Intent(this,BlackAgate.class);
        startActivity(i);
    }
}