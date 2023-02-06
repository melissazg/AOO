package com.example;

public class Product {

    private final String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getProductName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
