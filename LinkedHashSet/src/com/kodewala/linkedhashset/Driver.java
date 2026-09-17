package com.kodewala.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<String>cart = new LinkedHashSet<String>();
		//Set<String>cart = new HashSet<String>();
		cart.add("Mobile");
		cart.add("Apple");
		cart.add("Mouse");
		cart.add("Keyboard");
		cart.add("Mobile");
		cart.add("Shoes");
		cart.add("Apple");
		
		System.out.println(cart);
	}
}
