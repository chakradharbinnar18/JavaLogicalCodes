package com.Java8;
import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElementInList { 
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40, 50, 30);
		Set<Integer> set = new LinkedHashSet<>();
		list = list.stream().filter(n->!set.add(n)).collect(Collectors.toList());
		System.out.println("duplicate list : "+list);
	}

}
