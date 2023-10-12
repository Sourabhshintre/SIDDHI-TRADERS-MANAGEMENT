package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tanks extends AppCompatActivity {
    ImageButton im1,im2,im3,im4,im5,im6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanks);

        im6=findViewById(R.id.im6);
    }

    public void threelayer(View view) {
        Intent i1 = new Intent(this,threelayertank_buy.class);
        startActivity(i1);
    }
    public void loft(View view) {
        Intent i1 = new Intent(this,lofttankbuy.class);
        startActivity(i1);
    }
    public void underground(View view) {
        Intent i1 = new Intent(this,undergroundtankbuy.class);
        startActivity(i1);
    }
    public void rcc(View view) {
        Intent i1 = new Intent(this,rcctankbuy.class);
        startActivity(i1);
    }
}