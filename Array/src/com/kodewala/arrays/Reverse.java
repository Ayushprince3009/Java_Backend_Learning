package com.kodewala.arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 56, 8, 34, 9, 15 };
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[arr.length - 1];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}

}
