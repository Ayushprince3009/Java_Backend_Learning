package com.kodewala.linkedlist.studentlist;
import java.util.LinkedList;
public class Driver {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Rahul");
		list.add("Amit");
		list.add("Priya");
		list.add("Neha");
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.set(1, "Rohit");
		System.out.println(list);
	}
}
