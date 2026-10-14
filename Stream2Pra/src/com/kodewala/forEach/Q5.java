package com.kodewala.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Order {
    private int orderId;
    private String customerName;
    private String status;
    private String paymentMethod;
    private double amount;
    private List<String> items;

    public Order(int orderId, String customerName, String status,
                 String paymentMethod, double amount, List<String> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.items = items;
    }

    public int getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public String getStatus() { return status; }
    public String getPaymentMethod() { return paymentMethod; }
    public double getAmount() { return amount; }
    public List<String> getItems() { return items; }
}
public class Q5 {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
			    new Order(101, "Amit", "DELIVERED", "UPI", 12000,
			        Arrays.asList("Laptop", "Mouse")),
			    new Order(102, "Neha", "CANCELLED", "CARD", 5000,
			        Arrays.asList("Keyboard")),
			    new Order(103, "Rahul", "DELIVERED", "CARD", 25000,
			        Arrays.asList("Laptop", "Monitor")),
			    new Order(104, "Amit", "PROCESSING", "UPI", 8000,
			        Arrays.asList("Headphones", "Mouse")),
			    new Order(105, "Priya", "DELIVERED", "NETBANKING", 18000,
			        Arrays.asList("Monitor", "Keyboard")),
			    new Order(106, "Neha", "DELIVERED", "UPI", 7000,
			        Arrays.asList("Mouse", "Keyboard")),
			    new Order(107, "Rahul", "CANCELLED", "UPI", 15000,
			        Arrays.asList("Laptop")),
			    new Order(108, "Priya", "DELIVERED", "CARD", 32000,
			        Arrays.asList("Laptop", "Monitor", "Mouse"))
			);
		//1st pipeline
		List<String> res = orders.stream()
				.filter(order -> order.getStatus().equalsIgnoreCase("delivered")
						&& order.getAmount() >= 15000)
				.map(order -> order.getCustomerName())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(res);
		
		//2nd pipeline
		
		long count = orders.stream()
				.filter(order -> order.getStatus().equalsIgnoreCase("processing")
						|| order.getAmount() > 20000)
				.count();
		System.out.println(count);
		
		//3rd pipeline
		List<String> resu = orders.stream()
				.filter(order -> order.getStatus().equalsIgnoreCase("delivered"))
				.flatMap(order -> order.getItems().stream())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(resu);
		
		//4th pipeline
		
		orders.stream()
		
		.filter(order -> order.getStatus().equalsIgnoreCase("delivered")
				&& (order.getPaymentMethod().equalsIgnoreCase("upi")
						|| order.getPaymentMethod().equalsIgnoreCase("card"))
				&& order.getAmount() > 10000)
		.forEach(order -> System.out.println(order.getOrderId()+" -- "+order.getCustomerName()+" -- "+order.getAmount()));
		
		
		
	}
}
