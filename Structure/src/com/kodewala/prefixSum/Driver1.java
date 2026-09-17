package com.kodewala.prefixSum;

public class Driver1 {
	public static void main(String[] args) {
		int[] nums = {2,4,6,8,10};
		sum(nums,1,3);
		
		
	}
	
	public static void sum(int[] nums,int a, int b) {
		for(int i=a; i<=b; i++) {
			nums[i] = nums[i-1] + nums[i];
		}
	}
}
