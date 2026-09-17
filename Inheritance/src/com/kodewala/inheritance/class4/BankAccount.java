package com.kodewala.inheritance.class4;

public class BankAccount {
	private String accountHolderName;
	private double balance;
	
	public BankAccount(String accountHolderName, double balance) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	void deposit() {
		System.out.println("Deposite Successful");
	}
	
	void withdraw() {
		System.out.println("Withdraw Successful");
	}
}

class CurrentAccount extends BankAccount{
	private double overDraftLimit;
	
	public CurrentAccount(String accountHolderName, double balance, double overDraftLimit) {
		super(accountHolderName, balance);
		this.overDraftLimit = overDraftLimit;
	}
	
	void showLimit() {
		System.out.println("Show Limit");
	}
}
