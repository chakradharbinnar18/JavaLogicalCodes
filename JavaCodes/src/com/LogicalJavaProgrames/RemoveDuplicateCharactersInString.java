package com.LogicalJavaProgrames;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharactersInString {
	
	public static void main(String[] args) {
		
		String name = "Chakradhar";
		Set<Character> set = new LinkedHashSet<Character>();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<name.length(); i++) {
			
			if(set.add(name.charAt(i))) {
				sb.append(name.charAt(i));
			}
			
		}
		
		System.out.println(sb);
		
	}

}
