package com.kodewala.streamAPI.practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver5 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
			    new Product("Laptop", 50000),
			    new Product("Mobile", 30000),
			    new Product("TV", 45000),
			    new Product("Monitor", 20000),
			    new Product("Tablet", 25000)
			);

		List<Integer> output = products.stream()
				.map(pro -> pro.getPrice())
				.sorted()
				.skip(products.size() - 3)
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(output);
		
		List<Integer> output1 = products.stream()
				.map(pro -> pro.getPrice())
				.sorted((a,b) -> (b-a))
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(output1);
		
		products.stream().map(pro -> pro.getPrice())
		.sorted().skip(products.size()-3).limit(3)
		.forEach(pro -> System.out.println(pro));
		
		
		
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