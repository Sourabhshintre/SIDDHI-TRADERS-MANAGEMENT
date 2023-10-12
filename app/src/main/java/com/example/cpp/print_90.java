package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class print_90 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print90);
    }

    public void shop(View view) {
        Intent i1=new Intent(this,shop_location.class);
        startActivity(i1);
    }
    public void add(View view) {
        DB db = new DB(this);
        if(!db.isExists(R.drawable.rcc))
        {
            db.addToCart(R.drawable.kitchenimg6,"45*90 Print A","1200",1);
            Toast.makeText(this, "Added to Cart", Toast.LENGTH_SHORT).show();
        }
    }
}