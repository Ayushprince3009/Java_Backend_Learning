package com.kodewala.kartflip.model;

public class CartItem {
	private String productId;
	private String productName;
	private double price;
	private int quantity;
	
	public CartItem(String productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		double totalPrice = getQuantity() * getPrice();
		return totalPrice;
	}
}
