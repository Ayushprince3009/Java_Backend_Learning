package com.kodewala.streamAPI.practice3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
			    new Product("Laptop", 50000),
			    new Product("Mouse", 500),
			    new Product("Keyboard", 1500),
			    new Product("Monitor", 12000)
			);
		
		List<String> result = products.stream()
				.filter(prod -> (prod.getPrice() > 1000))
				.map(pro -> pro.getProduct())
				.collect(Collectors.toList());
		
		System.out.println(result);
	}
}

class Product{
	private String product;
	private int price;
	
	public Product(String product, int price) {
		this.product = product;
		this.price = price;
	}
	
	public String getProduct() {
		return product;
	}
	
	public int getPrice() {
		return price;
	}
}
