package com.kodewala.dsa.arr.del.mixed;

public class q1 {
	public static void main(String[] args) {
		int[] arr = {20,30,40,50,0};
		int size = 4;
		int element = 10;
		
		for(int i=size-1; i>=0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = 10;
		size++;
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
