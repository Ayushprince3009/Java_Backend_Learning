package com.kodewala.collection.cchm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Driver {

	public static void main(String[] args) {

		Map<String, Integer> productPrice = new ConcurrentHashMap<String, Integer>();

		// Storing it , 10k + products
		productPrice.put("iPhone16", 160000);
		productPrice.put("samsung20", 120000);
		productPrice.put("LG30", 80000);
		productPrice.put("godrej234", 60000);

		// process it (reading + modifying)

		Map<String, Integer> productPriceSync = Collections.synchronizedMap(productPrice);
		// modification --> 200 ms ---> 500 people were trying to buy 
		productPriceSync.put("LG30", 96000);
		// result is : data issue resolved --> slowness
		
	}

}
