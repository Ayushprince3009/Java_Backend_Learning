package com.kodewala.iq;

public class q2 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 20, 40, 20, 50};
		int size = 7;
		int target = 20;
		int index = -1;
		for(int i=0; i<size; i++) {
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		
		for(int i=index; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
