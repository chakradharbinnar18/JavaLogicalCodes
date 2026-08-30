package com.Java8;

import java.util.stream.Collectors;

public class CheckStringAnagram {
	
	public static void main(String[] args) {
		String str1 = "abcde"; 
		String str2 = "eabdc";
		
		str1 = str1.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		str2 = str2.chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		
		if (str1.equals(str2)) {
			System.out.println("String is anagram!");
		}else {
			System.out.println("String is not anagram!");
		}
	}

}
