package com.example;

public class Commande {

    Customer customer;
    ShoppingCart shoppingCart;    

    public Commande(Customer customer, ShoppingCart shoppingCart) {
        this.customer = customer;
        this.shoppingCart = shoppingCart;        
    }

}
