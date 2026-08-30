package com.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpCountEachDepartment {
	
	public static void main(String[] args) {
		
		
		List<Employee> listEmp = Arrays.asList( 
				new Employee(1, "Amit", "IT", 70000), 
				new Employee(2, "Rahul", "HR", 50000), 
				new Employee(3, "Priya", "IT", 90000), 
				new Employee(4, "Neha", "Finance", 80000), 
				new Employee(5, "Raj", "IT", 60000)
				);
		
		Map<String, Long> map = listEmp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		System.out.println(map);
	}

}
