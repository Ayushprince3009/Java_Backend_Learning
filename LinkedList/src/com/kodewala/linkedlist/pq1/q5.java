package com.kodewala.linkedlist.pq1;
import java.util.LinkedList;
public class q5 {
	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.removeFirst();
		System.out.println(list.contains(30));
		System.out.println(list);
	}
}
