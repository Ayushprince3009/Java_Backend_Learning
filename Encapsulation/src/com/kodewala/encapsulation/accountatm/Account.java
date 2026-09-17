package com.kodewala.encapsulation.accountatm;

public class Account {
	private String accountNumber;
	private String holderName;
	private int balance;
	
	public Account(String accountNumber, String holderName, int amount) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = amount;
		
	}
	
	public  int deposit(int amount) {
		if(amount > 0) {
			balance += amount;
		}
		return balance;
	}
	
	public void withdrawal(int amount) {
		if(amount < 0) {
			System.out.println("Invalid amount");
		}
		else if(balance >= amount) {
			balance -= amount;
			System.out.println("Transferrerd amount:- "+amount);
			System.out.println("New Balance:- "+balance);
		}
		else {
			System.out.println("Insufficient fund");
		}
	}
	
	public int getBalance() { 
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return holderName;
	}
}
