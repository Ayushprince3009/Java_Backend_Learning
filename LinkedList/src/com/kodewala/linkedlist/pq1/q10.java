package com.kodewala.linkedlist.pq1;
import java.util.LinkedList;
public class q10 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.addFirst(5);
		list.addLast(40);
		list.set(2, 15);
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.set(1, 100);
		System.out.println(list.contains(30));
		list.remove(Integer.valueOf(100));
		list.removeFirst();
		list.removeLast();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list);
	}
}
