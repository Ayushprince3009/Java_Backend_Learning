package com.kodewala.payment;

public class PaymentService {

    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public String pay(double amount) {
        return "Payment successful: Rs. " + amount;
    }
}