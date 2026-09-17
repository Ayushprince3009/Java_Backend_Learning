package com.kodewala.encapsulation.bank;

public class BankDetails {
	private String accountNumber;
	private String name;
	private long accBalance;
	
	public BankDetails(String accountNumber, String name, long accBalance) {
		this.accountNumber = accountNumber;
		this.name = name;
		setAccBalance(accBalance);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public long getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(long accBalance) {
		if(accBalance >= 0) {
			this.accBalance = accBalance;
		}
		else {
			this.accBalance = 0;
		}
	}
	
	public void withdrawal(long amount) {
		if(amount < accBalance) {
			System.out.println("Money Transferred"); 
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public void deposit(long amount) {
		if(amount > 0) {
			System.out.println("Successfully Deposited");
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	public void displayAccDetails() {
		System.out.println("Account Number:-"+accountNumber);
		System.out.println("Customer Name:-"+name);
		System.out.println("Account Balance:-"+accBalance);
	}
}
