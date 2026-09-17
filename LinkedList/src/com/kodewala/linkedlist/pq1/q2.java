package com.kodewala.linkedlist.pq1;
import java.util.LinkedList;
public class q2 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(67);
		list.add(87);
		list.add(2);
		list.add(4);
		list.addFirst(12);
		list.addLast(33);
		System.out.println(list);
		
		list.add(2,30);
		System.out.println(list.get(2));
		
		System.out.println(list);
	}
}
