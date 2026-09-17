package com.kodewala.overloading.q4;

public class Driver {
	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println(b.withdraw(12000));
		b.withdraw(19000, "3456");
		b.withdraw(34000, "2345", true);
	}
}
