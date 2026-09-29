package com.kodewala.multithrea.class7;

public class Driver1 {
	public static void main(String[] args) {
		Add a = new Add(6,9);
		a.start();
		
	}
}

class Add extends Thread{
	int a;
	int b;
	
	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int add(int a, int b) {
		int sum = a + b;
		System.out.println("res:- "+sum);
		return sum;
	}
	
	@Override
	public void run() {
		System.out.println(add(a,b));
	}
}