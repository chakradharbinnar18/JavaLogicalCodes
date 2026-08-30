package com.Java8;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfEachCharacters {
	
	public static void main(String[] args) {
		String name = "banana";
		
		Map<Character, Long> map=name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
	
		System.out.println(map);
	}

}
