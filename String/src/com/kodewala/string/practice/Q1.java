package com.kodewala.string.practice;

public class Q1 {

	public static void main(String[] args) {
		String str = "Java Programming";
		
		char[] arr = str.toCharArray();
		
		int len = arr.length;
		
		System.out.println("Length of str:- "+len);
		
		System.out.println(str.isEmpty());
		//System.out.println(str.isBlank());   will run on java 11 and java11+
		
		String newStr = str.toUpperCase();
		System.out.println(newStr);
	}

}
