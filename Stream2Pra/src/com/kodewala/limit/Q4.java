package com.kodewala.limit;

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
			        new Payment(1001, "Rahul", "FAILED", 5000),
			        new Payment(1002, "Priya", "SUCCESS", 3000),
			        new Payment(1003, "Amit", "FAILED", 8000)
			    ),
			    Arrays.asList(
			        new Payment(1004, "Neha", "FAILED", 12000),
			        new Payment(1005, "Arjun", "FAILED", 2000),
			        new Payment(1006, "Sneha", "SUCCESS", 9000)
			    ),
			    Arrays.asList(
			        new Payment(1007, "Karan", "FAILED", 15000),
			        new Payment(1008, "Riya", "FAILED", 7000),
			        new Payment(1009, "Vikas", "FAILED", 11000)
			    )
			);
		
		List<String> result = regionalPayments.stream()
				.flatMap(pay -> pay.stream())
				.filter(pay -> pay.status.equalsIgnoreCase("failed") && pay.amount >= 5000)
				.limit(3)
				.map(pay -> pay.transactionId+" ---> "+pay.customer+" ---> "+pay.amount)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
