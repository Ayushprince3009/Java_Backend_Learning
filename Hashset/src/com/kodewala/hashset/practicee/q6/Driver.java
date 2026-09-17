package com.kodewala.hashset.practicee.q6;

import java.util.*;
public class Driver {
	public static void main(String[] args) {
		Set<Payment> pay = new HashSet<Payment>();
		Payment p1 = new Payment("Done");
		Payment p2 = new Payment("Done");
		
		pay.add(p1);
		pay.add(p2);
		
		System.out.println(pay);
	}
}

class Payment{
	private String status;
	
	public Payment(String status) {
		this.status = status;
	}
	
	@Override
	public int hashCode() {
		return this.status.hashCode();
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Payment p = (Payment) obj;
//		return this.status.equals(p.status);
//	}
}