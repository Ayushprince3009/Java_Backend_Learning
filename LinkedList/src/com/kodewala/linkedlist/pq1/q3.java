package com.kodewala.linkedlist.pq1;

import java.util.LinkedList;

public class q3 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		list.set(1, 25);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		System.out.println(list);
	}
}
