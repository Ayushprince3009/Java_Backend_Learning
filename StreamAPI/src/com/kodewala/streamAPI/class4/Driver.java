package com.kodewala.streamAPI.class4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<String> out = Arrays.asList("Bangalore", "Delhi", "Dubai", "Hydrabad", "Bhopal", "Jaipur", "Patna",
				"Indore", "Noida", "Gurugram");
		
		//single threaded
		List<String> res = out.stream().filter(w -> w.startsWith("D")).collect(Collectors.toList());

		System.out.println(res);

		//multi threaded
		List<String> result = out.parallelStream().filter(w -> w.startsWith("D")).collect(Collectors.toList());

		System.out.println(result);
	}
}
