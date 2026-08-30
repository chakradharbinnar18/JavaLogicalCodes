package com.Java8;

import java.util.Arrays;
import java.util.List;

//Find numbers starting with digit 1
public class FindNumberStartWith {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 15, 20, 25, 100, 35, 150);
		
		list.stream().filter(n->String.valueOf(n).startsWith("1")).forEach(System.out::println);
		
	}

}
