package com.kodewala.string.practice;

public class replace {
	public static void main(String[] args) {
		String str = "Java";
		
		int len = str.length();
		System.out.println("Length:- "+len);
		System.out.println(str);
		String str1 = (str.replace("Java","Python"));
		System.out.println(str1.length());
		System.out.println(str1);
		
		
		
	}
}
