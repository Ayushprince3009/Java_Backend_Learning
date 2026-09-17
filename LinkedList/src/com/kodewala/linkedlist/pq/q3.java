package com.kodewala.linkedlist.pq;

import java.util.LinkedList;

public class q3 {
	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<Integer>();
		list.add(34);
		list.add(23);
		list.add(12);
		list.add(53);
		list.add(87);
		
		int min = list.get(0);
		
		for(int i=1; i<list.size(); i++) {
			if(list.get(i) < min) {
				min = list.get(i);
			}
		}
		System.out.println("Minimum Element: "+min);
		
	}
}
