package com.kodewala.linkedlist.shopping;
import java.util.LinkedList;
public class Driver {
	public static void main(String[] args) {
		LinkedList<String>list = new LinkedList<String>();
		list.add("Laptop");
		list.add("Mouse");
		list.add("Keyboard");
		list.add("Monitor");
		
		System.out.println(list.contains("Mouse"));
		list.remove("Keyboard");
		list.removeFirst();
		list.removeLast();
		System.out.println(list.size());
		System.out.println(list);
	}
}
