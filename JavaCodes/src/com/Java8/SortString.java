package com.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Spring", "Java", "Hibernate", "SQL");
		
		list = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
	}

}
