package com.kodewala.utility.p2;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cities = new CopyOnWriteArrayList<String>();
		//List<String> cities = new ArrayList<String>();
		cities.add("BLR");
		cities.add("HYD");
		cities.add("GGN");
		cities.add("HYD");
		cities.add("CCG");
		cities.add("DL");
		cities.add("AHM");
		cities.add("CH");
		
		Iterator<String> itr = cities.iterator();
		
		while(itr.hasNext()) {
			String element = (String) itr.next();
			System.out.println(element);
			
//			modification not aloowed in iterated list
//			cities.remove(3);
			//cities.remove("GGN");
			
			if(element.equalsIgnoreCase("CH")) {
				System.out.println("removing.....");
				cities.remove(2);
			}
		}
		System.out.println("............");
		System.out.println(cities);
	}
}
