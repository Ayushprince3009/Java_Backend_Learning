package com.kodewala.clothing;

public class MensProduct extends ClothingProduct {
	public static String name = "abcdef";
	public static String gender = "Male";
	public static void main(String[] args) {
		MensProduct customer = new MensProduct();
		System.out.println("Customer Name:- "+name);
		System.out.println("Gender:- "+gender);
		System.out.println("Product Id:- "+customer.productId);
		System.out.println("Item Name:- "+customer.productName);
		System.out.println("Color:- "+customer.color);
		System.out.println("Size:- "+customer.size);
		System.out.println("Price:- "+customer.productPrice);
	}
}
