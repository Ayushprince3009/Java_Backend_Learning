package com.kodewala.streamAPI.practice5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver6 {
	public static void main(String[] args) {
		List<String> logs = Arrays.asList(
				"[INFO] Application started successfully",
				"[ERROR] Database connection failed",
				"[WARN] Memory usage at 85%",
				"[DEBUG] Processing request #1234",
				"[ERROR] Null pointer in UserService",
				"[INFO] Request completed in 230ms",
				"[WARN] Disk space below 10GB",
				"[ERROR] Timeout waiting for response",
				"[INFO] User logged in: admin",
				"[DEBUG] Cache hit ratio: 94%"
				);
		
		List<String> output = logs.stream()
				.filter(log -> log.startsWith("[ERROR]") || log.startsWith("[WARN]"))
				.collect(Collectors.toList());
		
		System.out.println(output);
	}
}
