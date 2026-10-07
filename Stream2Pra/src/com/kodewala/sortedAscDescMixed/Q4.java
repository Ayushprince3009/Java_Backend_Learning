package com.kodewala.sortedAscDescMixed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Order {
    int orderId;
    String customer;
    double amount;
    String status;

    Order(int orderId, String customer, double amount, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return orderId + " | " + customer + " | " + amount + " | " + status;
    }
}

public class Q4 {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
			    new Order(501, "Rahul", 4500, "COMPLETED"),
			    new Order(502, "Priya", 7000, "PENDING"),
			    new Order(503, "Amit", 12000, "COMPLETED"),
			    new Order(504, "Neha", 9000, "CANCELLED"),
			    new Order(505, "Arjun", 6500, "COMPLETED"),
			    new Order(506, "Sneha", 3000, "COMPLETED"),
			    new Order(507, "Karan", 15000, "COMPLETED"),
			    new Order(508, "Riya", 5500, "COMPLETED")
			);
		
		List<String> result = orders.stream()
				.filter(order -> (order.amount >= 5000) && (order.status.equalsIgnoreCase("Completed")))
				.sorted((a,b) -> Double.compare(a.amount, b.amount))
				.map(order -> order.customer)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
