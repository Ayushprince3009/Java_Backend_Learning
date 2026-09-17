package com.kodewala.string.practice;

public class Split {
	public static void main(String[] args) {
//		String str = "Java Python C++ C";
//		
//		String[] str1 = str.split(" ");
//		
//		for(String arr:str1) {
//			System.out.println(arr);
//		}

//		String str = "apple,banana,mango,orange";
//		
//		String[] str1 = str.split(",");
//		
//		for(String s:str1) {
//			System.out.println(s);
//		}

		String str = "Java is easy";

//		String[] arr = str.split(" ");
//		
//		System.out.println(arr.length);
//		for(String s:arr) {
//			System.out.println(s);
//		}

		char[] arr = str.toCharArray();
		int count = 0;
//		for(char s:arr) {
//			
//			System.out.println(s);
//			if(s == 'a' || s=='e' || s=='i' || s=='o' || s=='u') {
//				count++;
//			}
//		}

		for (char s : arr) {

			System.out.println(s);
			if (s != 'a' || s != 'e' || s != 'i' || s != 'o' || s != 'u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
