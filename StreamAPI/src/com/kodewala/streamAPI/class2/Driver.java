package com.kodewala.streamAPI.class2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,5,8,3,1,9,7,3,12);
//		
		
//		number.stream().sorted().skip(10).forEach(n -> System.out.println(n));
//		System.out.println("------------------");
//		List<Integer> result = number.stream().distinct().sorted().collect(Collectors.toList());
//		System.out.println(result);
		
//		List<String> list = Arrays.asList("CH","BLR","GGN","DL","HYD","BLR","CHE","CHE","AHM");
		
		//filter city with c and return 1st city
		
		//list.stream().filter(c -> c.startsWith("C")).limit(1).forEach(e -> System.out.println(e));
		
//		list.stream().distinct().sorted().forEach(e -> System.out.println(e));
//		System.out.println("------------");
		
		//list.stream().skip(3).forEach(c -> System.out.println(c));
		
		number.stream().distinct().sorted((a,b) -> b-a).skip(2).limit(1).forEach(n -> System.out.println(n));
		 
		
	
	
	}
}
