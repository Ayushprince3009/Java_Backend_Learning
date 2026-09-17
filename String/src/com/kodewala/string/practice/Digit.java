package com.kodewala.string.practice;

public class Digit {
	public static void main(String[] args) {
		String num = "Java12345";
		
		int len = num.length();
		System.out.println("Length of String:- "+len);
		
		char[] arr = num.toCharArray();
//		
		int count = 0;
//		for(char s:arr) {
//			count++;
//		}
//		System.out.println(count);
	
		for(char s:arr) {
			if(s>='0' && s<='9') {
				count++;
			}
		}
		System.out.println("Digits in String:- "+count);
	}
}
