package com.kodewala.serialization;

import java.io.Serializable;

public class Account implements Serializable{
	private int balance;
	private String name;
	private String ifscCode;
	private String address;
	
	public Account(int balance, String name, String ifscCode, String address) {
		super();
		this.balance = balance;
		this.name = name;
		this.ifscCode = ifscCode;
		this.address = address;
	}

	public int getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public String getAddress() {
		return address;
	}
	
}
