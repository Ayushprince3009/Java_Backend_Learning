package com.kodewala.streamAPI.class3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver1 {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2,4,7,6,4,3,2,3,54,56,6,5,4,32,25,
				4,44,123,34,4,2,33,5,6,52,321,434,634,
				42,4,546,55,4,4,634,423,5,234);
		
		Map<Boolean, List<Integer>> collect = num.stream().collect(Collectors.partitioningBy(n -> !(n % 2 == 0)));
		System.out.println(collect);
		System.out.println("---------");
		Map<Boolean, List<Integer>> collect1 = num.stream().collect(Collectors.partitioningBy(n -> (n % 7 == 0)));
		System.out.println(collect1);
	}
}
