package com.kodewala.linkedlist.pq1;
import java.util.LinkedList;
public class q7 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.addFirst(50);
		list.addLast(150);
		list.add(1, 75);
		System.out.println(list.get(2));
		System.out.println(list);
	}
}
