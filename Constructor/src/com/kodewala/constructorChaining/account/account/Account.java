package com.kodewala.constructorChaining.account.account;

public class Account {
	private String accountNumber;
	
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}

class SavingAccount extends Account{
	private double balance;
	
	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber);
		this.balance = balance;
	}
	
	public void displayDetails() {
		System.out.println("Account Number:- "+getAccountNumber());
		System.out.println("Balance:- "+balance);
		System.out.println();
	}
}
