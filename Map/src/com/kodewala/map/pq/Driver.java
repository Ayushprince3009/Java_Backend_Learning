package com.kodewala.map.pq;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		map.put("Karnatka", "Bang");
		map.put("Maharastra", "Mumbai");
		map.put("Bihar", "Patna");
		map.put("Karnatka", "blr");
		map.put("Karnatka", "Bangalore");
		map.put("KA", "Bangalore");
		map.put("Uttar Pradesh", "Lucknow");
		map.put("Jharkhand", "Ranchi");
		map.put("Tamil Nadu", "Chennai");
		map.put("Uttrakhand", "Dehradun");
		map.put("Goa", "Panji");
		System.out.println(map);
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		
		Iterator<Entry<String,String>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Entry<String,String> entry = itr.next();
			System.out.println("Key:- "+entry.getKey()+ " and Value:- "+entry.getValue());
		}
	}
}
