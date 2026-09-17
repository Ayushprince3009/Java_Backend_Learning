package com.kodewala.linkedlist.browsertabmanagement;
import java.util.LinkedList;
public class Driver {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Google");
		list.add("GitHub");
		list.add("YouTube");
		list.set(2, "ChatGPT");
		list.addLast("Amazon");
		System.out.println(list.get(2));
		list.remove("GitHub");
		list.set(0, "Gmail");
		
	}
}
