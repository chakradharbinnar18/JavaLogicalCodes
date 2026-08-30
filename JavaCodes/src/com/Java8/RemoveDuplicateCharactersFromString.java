package com.Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharactersFromString {
	public static void main(String[] args) {
		String name = "chakradhar";
		//firstApproach
		String newName = name.chars().mapToObj(c->String.valueOf((char) c)).collect(Collectors.joining());
		System.out.println(newName);
		
	}

}
