package com.kodewala.updowncasting.pq4;

public class BankAccount {
	void deposit() {
		System.out.println("Money Deposited");
	}
	
	void withdraw() {
		System.out.println("Money Withdraw");
	}
}

class SavingAccount extends BankAccount{
	void calculateInterest() {
		System.out.println("Interest calculated");
	}
}
