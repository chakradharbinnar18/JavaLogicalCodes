package com.Java8;

import java.util.Arrays;
import java.util.List;

//Find employees having salary greater than 70,000
public class FindTheEmployeeSalaryGreaterThenNumber {
	
	public static void main(String[] args) {
		
		List<Employee> listEmp = Arrays.asList( 
				new Employee(1, "Amit", "IT", 70000), 
				new Employee(2, "Rahul", "HR", 50000), 
				new Employee(3, "Priya", "IT", 90000), 
				new Employee(4, "Neha", "Finance", 80000), 
				new Employee(5, "Raj", "IT", 60000) 
				);		
		
		listEmp.stream().filter(e->e.getSalary()>70000).forEach(e->System.out.println(e.getName()));
	
	}

}
