package com.example.cpp;

public class Product {
    Integer id;
    String name;
    String price;
    Integer qty;

    public Product(Integer id, String name, String price, Integer qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Integer getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public String getPrice() {
        return price;
    }


    public Integer getQty() {
        return qty;
    }

}
