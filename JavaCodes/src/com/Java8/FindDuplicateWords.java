package com.Java8;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateWords {
	
	public static void main(String[] args) {
		
		//1st approatch
		List<String> words = Arrays.asList("java", "spring", "java", "sql", "spring");
		
		Set<String> set = new LinkedHashSet<>();
		words.stream().forEach(w->{
			if(!set.add(w)) {
				System.out.println(w);
			}
		});
		
		
		//2nd approatch
		words.stream().collect(Collectors.groupingBy(w->w, Collectors.counting()))
		.entrySet().stream().filter(e -> e.getValue()>1).forEach(System.out::print);;
		
	}

}
