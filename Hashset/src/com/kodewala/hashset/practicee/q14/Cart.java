package com.kodewala.hashset.practicee.q14;

public class Cart {
	private String productId;
	private String productName;
	private String size;
	private String color;
	private int price;
	
	public Cart(String productId, String productName, String size, String color, int price) {
		this.productId = productId;
		this.productName = productName;
		this.size = size;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return (productId + size + color).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Cart c = (Cart)obj;
		return this.productId.equals(c.productId) 
				&& this.size.equals(c.size)
				&& this.color.equals(c.color);
	}
	
}
