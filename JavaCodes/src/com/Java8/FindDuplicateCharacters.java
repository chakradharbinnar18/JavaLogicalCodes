package com.Java8;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharacters {
	
	public static void main(String[] args) {
		String str = "programming"; 
		Set<Character> set = new HashSet<>();
		
		str.chars().mapToObj(c->(char)c).filter(c->!set.add(c)).distinct().forEach(System.out::println);
		
	}

}
