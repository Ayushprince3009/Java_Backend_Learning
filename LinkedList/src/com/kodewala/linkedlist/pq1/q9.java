package com.kodewala.linkedlist.pq1;
import java.util.LinkedList;
public class q9 {
	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.addFirst(10);
		list.addLast(40);
		list.add(2,25);
		list.set(3, 35);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.contains(25));
		System.out.println(list.size());
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
	}
}
