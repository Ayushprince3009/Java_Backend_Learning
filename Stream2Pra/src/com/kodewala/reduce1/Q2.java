package com.kodewala.reduce1;

import java.util.Arrays;
import java.util.List;

class Product {
    private String name;
    private int quantity;
    private double price;
    private boolean available;

    public Product(String name, int quantity, double price, boolean available) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.available = available;
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return available; }
}

class Order {
    private int orderId;
    private String status;
    private List<Product> products;

    public Order(int orderId, String status, List<Product> products) {
        this.orderId = orderId;
        this.status = status;
        this.products = products;
    }

    public int getOrderId() { return orderId; }
    public String getStatus() { return status; }
    public List<Product> getProducts() { return products; }
}
public class Q2 {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
			    new Order(101, "COMPLETED", Arrays.asList(
			        new Product("Laptop", 2, 60000, true),
			        new Product("Mouse", 5, 500, true),
			        new Product("Keyboard", 3, 1500, false)
			    )),
			    new Order(102, "PENDING", Arrays.asList(
			        new Product("Monitor", 2, 12000, true),
			        new Product("Mouse", 2, 500, true)
			    )),
			    new Order(103, "COMPLETED", Arrays.asList(
			        new Product("Laptop", 1, 60000, true),
			        new Product("Monitor", 3, 12000, true),
			        new Product("Webcam", 2, 3000, false)
			    )),
			    new Order(104, "COMPLETED", Arrays.asList(
			        new Product("Headphones", 4, 2500, true),
			        new Product("Mouse", 3, 500, true)
			    ))
			);
	}
}
