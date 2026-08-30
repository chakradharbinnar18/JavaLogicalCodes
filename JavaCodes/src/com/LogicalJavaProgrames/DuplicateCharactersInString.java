package com.LogicalJavaProgrames;

import java.util.Set;
import java.util.LinkedHashSet;

public class DuplicateCharactersInString {
	
	public static void main(String[] args) {
		
		String name = "programming";
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<name.length(); i++) {
			
			if(!set.add(name.charAt(i))) {
				System.out.println(name.charAt(i));
			}
		}
	}
}
