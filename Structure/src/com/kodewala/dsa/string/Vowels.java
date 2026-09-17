package com.kodewala.dsa.string;

public class Vowels {
	public static void main(String[] args) {
		String s = "qwertuyygyuhjknUHFWQTJGFNDarghtgnvds";
		
		int vowelCount = 0;
		int consoCount = 0;
		
		char[] arr = s.toLowerCase().toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				vowelCount++;
			}
			else {
				consoCount++;
			}
		}
		System.out.println("Vowel:- "+vowelCount);
		System.out.println("ConsoCount:- "+consoCount);
		
	}
}
