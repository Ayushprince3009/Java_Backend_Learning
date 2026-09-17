package com.kodewala.streamAPI.practice5;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Driver3 {
	public static void main(String[] args) {
		List<String> rawData = Arrays.asList(
				"hello", null, "world", null, null, "java",
				"stream", null, "api", "lambda", null, "filter"
				);

		List<String> output = rawData.stream()
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
		System.out.println(output);
	}
}
