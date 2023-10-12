package com.example.cpp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class sign_Up extends AppCompatActivity {

    Button b1;
    TextView signin;
    EditText e1,e2,e3,e4,e5;
    String otp;
    final  Random random = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signin=findViewById(R.id.signin);
        b1= findViewById(R.id.b1);
        e1=findViewById(R.id.fnm);
        e2=findViewById(R.id.t2);
        e3=findViewById(R.id.t3);
        e4=findViewById(R.id.t4);
        e5=findViewById(R.id.t5);

        otp= String.valueOf(random.nextInt(100000));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(sign_Up.this, Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED){
                    sendMessage();
                }
                else{
                    ActivityCompat.requestPermissions(sign_Up.this,new String[]{Manifest.permission.SEND_SMS},100);
                }
            }
        });
    }

    public void click(View view) {
        Intent i1 = new Intent(this,MainActivity.class);
        startActivity(i1);
    }

    public  void sendMessage(){
        String mob=e5.getText().toString();


        String msg="Hii, user Welcome to my application.\nTo open your account please verify with the Otp.\nYour otp is : " +otp;

        if (!mob.equals("")&& !msg.equals("")){
            SmsManager smsManager= SmsManager.getDefault();
            smsManager.sendTextMessage(mob,null,msg,null,null);
            open();

            Toast.makeText(this, "OTP sented on registered mobile number "+mob, Toast.LENGTH_SHORT).show();
            e1.setText(String.valueOf(""));
            e2.setText(String.valueOf(""));
            e3.setText(String.valueOf(""));
            e4.setText(String.valueOf(""));
            e5.setText(String.valueOf(""));
        }
        else {
            Toast.makeText(getApplicationContext(),"Enter Value First",Toast.LENGTH_SHORT).show();
        }
    }

    public  void open(){
        String username=e1.getText().toString().trim()+" "+e2.getText().toString().trim();
        String email=e3.getText().toString();
        String password=e4.getText().toString();
        String mobile=e5.getText().toString();

        Intent i =new Intent(getApplicationContext(),verification.class);
        i.putExtra("otp",otp);
        i.putExtra("unm",username);
        i.putExtra("email",email);
        i.putExtra("pass",password);
        i.putExtra("mob",mobile);
        i.putExtra("add","Sangli");

        startActivity(i);
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100 && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            sendMessage();
        }
        else{
            Toast.makeText(getApplicationContext(),"Permission Denied",Toast.LENGTH_SHORT).show();
        }
    }
}