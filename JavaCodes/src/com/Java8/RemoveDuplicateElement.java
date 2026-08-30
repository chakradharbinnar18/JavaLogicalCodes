package com.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40);
		
		list = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(list);
	}

}
