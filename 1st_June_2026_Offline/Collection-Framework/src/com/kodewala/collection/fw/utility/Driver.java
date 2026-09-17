package com.kodewala.collection.fw.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>();
		cities.add("BLR");
		cities.add("CH");
		cities.add("HYD");
		cities.add("GGN");
		cities.add("DL");
		cities.add("AHM");

		System.out.println(cities);

		Collections.sort(cities);
		System.out.println(cities);

		List<String> unList = Collections.unmodifiableList(cities);
		// Trying to modify it
		//unList.add("KOL");
		System.out.println(unList);
		
		List<String> syncList = Collections.synchronizedList(cities);
		
		// syncList is thread safe 
		
		Collections.reverse(cities);
		
		System.out.println(cities);

	}
}
