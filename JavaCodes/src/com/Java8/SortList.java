package com.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class SortList {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(50, 10, 40, 20, 30);
		
		list = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
	}

}
