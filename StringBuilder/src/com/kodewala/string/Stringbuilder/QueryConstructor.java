package com.kodewala.string.Stringbuilder;

public class QueryConstructor {
	
	public static String Query = "select * from employee";
	
	public String constructQuery(String empId, int salary) {
		StringBuilder finalQuery = new StringBuilder(Query);
		if(empId != null) {
			finalQuery.append(" where empId ="+ empId);
		}else if(salary >0) {
			finalQuery.append(" where salary > "+ salary);
		}
		finalQuery.append(";");
		return finalQuery.toString();
	}
}
