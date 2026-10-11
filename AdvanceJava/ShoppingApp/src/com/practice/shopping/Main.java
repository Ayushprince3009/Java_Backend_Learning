
package com.practice.shopping;

import com.practice.discount.DiscountCalculator;

public class Main {

    public static void main(String[] args) {

        DiscountCalculator calculator = new DiscountCalculator();

        double price = 2000;
        double percentage = 10;

        System.out.println("Original Price: " + price);
        System.out.println("Discount: " +
                calculator.calculateDiscount(price, percentage));
        System.out.println("Final Price: " +
                calculator.calculateFinalPrice(price, percentage));
    }
}
