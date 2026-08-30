package com.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//name start with A
public class FindNameStartWith {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Amit", "Rahul", "Anil", "Raj", "Ajay");
		names = names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
		System.out.println(names);
		
		//or
		
	}

}
