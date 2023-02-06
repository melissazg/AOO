package com.example;

public class CreditCard {
    
    private final long cardNumber;

    CreditCard(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long cardNumber() {
        return cardNumber;
    }

}
