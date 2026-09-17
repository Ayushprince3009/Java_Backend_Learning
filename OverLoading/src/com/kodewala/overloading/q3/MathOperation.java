package com.kodewala.overloading.q3;

public class MathOperation {
	public void multiply(int a, int b) {
		int res = a*b;
		System.out.println("res:- "+res);
	}
	public void multiply(int a, int b, int c) {
		int res = a*b*c;
		System.out.println("Res:- "+res);
	}
	public void multiply(double a, double b) {
		double res = a*b;
		System.out.println("Res:- "+res);
	}
}
