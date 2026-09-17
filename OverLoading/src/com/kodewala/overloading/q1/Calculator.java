package com.kodewala.overloading.q1;

public class Calculator {
	int sum = 0;
	int add(int a, int b) {
		sum = a+b;
		return sum;
	}
	
	double sum1 = 0;
	double add(double c, double d) {
		sum1 = c+d;
		return sum;
	}
}


