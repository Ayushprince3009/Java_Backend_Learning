package com.kodewala.treeset.pa5;

import java.util.Set;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		
		Set<Product> product = new TreeSet<Product>();
		
		Product p1 = new Product(201, "Laptop");
		Product p2 = new Product(202, "Mouse");
		Product p3 = new Product(203, "Keyboard");
		Product p4 = new Product(201, "Monitor");
		Product p5 = new Product(204, "Laptop");
		Product p6 = new Product(202, "Webcam");
		
		product.add(p1);
		product.add(p2);
		product.add(p3);
		product.add(p4);
		product.add(p5);
		product.add(p6);
		
		System.out.println(product.size());
		
		for(Product p : product) {
			System.out.println(p);	
		}
		
	}
}

class Product implements Comparable<Product>{
	private int productId;
	private String name;
	
	public Product(int productId, String name) {
		this.productId = productId;
		this.name = name;
	}

	public int getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Product p) {
		int result = Integer.compare(this.productId, p.productId);
		return result;
	}
	
	@Override
	public String toString() {
		return "Product{id=" + getProductId() + ", name= '"+ name + "'}";
	}
	
	
}