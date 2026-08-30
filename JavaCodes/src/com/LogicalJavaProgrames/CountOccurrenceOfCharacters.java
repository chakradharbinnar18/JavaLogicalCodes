package com.LogicalJavaProgrames;

import java.util.Map;
import java.util.HashMap;

public class CountOccurrenceOfCharacters {
	
	public static void main(String[] args) {
		
		String name = "aabbc";
		char[] charArr=name.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<charArr.length; i++) {
			
			if (map.containsKey(charArr[i])) {
				
				map.put(charArr[i], map.get(charArr[i])+1);
				
			}else {
				map.put(charArr[i], 1);
				
			}
		}
		
		map.forEach((key, value)->{
			System.out.println(key+" = "+ value);
		});
	}

}
