package com.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public ShoppingCart(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getArticlesQuantity(){
        return products.size() + 1;
    }

    public double getTotalCost(){
        return products.stream()
            .mapToDouble(Product::getPrice)
            .sum();
    }
}
