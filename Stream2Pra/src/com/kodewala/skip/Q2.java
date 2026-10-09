package com.kodewala.skip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Order {
    int orderId;
    String customer;
    String status;
    int amount;

    Order(int orderId, String customer, String status, int amount) {
        this.orderId = orderId;
        this.customer = customer;
        this.status = status;
        this.amount = amount;
    }
}
public class Q2 {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
			    new Order(201, "Rahul", "COMPLETED", 5000),
			    new Order(202, "Priya", "COMPLETED", 8000),
			    new Order(203, "Amit", "PENDING", 12000),
			    new Order(204, "Neha", "COMPLETED", 15000),
			    new Order(205, "Rahul", "CANCELLED", 3000),
			    new Order(206, "Arjun", "COMPLETED", 10000),
			    new Order(207, "Sneha", "COMPLETED", 7000),
			    new Order(208, "Karan", "COMPLETED", 20000)
			);
		
		List<String> result = orders.stream()
				.filter(order -> order.status.equalsIgnoreCase("completed") && order.amount >= 7000)
				.skip(2)
				.limit(3)
				.map(order -> order.orderId+" --> "+order.customer+" --->"+ order.amount)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
