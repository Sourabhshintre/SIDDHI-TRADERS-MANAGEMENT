package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Breccia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breccia);
    }
    public void breccia(View view) {
        Intent i1=new Intent(this,shop_location.class);
        startActivity(i1);
    }

    public void add(View view) {
        DB db = new DB(this);
        if(!db.isExists(R.drawable.floor5))
        {
            db.addToCart(R.drawable.floor5,"Breccia Beige","1390",1);
            Toast.makeText(this, "Added to Cart", Toast.LENGTH_SHORT).show();
        }}
    }