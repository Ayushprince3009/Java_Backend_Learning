package com.kodewala.string.practice;

public class pq4 {
	public static void main(String[] args) {
		String str = "new car is new";
		
		System.out.println(str.contains("a"));
		System.out.println(str.contains(" "));
		System.out.println(str.contains("new"));
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf("n"));
		System.out.println(str.indexOf("r"));
		System.out.println(str.lastIndexOf('e'));
		System.out.println(str.startsWith("new"));
		System.out.println(str.endsWith("new"));
		System.out.println(str.endsWith("car"));
	}
}
