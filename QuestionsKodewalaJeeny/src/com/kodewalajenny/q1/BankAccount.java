package com.kodewalajenny.q1;

public class BankAccount {
	private String accountNumber;
	private String accountName;
	private double balance;
	private long phoneNumber;
	
	public double deposit(int amount) {
		if(amount > 0) {
			this.balance += amount;
		}
		return balance;
	}
	
	public double withdraw(int amount) {
		if(amount <= balance) {
			this.balance -= amount;
		}
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void displayDetails() {
		System.out.println("Name:- "+getAccountName());
		System.out.println("Account Number:- "+getAccountNumber());
		System.out.println("Balance:- "+getBalance());
		System.out.println("Phone Number:- "+getPhoneNumber());
	}
	
}
