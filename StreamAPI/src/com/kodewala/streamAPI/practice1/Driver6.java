/*
 2.Given a list of employee names,
use map() to convert all names to uppercase.
 */
package com.kodewala.streamAPI.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver6 {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Aman","Ayush","Atul","Suresh","Nischita","Ritesh","Priya","Shyam");
		Stream<String> names = name.stream();
		Stream<String> filterName = names.filter(na -> na.contains("a"));
		Stream<String> mapName = filterName.map(n -> n.toUpperCase());
		List<String> result = mapName.collect(Collectors.toList());
		System.out.println(result);
		
		//one line
		List<String> res = name.stream()
				.filter(n -> n.startsWith("A"))
				.map(nam -> nam.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(res);
		
		//one line
		List<String> resu = name.stream()
				.map(n -> n.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(resu);
		
				
	}
}
