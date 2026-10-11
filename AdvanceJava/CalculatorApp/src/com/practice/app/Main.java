
package com.practice.app;

import com.practice.calculator.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(25, 15));
        System.out.println("Subtraction: " + calculator.subtract(25, 15));
        System.out.println("Multiplication: " + calculator.multiply(25, 15));
    }
}
