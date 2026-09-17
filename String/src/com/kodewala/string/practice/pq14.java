package com.kodewala.string.practice;

public class pq14 {
	public static void main(String[] args) {
		String str = "ayush";
		
		char [] arr = str.toCharArray();
		
		int len = arr.length;
	
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		for(char ele : arr) {
			System.out.print(ele);
		}
		
		System.out.println();
		
		String str1 = new String(arr);
		System.out.println(str1);
	}
}
