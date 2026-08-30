package com.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfEachWord {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("java", "spring", "java", "sql", "spring");
		
		Map<String, Long> map=words.stream().collect(Collectors.groupingBy(w->w, Collectors.counting()));
		System.out.println(map);
	}

}
