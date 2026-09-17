package com.kodewala.streamAPI.practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver6 {
	public static void main(String[] args) {
		List<Payment> payments = Arrays.asList(
			    new Payment(101, "SUCCESS", 500),
			    new Payment(102, "FAILED", 1000),
			    new Payment(103, "SUCCESS", 2000),
			    new Payment(104, "PENDING", 1500),
			    new Payment(105, "SUCCESS", 3000)
			);

		List<Integer> result = payments.stream()
				.filter( s -> s.getStatus().equalsIgnoreCase("success"))
				.filter(n -> n.getPrice() > 1000)
				.map(txn -> txn.getTxnId())
				.collect(Collectors.toList());
		
		System.out.println(result);
		
		
		payments.stream().filter(n -> n.getStatus().equalsIgnoreCase("SUCCESS"))
		.filter(n -> n.getPrice() > 1000)
		.map(n -> n.getTxnId())
		.forEach(n -> System.out.println(n));
		
	}
}

class Payment{
	private int txnId;
	private String status;
	private int price;
	
	public Payment(int txnId, String status, int price) {
		this.txnId = txnId;
		this.status = status;
		this.price = price;
	}
	
	public int getTxnId() {
		return txnId;
	}
	public String getStatus() {
		return status;
	}
	public int getPrice() {
		return price;
	}
}