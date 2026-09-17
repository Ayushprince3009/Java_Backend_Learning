package com.kodewala.dsa.arr.del.ins;

public class q5 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 0, 0, 0};
		int size = 5;
		//add 99 to index 2
		for(int i=size-1; i>=2; i--) {
			arr[i+1] = arr[i];
		}
		arr[2] = 99;
		size++;
		
		//search 40 and delete 
		int target = 40;
		int index = -1;
		for(int i=0; i<size; i++) {
			if(arr[i] == target) {
				index  = i;
				break;
			}
		}
		
		if(index != -1) {
			for(int i=index; i<size; i++) {
				arr[i] = arr[i+1];
			}
			size--;
			
			
		}
		
		//delete from begning
		
		for(int i=0; i<size; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		
		
		for(int i=size-1; i>=2; i--) {
			arr[i+1] = arr[i];
		}
		arr[2] = 77;
		size++;
		
		
		//last ele delete
		size--;
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
