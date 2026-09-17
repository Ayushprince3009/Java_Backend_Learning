package com.kodewala.collection.fw.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Driver1 {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>();
		cities.add("BLR");
		cities.add("CH");
		cities.add("HYD");
		cities.add("GGN");
		cities.add("DL");
		cities.add("AHM");

		ListIterator<String> itr = cities.listIterator();

		while (itr.hasNext()) {
			String element = itr.next();

			if (itr.hasPrevious()) {
				String prevElemt = itr.previous();
				System.out.println(prevElemt);
				break;
			}
			// removing the element at index 3rd // Modify the collection
			// itr.remove();
		}

	}
}
