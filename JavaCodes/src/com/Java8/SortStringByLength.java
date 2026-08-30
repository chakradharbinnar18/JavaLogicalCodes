package com.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringByLength	 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java", "Spring", "SQL", "Hibernate");
		
		list=list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		
		System.out.println(list);
	}

}
