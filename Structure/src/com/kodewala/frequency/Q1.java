package com.kodewala.frequency;

public class Q1 {
	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		int n = nums.length;
		int[] freq = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			freq[nums[i]]++;
		}
		
		for(int i=0; i<freq.length; i++) {
			if(freq[i] > (n/2)) {
				System.out.println(i);
			}
		}
	}
}
