package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pipes);
    }
    public void openpipes(View view) {
        Intent i = new Intent(this,cpvc_pipes.class);
        startActivity(i);
    }

    public void openpvc(View view) {
        Intent i = new Intent(this,pvc_pipes.class);
        startActivity(i);
    }

    public void openpex(View view) {
        Intent i = new Intent(this,pex_pipes.class);
        startActivity(i);
    }

    public void opencopper(View view) {
        Intent i = new Intent(this,copper_pipes.class);
        startActivity(i);
    }
}