package com.kodewala.interfac.pq2;

public class Driver {
	public static void main(String[] args) {
		Shopping flipkart = new Flipkart();
		System.out.println("Flipkart");
		flipkart.searchProduct();
		flipkart.addToCart();
		flipkart.placeOrder();
		flipkart.makePayment();
		flipkart.productFeedback();
		System.out.println("------------------");
		
		Shopping amazon = new Amazon();
		System.out.println("Amazon");
		amazon.searchProduct();
		amazon.addToCart();
		amazon.placeOrder();
		amazon.makePayment();
		amazon.productFeedback();
		System.out.println("------------------");
		
		Shopping meesho = new Meesho();
		System.out.println("Meesho");
		meesho.searchProduct();
		meesho.addToCart();
		meesho.placeOrder();
		meesho.makePayment();
		
		//default is availble for all
		//meesho.productFeedback();
		System.out.println("------------------");
		
		Shopping snapdeal = new Snapdeal();
		System.out.println("Snapdeal");
		snapdeal.searchProduct();
		snapdeal.addToCart();
		snapdeal.placeOrder();
		snapdeal.makePayment();
		snapdeal.productFeedback();
		System.out.println("------------------");	
	}
}
