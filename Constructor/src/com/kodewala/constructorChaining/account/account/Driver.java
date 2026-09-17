package com.kodewala.constructorChaining.account.account;

public class Driver {
	public static void main(String[] args) {
		SavingAccount cust1 = new SavingAccount("3983983865", 23000);
		System.out.println(cust1.getAccountNumber());
		cust1.displayDetails();
		
	}
}
