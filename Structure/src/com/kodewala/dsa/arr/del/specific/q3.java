package com.kodewala.dsa.arr.del.specific;

public class q3 {
	public static void main(String[] args) {
		int[] arr = {5, 10, 15, 20, 25};
		int size = 5;
		int index = 4;
		
		for(int i=index; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
