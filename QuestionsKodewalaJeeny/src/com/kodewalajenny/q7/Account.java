package com.kodewalajenny.q7;

public class Account {
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	Account(String accountNumber, String accountHolderName, double balance){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		setBalance(balance);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		if(balance < 0) {
			this.balance = 0;
		}else {
			this.balance = balance;
		}
	}
	
	void deposit(double amount) {
		if(amount > 0) {
			balance = getBalance() + amount;
			System.out.println("Updated Balance: "+balance);
		}
		else {
			System.out.println("Invalid Amount to deposit");
		}
	}
	
	void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Amount");	
		}
		else if(balance >= amount ) {
			balance -= amount;
			System.out.println("Balance After Withdraw: "+balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
}
