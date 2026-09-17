package com.kodewala.linkedlist.pq;

import java.util.LinkedList;

public class q2 {
	public static void main(String[] args) {
		LinkedList <Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
//		System.out.println(list.contains(30));
		
		int max = list.getFirst();
		
		for(int ele : list) {
			if(ele > max) {
				max = ele;
			}
		}
		System.out.println(max);
	}
}
