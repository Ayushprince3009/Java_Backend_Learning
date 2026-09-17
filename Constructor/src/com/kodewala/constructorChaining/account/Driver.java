package com.kodewala.constructorChaining.account;

public class Driver {
	public static void main(String[] args) {
		SavingAccount cust1 = new SavingAccount(987654994, 9700);
		cust1.displayDetails();
	}
}
