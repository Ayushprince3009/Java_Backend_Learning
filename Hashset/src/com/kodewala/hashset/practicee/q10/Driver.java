package com.kodewala.hashset.practicee.q10;

import java.util.HashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<Product> prod = new HashSet<Product>();
		Product p1 = new Product("P101","Nike","Shoes");
		Product p2 = new Product("P101","Nike","Running Shoes");
		Product p3 = new Product("P101","Adidas","Shoes");
		Product p4 = new Product("P102","Nike","Shoes");
		Product p5 = new Product("P101","Adidas","Sports Shoes");
		Product p6 = new Product("P102","Nike","Sneakers");
		
		prod.add(p1);
		prod.add(p2);
		prod.add(p3);
		prod.add(p4);
		prod.add(p5);
		prod.add(p6);
		
		System.out.println(prod.size());
	}
}

class Product{
	private String productCode;
	private String brand;
	private String name;
	
	public Product(String productCode, String brand, String name) {
		this.productCode = productCode;
		this.brand = brand;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.productCode.hashCode() + this.brand.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Product pro = (Product)obj;
		return this.productCode.equals(pro.productCode) && this.brand.equals(pro.brand);
	}
	
	
}
