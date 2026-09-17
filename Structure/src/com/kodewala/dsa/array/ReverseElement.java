package com.kodewala.dsa.array;

public class ReverseElement {

	public static void main(String[] args) {
		int[] arr = {2,65,34,12,87,34,22,342,148,6};
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
