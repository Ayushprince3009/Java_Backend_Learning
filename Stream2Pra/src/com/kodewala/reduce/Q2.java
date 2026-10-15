package com.kodewala.reduce;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private String name;
    private int quantity;
    private double price;
    private boolean available;

    public Product(String name, int quantity, double price,
                   boolean available) {
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
			        new Product("Laptop", 2, 50000, true),
			        new Product("Mouse", 3, 500, true),
			        new Product("Keyboard", 1, 1500, false)
			    )),
			    new Order(102, "CANCELLED", Arrays.asList(
			        new Product("Monitor", 2, 12000, true),
			        new Product("Mouse", 2, 500, true)
			    )),
			    new Order(103, "COMPLETED", Arrays.asList(
			        new Product("Laptop", 1, 50000, true),
			        new Product("Headphones", 2, 2000, true),
			        new Product("Mouse", 1, 500, false)
			    )),
			    new Order(104, "COMPLETED", Arrays.asList(
			        new Product("Monitor", 1, 12000, true),
			        new Product("Keyboard", 2, 1500, true)
			    ))
			);
		
		//1st pipeline
		double totalRevenue = orders.stream()
				.filter(order -> order.getStatus().equalsIgnoreCase("completed"))
				.flatMap(pro -> pro.getProducts().stream())
				.filter(pro -> pro.isAvailable())
				.map(pro -> pro.getQuantity() * pro.getPrice())
				.reduce(0.0, (a,b) -> a+b);
				
		
		//2nd pipeline
		
		int totalUnits = orders.stream()
				.filter(order -> order.getStatus().equalsIgnoreCase("completed"))
				.flatMap(pro -> pro.getProducts().stream())
				.filter(pro -> pro.isAvailable())
				.map(pro -> pro.getQuantity())
				.reduce(0, (a,b) -> a+b);
		System.out.println(totalUnits);
		
		//3rd pipeline
		List<String> productNames = orders.stream()
				.filter(order -> order.getStatus().equalsIgnoreCase("completed"))
				.flatMap(pro -> pro.getProducts().stream())
				.filter(pro -> pro.isAvailable())
				.map(pro -> pro.getName())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
				
		System.out.println(productNames);
		
//		//4th pipeline
		
		orders.stream().filter(order -> order.getStatus().equalsIgnoreCase("completed"))
		.filter(order -> order.getProducts().stream().filter(pro -> pro.isAvailable()).map(pro -> pro.getQuantity() * pro.getPrice()).reduce(0.0, (a,b) -> a+b ) > 50000)
		.map(order -> order.getOrderId())
		.forEach(order -> System.out.println(order));
		
		
				
		
		
		
	}
}
