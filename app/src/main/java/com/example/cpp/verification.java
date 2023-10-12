package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class verification extends AppCompatActivity {
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        e1=findViewById(R.id.reg4);
        b1=findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verify();
            }


        });
    }
    public void verify() {
        String otp=e1.getText().toString();
        String sign_otp=getIntent().getStringExtra("otp");
        if (otp.equals(sign_otp)){
//            https://cpp123.000webhostapp.com/addcustomer.php?usernm=s&email=sourabhshintre7171%40gmail.com&password=1234&mobile=900909090&addres=A.p.Hingangaon
            String username=getIntent().getStringExtra("unm").trim();
            String email=getIntent().getStringExtra("email");
            String password=getIntent().getStringExtra("pass");
            String mobile=getIntent().getStringExtra("mob");
            String address=getIntent().getStringExtra("add");
            Thread t1 = new Thread()
            {
                public void run()
                {
                    try {


                        String url="https://cpp123.000webhostapp.com/addcustomer.php?usernm="+username+"&email="+email+"&password="+password+"&mobile="+mobile+"&addres="+address;

                        Log.d("sourabh", url);
                        URL u = new URL(url);
                        HttpURLConnection h =(HttpURLConnection)u.openConnection();
                        String data="";
                        String line="";
                        BufferedReader br = new BufferedReader(new InputStreamReader(h.getInputStream()));
                        while((line=br.readLine())!=null)
                        {
                            data+=line;
                        }
                        Log.d("cpp", data);
                    }catch(Exception e)
                    {
                        Log.d("sourabh", e.toString());
                    }
                }
            };

            t1.start();


            Toast.makeText(this, "Registration Successfull!!", Toast.LENGTH_SHORT).show();
            open();
        }
        else {
            Toast.makeText(this, "Please Enter Valid OTP", Toast.LENGTH_SHORT).show();
        }
    }
    public void open(){
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }

}