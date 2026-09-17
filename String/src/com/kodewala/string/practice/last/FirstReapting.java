package com.kodewala.string.practice.last;

public class FirstReapting {
	public static void main(String[] args) {
		String str = "manhtyu";
		
		char[] arr = str.toLowerCase().toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("First Repeating Character:- "+arr[i]);
					return;
				}
			}
		}
		System.out.println("No repeating Character");
	}
}
