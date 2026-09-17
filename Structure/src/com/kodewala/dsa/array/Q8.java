//Insert an element at the beginning.

package com.kodewala.dsa.array;

public class Q8 {
	public static void main(String[] args) {
		//int[] arr = new int[15];
		int[] arr = {34,23,64,87,23,457,76,234,646,342,55,0};
		int size = arr.length;
		int ele = 456789;
		
		for(int i=arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = ele;
		size++;
		
		for(int i=0; i<size-1; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
