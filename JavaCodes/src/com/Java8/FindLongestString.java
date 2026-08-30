package com.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Spring", "Hibernate", "SQL");
		
		 names.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::print);

	}

}
