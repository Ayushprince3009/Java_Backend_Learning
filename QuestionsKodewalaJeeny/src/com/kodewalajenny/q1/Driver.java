package com.kodewalajenny.q1;

public class Driver {
	public static void main(String[] args) {
		BankAccount customer = new BankAccount();
		customer.setAccountName("Ayush");
		customer.setAccountNumber("39839838565");
		customer.setBalance(5000);
		customer.setPhoneNumber(854095496);
		customer.displayDetails();
		
		customer.deposit(500);
		
		customer.displayDetails();
		
		customer.withdraw(5000);
		
		customer.displayDetails();
	}
}
