package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Agate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agate);
    }
    public void agate(View view) {
        Intent i1=new Intent(this,shop_location.class);
        startActivity(i1);
    }

    public void add1(View v)
    {
        DB db = new DB(this);
        if(!db.isExists(R.drawable.floor12))
        {
            db.addToCart(R.drawable.floor12,"Agate Nero","2360",1);
            Toast.makeText(this, "Added to Cart", Toast.LENGTH_SHORT).show();
        }}
}