package com.kodewala.multithrea.class2;

public class Driver2 {
	public static void main(String[] args) {
		Number n1 = new Number();
		n1.start();
		Number n2 = new Number();
		n2.start();
	}
}

class Number extends Thread{
	@Override
	public void run() {
		System.out.println("THread started......");
	
		for(int i=1; i<=20; i++) {
			System.out.println("Number:- "+i+" Thread is: "+Thread.currentThread().getName());
		}
	}
}