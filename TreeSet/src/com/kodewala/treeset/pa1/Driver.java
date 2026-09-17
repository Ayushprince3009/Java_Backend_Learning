package com.kodewala.treeset.pa1;

import java.util.Set;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		Set<String> name = new TreeSet<String>();
		name.add("Ram");
		name.add("Ayush");
		name.add("Ayuush");
		name.add("Mohan");
		name.add("Rohan");
		name.add("Ashutosh");
		name.add("Rahul");
		name.add("Ashutosh");
		
		System.out.println(name.size());
		
		System.out.println(name);
	}
}
