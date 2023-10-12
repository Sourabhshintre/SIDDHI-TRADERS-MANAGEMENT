package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Countertypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countertypes);
    }

    public void c1(View view) {
        Intent i1=new Intent(this,bc1.class);
        startActivity(i1);
    }

    public void c2(View view) {
        Intent i2=new Intent(this,bc2.class);
        startActivity(i2);
    }

    public void c3(View view) {
        Intent i3=new Intent(this,bc3.class);
        startActivity(i3);

    }

    public void c4(View view) {
        Intent i4=new Intent(this,bc4.class);
        startActivity(i4);
    }

    public void c5(View view) {
        Intent i5=new Intent(this,bc5.class);
        startActivity(i5);
    }

    public void c6(View view) {
        Intent i6=new Intent(this,bc6.class);
        startActivity(i6);
    }

    public void c7(View view) {
        Intent i7=new Intent(this,bc7.class);
        startActivity(i7);
    }

    public void c8(View view) {
        Intent i8=new Intent(this,bc8.class);
        startActivity(i8);
    }
}