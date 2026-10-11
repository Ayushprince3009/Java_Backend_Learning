package com.practice.product;

public class ProductService {
	public void displayProduct(Product product) {
		System.out.println("Product ID:- "+product.getId());
		System.out.println("Product Name:- "+product.getName());
		System.out.println("Product Price:- "+product.getPrice());
	}
}
