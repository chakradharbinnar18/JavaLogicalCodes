package com.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class EvenNumber {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35);
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		System.out.println("==========");
		
		list = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("==========");
		
		Integer[] arr = {10, 15, 20, 25, 30, 35};
		List<Integer> result = Arrays.stream(arr).filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(result);
		
		
	}

}
