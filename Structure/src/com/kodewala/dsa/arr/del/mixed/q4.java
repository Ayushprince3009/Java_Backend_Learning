package com.kodewala.dsa.arr.del.mixed;

public class q4 {
	public static void main(String[] args) {
		int[] arr = {100, 200, 300, 400, 500};
		int size = 5;

		for(int i=0; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
