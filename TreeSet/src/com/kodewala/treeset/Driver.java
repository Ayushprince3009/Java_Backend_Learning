package com.kodewala.treeset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		//Set<String>cart = new TreeSet<String>();
		//Set<String>cart = new HashSet<String>();
//		cart.add("Mobile");
//		cart.add("Apple");
//		cart.add("Mouse");
//		cart.add("Keyboard");
//		cart.add("Mobile");
//		cart.add("Ayush");
//		cart.add("Ayule");
		
		Set<Integer>num = new TreeSet<Integer>();
		num.add(12);
		num.add(1);
		num.add(7);
		num.add(126);
		num.add(3);
		num.add(45);
		System.out.println(num);
	}
}

