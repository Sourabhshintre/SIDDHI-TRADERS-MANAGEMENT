package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class first_page extends AppCompatActivity {
ImageButton im1,im2,im3,im4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        im1=findViewById(R.id.im1);
        im2=findViewById((R.id.im2));
        im3=findViewById((R.id.im3));
        im4=findViewById((R.id.im4));
    }

    public void click1(View view) {
        Toast.makeText(this, "category", Toast.LENGTH_SHORT).show();
        Intent i1 = new Intent(this, Category.class);
        startActivity(i1);
    }

    public void click2(View view) {
        Toast.makeText(this, "Cart", Toast.LENGTH_SHORT).show();
        Intent i1 = new Intent(this, Cart.class);
        startActivity(i1);
    }
    public void click3(View view) {
        Toast.makeText(this, "Orders", Toast.LENGTH_SHORT).show();
        Intent i1 = new Intent(this, Orders.class);
        startActivity(i1);
    }

    public void click4(View view) {
        Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
        Intent i1 = new Intent(this, Profile.class);
        startActivity(i1);
    }

}