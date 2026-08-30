package com.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindShortestString {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Spring", "Hibernate", "SQL");
		names.stream().min(Comparator.comparing(String::length)).ifPresent(System.out::print);
	}

}
