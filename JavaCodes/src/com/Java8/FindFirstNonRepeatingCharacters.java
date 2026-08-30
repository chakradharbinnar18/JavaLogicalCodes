package com.Java8;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacters {
	
	public static void main(String[] args) {
		String name = "chakradhar";
		
		name.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()==1).findFirst().ifPresent(e->System.out.println(e));
	}
}
