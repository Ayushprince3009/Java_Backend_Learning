package com.kodewala.constructorChaining.account;

public class Account {
	private double accountNumber;
	
	public Account(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
}

class SavingAccount extends Account{
	private int balance;
	
	public SavingAccount(double accountNumber, int balance) {
		super(accountNumber);
		this.balance = balance;
	}
	
	public void displayDetails() {
		System.out.println("Account Number:- "+getAccountNumber());
		System.out.println("Balance:- "+balance);
		System.out.println();
	}
}
