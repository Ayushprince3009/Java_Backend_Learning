package com.kodewala.inheritance.in;

public class Account {
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		if(accountNumber == null || accountNumber.isEmpty()) {
			this.accountNumber = "00000";
		}
		else {
			this.accountNumber = accountNumber;
		}
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		if(accountHolderName == null || accountHolderName.isEmpty()) {
			this.accountHolderName = "Unknown";
		}
		else {
			this.accountHolderName = accountHolderName;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance < 0) {
			this.balance = 0;
		}
		else {
			this.balance = balance;
		}
	}
	
	public Account(String accountNumber, String accountHolderName, double balance) {
		this.setAccountNumber(accountNumber);
		this.setAccountHolderName(accountHolderName) ;
		this.setBalance(balance);
	}
	
	public void showAccountDetails() {
		System.out.println("Account Details");
		System.out.println("Account Number:- "+getAccountNumber());
		System.out.println("Account Holder:- "+getAccountHolderName());
		System.out.println("Balance:- "+getBalance());
		System.out.println();
	}
}

class SavingsAccount extends Account{
	private double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		if(interestRate < 1) {
			this.interestRate = 1;
		}
		else {
			this.interestRate = interestRate;
		}
	}
	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber,accountHolderName,balance);
		this.setInterestRate(interestRate);
	}
	
	public double calculateInterest() {
		double interestAmount = (getBalance()*getInterestRate()) / 100;
		return interestAmount;
	}
	
	public void displayDetails() {
		
		super.showAccountDetails();
		System.out.println("Savings Account Details");
		System.out.println("Interest Rate:- "+getInterestRate());
		System.out.println("Interest Amount:- "+calculateInterest());
		System.out.println();
	}
}

class CurrentAccount extends Account{
	private double overDraftLimit;
	
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(double overDraftLimit) {
		if(overDraftLimit < 0){
			this.overDraftLimit = 0;
		}
		else {
			this.overDraftLimit = overDraftLimit;
		}
	}
	
	public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overDraftLimit) {
		super(accountNumber,accountHolderName,balance);
		this.setOverDraftLimit(overDraftLimit);
	}
	
	public void showCurrentAccountDetails() {
		
		super.showAccountDetails();
		System.out.println("Current Account Details");
		System.out.println("OverDraftLimit:- "+getOverDraftLimit());
		System.out.println();
	}
}
