package com.kodewala.clothing;

public class WomensProduct extends ClothingProduct {
	public static String name = "xyzxc";
	public static String gender = "female";
	public static void main(String[] args) {
		WomensProduct customer = new WomensProduct();
		System.out.println("Customer Name:- "+name);
		System.out.println("Gender:- "+gender);
		System.out.println("Product Id:- "+customer.productId);
		System.out.println("Item Name:- "+customer.productName);
		System.out.println("Color:- "+customer.color);
		System.out.println("Size:- "+customer.size);
		System.out.println("Price:- "+customer.productPrice);
		
	}
}
