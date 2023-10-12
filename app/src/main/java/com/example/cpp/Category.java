package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Category extends AppCompatActivity {
    ImageButton im1,im2,im3,im4,home,category,nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    public void click1(View view) {
        Intent i1 = new Intent(this, tiles.class);
        startActivity(i1);
    }

    public void click2(View view) {
        Intent i1 = new Intent(this, tanks.class);
        startActivity(i1);
    }

    public void click3(View view) {
        Intent i1 = new Intent(this, basins.class);
        startActivity(i1);
    }

    public void click4(View view) {
        Intent i1 = new Intent(this, pipes.class);
        startActivity(i1);
    }

    public void click5(View view) {
        Intent i1 = new Intent(this, first_page.class);
        startActivity(i1);
    }

    public void click6(View view) {
    }

    public void click7(View view) {
        Intent i1 = new Intent(this, Profile.class);
        startActivity(i1);
    }
}