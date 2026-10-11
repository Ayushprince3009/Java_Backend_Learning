package com.kodewala.count;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class ApiRequest {
    int id;
    String service;
    int statusCode;
    int responseMs;
    List<String> endpoints;

    ApiRequest(int id, String service, int statusCode,
               int responseMs, List<String> endpoints) {
        this.id = id;
        this.service = service;
        this.statusCode = statusCode;
        this.responseMs = responseMs;
        this.endpoints = endpoints;
    }
}
public class Q7 {
	public static void main(String[] args) {
		List<ApiRequest> requests = Arrays.asList(
			    new ApiRequest(801, "OrderService", 200, 120,
			        Arrays.asList("/orders", "/orders/{id}")),
			    new ApiRequest(802, "PaymentService", 500, 800,
			        Arrays.asList("/payments", "/payments/{id}")),
			    new ApiRequest(803, "OrderService", 200, 650,
			        Arrays.asList("/orders", "/checkout")),
			    new ApiRequest(804, "UserService", 200, 90,
			        Arrays.asList("/users", "/users/{id}")),
			    new ApiRequest(805, "PaymentService", 200, 420,
			        Arrays.asList("/payments", "/checkout")),
			    new ApiRequest(806, "InventoryService", 200, 700,
			        Arrays.asList("/inventory", "/inventory/{id}")),
			    new ApiRequest(807, "UserService", 503, 900,
			        Arrays.asList("/users", "/login")),
			    new ApiRequest(808, "InventoryService", 200, 300,
			        Arrays.asList("/inventory", "/checkout"))
			);
		
		Optional<String> result = requests.stream()
				.filter(req -> req.statusCode >= 200 && req.statusCode <= 299 && req.responseMs <= 500)
				.map(req -> req.service)
				.distinct()
				.sorted()
				.findFirst();
		System.out.println(result);
		
		long count = requests.stream()
				.filter(req -> req.statusCode >= 200 && req.statusCode <= 299)
				.filter(req -> req.responseMs >= 400)
				.flatMap(req -> req.endpoints.stream())
				.distinct()
				.sorted()
				.filter(req -> req.length() >= 9)
				.count();
		System.out.println(count);
				
	}
}
