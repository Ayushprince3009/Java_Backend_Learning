package com.kodewala.pattern.printing;

	class Solution {
	    public static void pattern12(int n) {
	        for(int row=1; row<=n; row++){
	            for(int col=1; col<=row; col++){
	                System.out.print(col);
	            }
	            for(int col=1; col<=(n-row); col++){
	                System.out.print(" ");
	            }
	            for(int col=1; col<=(n-row); col++){
	                System.out.print(" ");
	            }
	            for(int col=1; col<=row; col++){
	                System.out.print(col);
	                
	            }
	            System.out.println();
	        }
	    }
	    
	    public static void main(String args[]){
	        pattern12(5);
	    }
	}

