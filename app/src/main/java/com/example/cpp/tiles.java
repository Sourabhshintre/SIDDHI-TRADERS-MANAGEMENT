package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class tiles extends AppCompatActivity {
    ImageButton im6,im1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiles);

    }

    public void click(View view) {
        Intent i1=new Intent(this,KitchenTiletypes.class);
        startActivity(i1);
    }

    public void click1(View view) {
        Intent i1=new Intent(this,Floortilestypes.class);
        startActivity(i1);
    }

    public void click2(View view) {
        Intent i1=new Intent(this,bedroomtiles.class);
        startActivity(i1);
    }

    public void click3(View view) {
        Intent i1=new Intent(this,Outdoortiles.class);
        startActivity(i1);
    }


}