package com.kodewala.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Order {
    int orderId;
    String product;
    String status;
    int amount;

    Order(int orderId, String product, String status, int amount) {
        this.orderId = orderId;
        this.product = product;
        this.status = status;
        this.amount = amount;
    }
}
public class Q3 {
	public static void main(String[] args) {
		List<List<Order>> regionalOrders = Arrays.asList(
			    Arrays.asList(
			        new Order(501, "Laptop", "COMPLETED", 65000),
			        new Order(502, "Mouse", "PENDING", 800),
			        new Order(503, "Monitor", "COMPLETED", 12000)
			    ),
			    Arrays.asList(
			        new Order(504, "Keyboard", "COMPLETED", 1500),
			        new Order(505, "Phone", "CANCELLED", 25000),
			        new Order(506, "Tablet", "COMPLETED", 30000)
			    ),
			    Arrays.asList(
			        new Order(507, "Headphones", "COMPLETED", 2500),
			        new Order(508, "Camera", "COMPLETED", 45000),
			        new Order(509, "Smartwatch", "PENDING", 5000)
			    )
			);
		
		List<String> result = regionalOrders.stream()
				.flatMap(order -> order.stream())
				.filter(order -> order.status.equalsIgnoreCase("Completed") && order.amount >= 10000)
				.limit(4)
				.map(order -> order.orderId + " ---> "+order.product+" ---> "+order.amount)
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
