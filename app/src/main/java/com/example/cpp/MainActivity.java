package com.example.cpp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.t1);
        e2=findViewById(R.id.t2);
       signup=findViewById(R.id.signup);
    }

    public void click(View view) {

        String s1 = String.valueOf(e1.getText());
        String s2 = String.valueOf(e2.getText());

        Thread t1 = new Thread()
        {
            public void run()
            {
                try {


                    String url="https://cpp123.000webhostapp.com/fetchcust.php";

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
                    JSONArray jr = new JSONArray(data);
                    boolean b=false;
                    for(int i=0;i<jr.length();i++)
                    {
                        JSONObject jo= jr.getJSONObject(i);

                        if(jo.getString("email").equals(s1) && jo.getString("password").equals(s2))
                        {
                            b=true;
                            SharedPreferences sharedPreferences = getSharedPreferences("session",MODE_PRIVATE);

                            SharedPreferences.Editor myEdit = sharedPreferences.edit();

                            myEdit.putString("username", jo.getString("username"));
                            myEdit.putString("email", s1);
                            myEdit.putString("password", s2);
                            myEdit.putString("mobile", jo.getString("mobile"));
                            myEdit.putString("address", jo.getString("address"));

                            myEdit.commit();
                        }
                    }
                    if(b)
                    {

                        Intent i1 = new Intent(MainActivity.this, first_page.class);
                        startActivity(i1);
                    }
                    else {

                        Handler handler = new Handler(Looper.getMainLooper());
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                            }
                        }, 0);
                    }
                }catch(Exception e)
                {
                    Log.d("sourabh", e.toString());
                }
            }
        };

        t1.start();
    }

    public void click1(View view) {
        Intent i1 = new Intent(this, sign_Up.class);
        startActivity(i1);
    }
}