package com.kodewala.abstraction.practice1;

public class Driver1 {
	public static void main(String[] args) {
		BankAccount acc1 = new SavingsAccount("123456789",900);
		System.out.println("Account Number:- "+acc1.getAccountNumber());
		System.out.println("Account Balance:- "+acc1.getBalance());
		acc1.deposit(2000);
		
		acc1.withdraw(50000);
	}
}

abstract class BankAccount{
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	abstract void withdraw(double amount);
	
	void deposit(double amount) {
		System.out.println("Money Deposited");
	}
}

class SavingsAccount extends BankAccount{
	

	
	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance() > 1000 ) {
			System.out.println("allowed to withdraw");
		}
		else {
			System.out.println("Cann't Withdraw");
		}
	}
}

class CurrentAccount extends BankAccount{

	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	void withdraw(double amount) {
		if(amount > getBalance()) {
			System.out.println("Allowed to withdraw");
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
}