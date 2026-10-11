
package com.practice.discount;

public class DiscountCalculator {

    public double calculateDiscount(double price, double percentage) {
        return price * percentage / 100;
    }

    public double calculateFinalPrice(double price, double percentage) {
        return price - calculateDiscount(price, percentage);
    }
}
