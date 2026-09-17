package com.kodewala.dsa.arr.del.mixed;

public class q9 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 20, 40, 50};
		int size = 6;
		int target = 20;
		int index = -1;
		for(int i=0; i<size; i++) {
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			for(int i=index; i<size-1; i++ ) {
				arr[i] = arr[i+1];
			}
			size--;
			
			for(int i=0; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
