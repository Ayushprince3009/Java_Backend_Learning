package com.kodewala.linkedlist.pq;

import java.util.LinkedList;

public class q1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		//list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//list.add(50);
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		System.out.println("First Element: "+list.get(0));
//		System.out.println("2nd Element: "+list.get(2));
//		System.out.println("Last element: "+list.get(list.size()-1));
		
		list.add(0, 10);
		list.addFirst(23);
		list.addLast(34);
		list.add(list.size(),50);
		list.removeFirst();
		list.removeLast();
		list.removeFirstOccurrence(30);
		for(int ele : list) {
			System.out.println(ele);
		}
		
	}
}
