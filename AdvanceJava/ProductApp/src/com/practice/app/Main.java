package com.practice.app;

import com.practice.product.Product;
import com.practice.product.ProductService;

public class Main {
	public static void main(String[] args) {
		Product product = new Product(101, "Laptop", 55000);
		
		ProductService ps = new ProductService();
		
		ps.displayProduct(product);
		
	
	}
}
