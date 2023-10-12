package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class KitchenTiletypes extends AppCompatActivity {
    ImageButton im,im1,im2,im3,im4,im5,im6,im7,im8,im9,im10,im11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen_tiletypes);
        im=findViewById(R.id.royal);
        im1=findViewById(R.id.hdtiles);
        im2=findViewById(R.id.digitaltiles);
        im3=findViewById(R.id.royal_90);
        im4=findViewById(R.id.royal_45);
        im5=findViewById(R.id.digital_90);
        im6=findViewById(R.id.minimilastic);
        im7=findViewById(R.id.mosiac);
        im8=findViewById(R.id.print_90);
        im9=findViewById(R.id.gres);
        im10=findViewById(R.id.impression);
        im11=findViewById(R.id.print);
    }

    public void royal(View view) {
        Intent i1= new Intent(this,buy.class);
        startActivity(i1);

    }

    public void hdtiles(View view) {
        Intent i1= new Intent(this,hdtiles_buy.class);
        startActivity(i1);

    }

    public void digitaltiles(View view) {
        Intent i1= new Intent(this,digitaltiles.class);
        startActivity(i1);
    }

    public void royal_90(View view) {
        Intent i1= new Intent(this,royal_90buy.class);
        startActivity(i1);
    }
    public void royal_45(View view) {
        Intent i1= new Intent(this,royal45buy.class);
        startActivity(i1);
    }

    public void digital_90(View view) {
        Intent i1= new Intent(this,digital90.class);
        startActivity(i1);
    }

    public void minimilastic(View view) {
        Intent i1= new Intent(this,minimilastic_buy.class);
        startActivity(i1);
    }

    public void mosiac(View view) {
        Intent i1= new Intent(this,mosiac_buy.class);
        startActivity(i1);
    }

    public void print_90(View view) {
        Intent i1= new Intent(this,print_90.class);
        startActivity(i1);
    }

    public void gres(View view) {
        Intent i1= new Intent(this,gres_buy.class);
        startActivity(i1);
    }

    public void impression(View view) {
        Intent i1= new Intent(this,impression_buy.class);
        startActivity(i1);
    }

    public void print(View view) {
        Intent i1= new Intent(this,print.class);
        startActivity(i1);
    }


}