package com.kodewala.hashset.practicee.q14;

import java.util.HashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<Cart> cartItem = new HashSet<Cart>();
		
		Cart c1 = new Cart("P101", "T-Shirt", "M", "Black", 599);
		Cart c2 = new Cart("P101", "T-Shirt", "M", "Black", 699);
		Cart c3 = new Cart("P101", "T-Shirt", "L", "Black", 599);
		Cart c4 = new Cart("P101", "T-Shirt", "M", "White", 599);
		Cart c5 = new Cart("P102", "Jeans", "M", "Blue", 999);
		Cart c6 = new Cart("P102", "Jeans", "M", "Blue", 1099);
		Cart c7 = new Cart("P102", "Jeans", "L", "Blue", 999);
		
		cartItem.add(c1);
		cartItem.add(c2);
		cartItem.add(c3);
		cartItem.add(c4);
		cartItem.add(c5);
		cartItem.add(c6);
		cartItem.add(c7);
		
		System.out.println(cartItem.size());

	}
}
