package com.kodewala.multithrea.practice7;

public class TransferThread2 extends Thread {
	private BankAccount sender;
	private BankAccount reciver;
	
	public TransferThread2(BankAccount sender, BankAccount reciver) {
		this.sender = sender;
		this.reciver = reciver;
	}
	
	public void run() {
		sender.transfer(reciver, 800);
	}
}
