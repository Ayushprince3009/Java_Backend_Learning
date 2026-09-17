package com.kodewala.utility.p1;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>();
		cities.add("BLR");
		cities.add("HYD");
		cities.add("GGN");
		cities.add("HYD");
		cities.add("CCG");
		cities.add("DL");
		cities.add("AHM");
		cities.add("CH");
		
		System.out.println(cities);
		
		Collections.sort(cities);
		System.out.println(cities);
		
//		List<String> unList = Collections.unmodifiableList(cities);
//		unList.add("CCF");
	//	System.out.println(unList);
		
		Collections.reverse(cities);
		System.out.println(cities);	
		
		
		System.out.println(Collections.frequency(cities,"HYD" ));
		
	}
}
