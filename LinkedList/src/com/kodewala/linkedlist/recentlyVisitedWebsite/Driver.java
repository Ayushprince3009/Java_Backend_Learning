package com.kodewala.linkedlist.recentlyVisitedWebsite;
import java.util.LinkedList;
public class Driver {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Google");
		list.add("YouTube");
		list.add("GitHub");
		list.addFirst("Home");
		list.set(2, "ChatGPT");
		System.out.println(list.get(3));
		list.remove("YouTube");
		System.out.println(list.contains("GitHub"));
		System.out.println(list.size());
		System.out.println(list);
	}
}
