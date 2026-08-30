package com.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartionEmpBySal {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", "IT", 70000),
				new Employee(2, "Rahul", "HR", 50000), new Employee(3, "Priya", "IT", 90000),
				new Employee(4, "Neha", "Finance", 80000), new Employee(5, "Raj", "IT", 60000));

			Map<Boolean, List<Employee>> map=employees.stream().collect(Collectors.partitioningBy(e->e.getSalary()>60000));
		
			System.out.println(map);
	}

}
