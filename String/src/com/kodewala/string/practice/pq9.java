package com.kodewala.string.practice;

public class pq9 {
	public static void main(String[] args) {
		String str = "ayush Kumar";
		
		char[] arr = str.toUpperCase().toCharArray();
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='A' || arr[i]=='E'|| arr[i]=='I'|| arr[i]=='O'|| arr[i]=='U') {
				vowelCount++;
			}
			else {
				consonantCount++;
			}
		}
		System.out.println("Vowels:- "+vowelCount);
		System.out.println("Consonants:- "+consonantCount);
	}
}
