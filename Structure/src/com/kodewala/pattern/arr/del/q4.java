package com.kodewala.pattern.arr.del;

public class q4 {
	public static void main(String[] args) {
		int[] arr = {99};
		int size = 1;
		
		if(size != 0) {
			for(int i = 0; i<size-1; i++) {
				arr[i] = arr[i+1];
			}
			size --;
		}
		else {
			System.out.println("Invalid Array");
		}
	}
}
