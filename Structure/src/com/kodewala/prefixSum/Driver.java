package com.kodewala.prefixSum;

public class Driver {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		
		int[] prefix = new int[num.length];
		
		prefix[0] = num[0];
		
		for(int i=1; i<num.length; i++) {
			prefix[i] = prefix[i-1] + num[i];
		}
		
		for(int i=0; i<prefix.length; i++) {
			System.out.print(prefix[i]+" ");
		}
	}
}
