package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args)
    {
        Customer customer = new Customer ("Lilia", 123412341);

        List<Product> products = new ArrayList<>();

        Product productA = new Product("Shampooing aux fruits rouges", 5.5);
        products.add(productA);

        Product productB = new Product("Gel douche au caramel", 5.5);
        products.add(productB);

        System.out.println(customer.getCustomerName() + " a acheté : ");

        for (int i = 0; i < products.size(); i++) {
            System.out.println("- " + products.get(i).getProductName());
        }
        
        System.out.print("et a payé au total ");

        double totalPrice = 0.0;
        for (int i = 0; i < products.size(); i++) {
            totalPrice += products.get(i).getPrice();
        }

        System.out.print(totalPrice + ".");


    }

}