package com.kodewala.linkedlist.pq1;
import java.util.LinkedList;
public class q4 {
	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
	}
}
