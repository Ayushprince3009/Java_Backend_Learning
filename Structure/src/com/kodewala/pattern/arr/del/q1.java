package com.kodewala.pattern.arr.del;

public class q1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int size = arr.length;
		for (int i = 0; i < size-1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;

		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
