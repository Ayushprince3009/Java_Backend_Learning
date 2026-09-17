package com.kodewala.hashset.practicee.q11;

import java.util.HashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<Account> account = new HashSet<Account>();
		
		Account a1 = new Account(1001,"HDFC001","Ayush");
		Account a2 = new Account(1001,"HDFC001","Rahul");
		Account a3 = new Account(1001,"SBI001","Ayush");
		Account a4 = new Account(1002,"HDFC001","Rahul");
		Account a5 = new Account(1001,"SBI001","Aman");
		Account a6 = new Account(1002,"HDFC001","Neha");
		
		account.add(a1);
		account.add(a2);
		account.add(a3);
		account.add(a4);
		account.add(a5);
		account.add(a6);
		
		System.out.println(account.size());
	}
}

class Account{
	private long accountNo;
	private String ifsc;
	private String holderName;
	
	public Account(long accountNo, String ifsc,String holderName) {
		this.accountNo = accountNo;
		this.ifsc = ifsc;
		this.holderName = holderName;
	}
	
	@Override
	public int hashCode() {
		return (int)(this.accountNo) + this.ifsc.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Account acc = (Account)obj;
		return this.accountNo == acc.accountNo && this.ifsc.equals(acc.ifsc);
	}
	
}