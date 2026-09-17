package com.kodewala.linkedlist.musicplaylist;
import java.util.LinkedList;
public class Driver {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Tum Hi Ho");
		list.add("Kesariya");
		list.add("Apna Bna Le");
		list.add("Chaleya");
		System.out.println(list);
		list.set(3,"Heeriye");
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list);
	}
}
