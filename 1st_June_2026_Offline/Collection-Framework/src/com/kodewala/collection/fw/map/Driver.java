package com.kodewala.collection.fw.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("some key"); // hashmap --> put(key , value)

		Map<String, String> map = new HashMap<String, String>(); // Capacity : 16

		// adding - Key and values
		map.put("Karnataka", "BLR");
		map.put("Gujrat", "Gandhi Nagar");
		map.put("Gujrat", "GN");
		map.put("Maharastra", "Mumbai");
		map.put("Punjab", "Chandigarh");
		map.put("Haryana", "Chandigarh");

		Set<Entry<String, String>> entrySet = map.entrySet();

		Iterator<Entry<String, String>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();

			System.out.println(" key : " + entry.getKey() + " and value : " + entry.getValue());
		}

		// System.out.println(map);

		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>(); // Capacity : 16

		// adding - Key and values
		linkedHashMap.put("Karnataka", "BLR");
		linkedHashMap.put("Gujrat", "Gandhi Nagar");
		linkedHashMap.put("Gujrat", "GN");
		linkedHashMap.put("Maharastra", "Mumbai");
		linkedHashMap.put("Punjab", "Chandigarh");
		linkedHashMap.put("Haryana", "Chandigarh");

		// System.out.println(linkedHashMap);

		Map<String, String> treeMap = new TreeMap<String, String>(); // Capacity : 16

		// adding - Key and values
		treeMap.put("Karnataka", "BLR");
		treeMap.put("Gujrat", "Gandhi Nagar");
		treeMap.put("Gujrat", "GN");
		treeMap.put("Maharastra", "Mumbai");
		treeMap.put("Punjab", "Chandigarh");
		treeMap.put("Haryana", "Chandigarh");

		System.out.println(treeMap.get("Haryana")); // set.contains() --> boolean

	}
}
