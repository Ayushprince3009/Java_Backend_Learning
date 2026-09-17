package com.kodewala.hashset.practicee;

public class pq1 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		Delivery d1 = new Delivery();
		Delivery d2 = new Delivery();
		Delivery d3 = new Delivery();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d1.equals(d2));
	}
}
