package com.kodewala.hashset.practicee.q1;

import java.util.HashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<String> name = new HashSet<String>(16);
		name.add("Ayush");
		name.add("Ayush");
		name.add("Aman");
		name.add("Amit");
		name.add("Parihar");
		name.add("Rahul");
		name.add("Oxy");
		name.add("Rohan");
		name.add("Prashant");
		name.add("Bishwa");
		name.add("Negi");
		name.add("Abhishek");
		int capacity = 64;
		int hash = "Ayush".hashCode();
		int spread = hash ^ (hash >>> 16);
		int bucket = spread & (capacity - 1);
		System.out.println(bucket);
		System.out.println(name);
	}
}

