package com.example.cpp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB extends SQLiteOpenHelper {

    Context c;
    public DB(Context context) {
        super(context, "cartdb", null, 1);
        this.c=c;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table cart (id integer primary key,name text,price text,qty integer)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addToCart(int id,String name,String price,int qty)
    {
        SQLiteDatabase db =getWritableDatabase();

        ContentValues c = new ContentValues();
        c.put("id",id);
        c.put("name",name);
        c.put("price",price);
        c.put("qty",qty);

        db.insert("cart",null,c);

    }

    public void upqty(int id,int qty)
    {
        SQLiteDatabase db =getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put("qty",qty);
        db.update("cart",c,"id=?",new String[]{id+""});

    }
    public int getQty(int id)
    {
        SQLiteDatabase d =getWritableDatabase();

        Cursor c = d.query("cart",null,"id=?",new String[]{id+""},null,null,null);
        c.moveToFirst();
        return c.getInt(3);
    }

    public Cursor getData()
    {
        SQLiteDatabase sb= getWritableDatabase();
        return sb.rawQuery("select * from cart",null);
    }

    public void removeFromCart(int id)
    {
        SQLiteDatabase sb = getWritableDatabase();
        sb.delete("cart","id=?",new String[]{id+""});
    }

    public boolean isExists(int id)
    {
        SQLiteDatabase db =getWritableDatabase();

       Cursor c= db.rawQuery("select * from cart where id="+id,null);
        if(c.getCount()==1)
        {
            return true;
        }
        return false;

    }


    public void deleteAll()
    {
        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("delete from cart");
    }



}
