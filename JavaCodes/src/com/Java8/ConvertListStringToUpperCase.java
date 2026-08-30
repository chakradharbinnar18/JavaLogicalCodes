package com.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListStringToUpperCase {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("java", "spring", "hibernate");
		
		names = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(names);
	}

}
