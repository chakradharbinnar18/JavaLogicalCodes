package com.Java8;

import java.util.Arrays;
import java.util.List;

public class CheckIfAnyEmployeeBelongsToIT {
	
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", "IT", 70000),
				new Employee(2, "Rahul", "HR", 50000), new Employee(3, "Priya", "IT", 90000),
				new Employee(4, "Neha", "Finance", 80000), new Employee(5, "Raj", "IT", 60000));
		
		boolean result= employees.stream().anyMatch(e->e.getDepartment().equals("IT"));
		
		System.out.println(result);
	}

}
