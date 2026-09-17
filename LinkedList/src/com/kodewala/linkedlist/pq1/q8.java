package com.kodewala.linkedlist.pq1;
import java.util.LinkedList;
public class q8 {
	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.set(2, 35);
		list.removeFirst();
		list.removeLast();
		System.out.println(list.contains(35));
		System.out.println(list);
		
	}
}
