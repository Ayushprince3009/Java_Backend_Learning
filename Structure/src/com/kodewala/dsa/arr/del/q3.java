package com.kodewala.dsa.arr.del;

public class q3 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		int size = 0;
		
		if(size < 1) {
			System.out.println("Empty Array");
		}
		else {
			size--;
			
			for(int i = 0; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
