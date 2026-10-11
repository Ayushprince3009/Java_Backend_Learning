package com.kodewala.shoppingApps;

import com.kodewala.payment.PaymentService;

public class ShoppingApps {

    public static void main(String[] args) {
        PaymentService payment = new PaymentService();

        double total = payment.calculateTotal(500, 2);

        System.out.println(payment.pay(total));
    }
}