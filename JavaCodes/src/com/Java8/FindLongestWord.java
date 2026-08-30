package com.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestWord {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Spring", "SQL", "Hibernate");
		
		String longestWord = list.stream().max(Comparator.comparing(String::length)).get();
		
		System.out.println(longestWord);
	}

}
