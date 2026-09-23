package com.kodewala.multithrea.class5;

public class BankAccount {
	private int balance = 1000;

	public void transfer(BankAccount reciver, int amount) {
		System.out.println(
				"[" + Thread.currentThread().getName() + "] 20 lines of code ---Sending Email Notification.....");

		synchronized (this) {
			if (balance >= amount) {
				System.out.println("[" + Thread.currentThread().getName() + "] Checked Balance:- " + balance);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance = balance - amount;
			reciver.balance = reciver.balance + amount;
			System.out.println(
					"[" + Thread.currentThread().getName() + "] Transferred "+amount);
		}
		//else {
			
		}

	}
}
