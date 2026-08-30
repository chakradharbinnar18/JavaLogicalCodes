package com.Java8;

import java.util.Arrays;
import java.util.List;

public class EmpSalaryGreaterThanAvgSal {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", "IT", 70000),
				new Employee(2, "Rahul", "HR", 50000), new Employee(3, "Priya", "IT", 90000),
				new Employee(4, "Neha", "Finance", 80000), new Employee(5, "Raj", "IT", 60000));
		
		double avgSal = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		System.out.println("avgSal : "+avgSal);
		
		employees.stream().filter(e->e.getSalary()>avgSal).forEach(System.out::println);
		
	}

}
