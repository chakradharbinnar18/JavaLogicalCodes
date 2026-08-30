package com.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringUsingComma {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Spring", "Hibernate");
		
		String str = names.stream().collect(Collectors.joining(","));
		System.out.println(str);
	}

}
