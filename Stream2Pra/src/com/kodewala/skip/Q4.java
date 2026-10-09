package com.kodewala.skip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Payment {
    int transactionId;
    String customer;
    String status;
    double amount;

    Payment(int transactionId, String customer, String status, double amount) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.status = status;
        this.amount = amount;
    }
}
public class Q4 {
	public static void main(String[] args) {
		List<List<Payment>> regionalPayments = Arrays.asList(
			    Arrays.asList(
			        new Payment(401, "Rahul", "FAILED", 6000),
			        new Payment(402, "Priya", "SUCCESS", 9000),
			        new Payment(403, "Amit", "FAILED", 12000)
			    ),
			    Arrays.asList(
			        new Payment(404, "Neha", "FAILED", 15000),
			        new Payment(405, "Arjun", "FAILED", 4000),
			        new Payment(406, "Sneha", "FAILED", 8000)
			    ),
			    Arrays.asList(
			        new Payment(407, "Karan", "FAILED", 20000),
			        new Payment(408, "Riya", "SUCCESS", 11000),
			        new Payment(409, "Vikas", "FAILED", 10000)
			    )
			);
		
		List<String>result = regionalPayments.stream()
				.flatMap(pay -> pay.stream())
				.filter(pay -> pay.status.equalsIgnoreCase("failed") && pay.amount > 5000)
				.skip(3)
				.limit(2)
				.map(pay -> pay.transactionId+" --> "+pay.customer+" --> "+pay.amount)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
