package com.example.cpp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {

    ListView  lv;
    ArrayList<Product> al;
    DB db;
    TextView tv;
    String username,address,mob;
    int qtydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        lv=findViewById(R.id.lv);
        tv=findViewById(R.id.order);
        al = new ArrayList<>();
        db = new DB(this);
        loaddata();
        load();
        SharedPreferences sh = getSharedPreferences("session", MODE_PRIVATE);
        username = sh.getString("username", "");
        mob=sh.getString("mobile","");
        address = sh.getString("address", "");

    }

    public void loaddata(){
        al.clear();
        Cursor c=db.getData();

        while(c.moveToNext())
        {
            Product p = new Product(c.getInt(0),c.getString(1),c.getString(2),c.getInt(3));
            al.add(p);
        }

        int sum=0;

        for (Product p:al)
        {
            sum+=Integer.parseInt(p.getPrice())*p.getQty();
        }

        tv.setText("Order total            : ₹"+sum);


    }
    public void load()
    {
        lv.setAdapter(new CartAdapter());

    }

    public void buy(View view) {
        ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("Order");
        pd.setMessage("Placing an Order...");
        pd.setIndeterminate(true);
        pd.show();
        Thread t1 = new Thread()
        {
            public void run()
            {
                try {
                    String date = new SimpleDateFormat("dd/MM/yy/hh:mm:ss").format(new Date());
                    for(Product p: al)
                    {

                        int price=Integer.parseInt(p.getPrice())*p.getQty();
                        String url="https://cpp123.000webhostapp.com/addorder.php?id="+username+"&date="+date+"&userid="+mob+"&qty="+p.getQty()+"&price="+price+"&address="+address;
                        URL u = new URL(url);
                        HttpURLConnection h =(HttpURLConnection)u.openConnection();
                        String data="";
                        String line="";
                        BufferedReader br = new BufferedReader(new InputStreamReader(h.getInputStream()));
                        while((line=br.readLine())!=null)
                        {
                            data+=line;
                        }

                        Log.d("sourabh","Ordered Successful");
                    }
                    pd.dismiss();
                }catch(Exception e)
                {
                    Log.d("sourabh", e.toString());
                }
            }
        };

        t1.start();
    }

    class CartAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return al.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            LayoutInflater li =Cart.this.getLayoutInflater();
            View custom=li.inflate(R.layout.custom_list_item,null);

            ImageView img=custom.findViewById(R.id.pimg);
            TextView t1=custom.findViewById(R.id.title);
            TextView t2=custom.findViewById(R.id.pr);
            TextView t3=custom.findViewById(R.id.qty);
            Button incr=custom.findViewById(R.id.incr);
            Button decr=custom.findViewById(R.id.decr);
            Button b=custom.findViewById(R.id.button);
            Product p =al.get(i);

            img.setImageResource(p.getId());
            t1.setText(p.getName());
            t2.setText(p.getPrice());
            t3.setText(p.getQty()+"");

            incr.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    Integer qty =db.getQty(p.getId());
                    qty=qty+1;

                    getQty(p.getName());
                    if(qtydb>=qty )
                    {
                        db.upqty(p.getId(),qty);
                    }
                    else
                    {
                        if(qtydb!=0)
                        {
                            AlertDialog.Builder b = new AlertDialog.Builder(Cart.this)
                                    .setTitle("Out of Stock")
                                    .setMessage("Specified Quantity of the product is not available")
                                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                        }
                                    });
                            b.show();
                        }

                    }
                    loaddata();
                    load();
                }
            });
            decr.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    Integer q1 =p.getQty();

                    if(q1==1)
                    {
                      remove(p);
                    }
                    else
                    {
                        q1=q1-1;
                        db.upqty(p.getId(),q1);
                        loaddata();
                        load();
                    }

                }
            });

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    remove(p);
                }
            });

            return custom;
        }
    }

    public void remove(Product p)
    {
        AlertDialog.Builder b = new AlertDialog.Builder(Cart.this)
                .setTitle("Remove Item")
                .setMessage("Are you sure to remove item from cart?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        db.removeFromCart(p.getId());
                        loaddata();
                        load();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        b.show();

    }


    public void getQty(String pid)
    {
        Thread t1 = new Thread()
        {
            public void run()
            {
                try {
                    String url = "https://cpp123.000webhostapp.com/fetchstocks.php";
                    URL u = new URL(url);
                    HttpURLConnection h = (HttpURLConnection) u.openConnection();
                    String data = "";
                    String line = "";
                    BufferedReader br = new BufferedReader(new InputStreamReader(h.getInputStream()));
                    while((line=br.readLine())!=null)
                    {
                        data+=line;
                    }
                    Log.d("sourabh","Ordered Successful");
                    JSONArray jr = new JSONArray(data);
                    for(int i=0;i<jr.length();i++)
                    {
                        JSONObject jo= jr.getJSONObject(i);
                        Log.d("sourabh",jo.getString("name"));
                        if(jo.getString("name").equals(pid))
                        {
                            qtydb=Integer.parseInt(jo.getString("qty"));
                            break;
                        }
                    }

                }catch(Exception e)
                {
                    Log.d("sourabh", e.toString());
                }
            }
        };

        t1.start();
    }

}