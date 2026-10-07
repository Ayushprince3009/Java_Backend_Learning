package com.kodewala.multithrea.practice7;

public class BankAccount {
	private int balance = 1000;
	
	public synchronized void transfer(BankAccount reciver, int amount) {
		if(balance >= amount) {
			System.out.println(Thread.currentThread().getName()+" Checked Balance: "+balance);
			
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			balance = balance - amount;
			reciver.balance = reciver.balance + amount;
			
			System.out.println(Thread.currentThread().getName()+" transferred:- "+amount);	
		}
		else {
			System.out.println(Thread.currentThread().getName()+" Insufficient Balance");
		}
	}
	
	public int getBalance() {
		return balance;
	}
}
