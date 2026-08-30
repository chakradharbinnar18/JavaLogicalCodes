package com.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateEmployeeNames {
	
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", "IT", 70000),
				new Employee(2, "Rahul", "HR", 50000), new Employee(3, "Priya", "IT", 90000),
				new Employee(4, "Neha", "Finance", 80000), new Employee(5, "Raj", "IT", 60000),
				 new Employee(5, "Rahul", "IT", 65000));
		
		employees.stream().
		collect(Collectors.groupingBy(Employee::getName, Collectors.counting())).
		entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::print);
	}

}
