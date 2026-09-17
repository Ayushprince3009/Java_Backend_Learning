package com.kodewala.string.practice;

public class pq7 {
	public static void main(String[] args) {
		String str = " ayush kumar kodewala academy ";
		String str1 = str.replace(" ","_");
		System.out.println(str1);
		
		String str2 = "Java is Java a Programming Java langauage Java";
		String str3 = str2.replaceAll("Java","Python");
		System.out.println(str3);
		
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] arr1 = str2.split("Java");
		for(String ele : arr1) {
			System.out.println(ele);
		}
	}
}
