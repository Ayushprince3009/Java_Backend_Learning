package com.kodewala.map.pq1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Driver {
	public static void main(String[] args) {
//		Map<String,String> linkedHashMap = new LinkedHashMap<String,String>();
//		linkedHashMap.put("Karnatka", "Bang");
//		linkedHashMap.put("Maharastra", "Mumbai");
//		linkedHashMap.put("Bihar", "Patna");
//		linkedHashMap.put("Karnatka", "blr");
//		linkedHashMap.put("Karnatka", "Bangalore");
//		linkedHashMap.put("KA", "Bangalore");
//		linkedHashMap.put("Uttar Pradesh", "Lucknow");
//		linkedHashMap.put("Jharkhand", "Ranchi");
//		linkedHashMap.put("Tamil Nadu", "Chennai");
//		linkedHashMap.put("Uttrakhand", "Dehradun");
//		linkedHashMap.put("Goa", "Panji");
//		System.out.println(linkedHashMap);
		
		
		Map<String,String> treeMap = new TreeMap<String,String>();
		treeMap.put("Karnatka", "Bang");
		treeMap.put("Maharastra", "Mumbai");
		treeMap.put("Bihar", "Patna");
		treeMap.put("Karnatka", "blr");
		treeMap.put("Karnatka", "Bangalore");
		treeMap.put("KA", "Bangalore");
		treeMap.put("Uttar Pradesh", "Lucknow");
		treeMap.put("Jharkhand", "Ranchi");
		treeMap.put("Tamil Nadu", "Chennai");
		treeMap.put("Uttrakhand", "Dehradun");
		treeMap.put("Goa", "Panji");
		System.out.println(treeMap);
		
	}
}
