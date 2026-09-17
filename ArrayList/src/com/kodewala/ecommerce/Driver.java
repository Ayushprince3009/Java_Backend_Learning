package com.kodewala.ecommerce;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<String> cart = new ArrayList<String>();
		cart.add("Laptop");
		cart.add("Mouse");
		cart.add("Keyboard");
		cart.add("Mouse");
		cart.add("Monitor");
		cart.add("Mouse");
		
		System.out.println(cart);
		
		cart.add(0, "Webcam");
		cart.add(3,"Headphone");
		cart.set(cart.indexOf("Mouse"), "Gaming Mouse");
		System.out.println(cart);
		System.out.println(cart.contains("Mouse"));
		System.out.println(cart.indexOf("Mouse"));
		System.out.println(cart.lastIndexOf("Mouse"));
		System.out.println(cart.get(3));
		//System.out.println(cart.getFirst());
		//System.out.println(cart.getLast());
		cart.remove("Monitor");
		//cart.removeLast();
		
		System.out.println("Total Item: "+cart.size());
		System.out.println(cart);
		
		
	}
}
