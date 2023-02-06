package com.example;

public class Customer {
    
    private final String name;
    private final CreditCard creditCard;

    public Customer(String name, long creditCardNumber) {
        this.name = name;
        this.creditCard = new CreditCard(creditCardNumber);
    }

    public String getCustomerName() {
        return name;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

}
