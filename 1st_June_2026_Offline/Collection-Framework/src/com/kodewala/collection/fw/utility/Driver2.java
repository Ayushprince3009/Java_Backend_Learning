package com.kodewala.collection.fw.utility;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver2 {
	public static void main(String[] args) 
	{
		// Fail safe
		CopyOnWriteArrayList<String> cities = new CopyOnWriteArrayList<String>();
		cities.add("BLR");
		cities.add("CH");
		cities.add("HYD");
		cities.add("GGN");
		cities.add("DL");
		cities.add("AHM");

		Iterator<String> itr = cities.iterator();

		while (itr.hasNext()) {
			String element = (String) itr.next();
			System.out.println(element);
			// removing the element at index 3rd // Modify the collection
			if (element.equalsIgnoreCase("AHM")) {
				System.out.println("Driver2.main().. remving");
				cities.remove(3);
			}
		}

	}
}
