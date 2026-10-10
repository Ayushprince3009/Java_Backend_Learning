package com.kodewala.findFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Order {
    int orderId;
    String status;
    List<String> products;

    Order(int orderId, String status, List<String> products) {
        this.orderId = orderId;
        this.status = status;
        this.products = products;
    }
}
public class Q3 {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
			    new Order(101, "PAID", Arrays.asList("Laptop", "Mouse")),
			    new Order(102, "PENDING", Arrays.asList("Desk", "Chair")),
			    new Order(103, "PAID", Arrays.asList("Mouse", "Keyboard")),
			    new Order(104, "PAID", Arrays.asList("Monitor", "Laptop")),
			    new Order(105, "CANCELLED", Arrays.asList("Tablet", "Phone")),
			    new Order(106, "PAID", Arrays.asList("Keyboard", "Headphones"))
			);
		Optional<String> result = orders.stream()
				.filter(order -> order.status.equalsIgnoreCase("paid"))
				.flatMap(order -> order.products.stream())
				.distinct()
				.sorted()
				.skip(1)
				.findFirst();
		System.out.println(result);
	}
}
