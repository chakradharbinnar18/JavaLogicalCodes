package com.Java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDescending {

	public static void main(String[] args) {
		//using java8
		List<Integer> list = Arrays.asList(50, 10, 40, 20, 30);
		list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		
		//direct sort
		List<Integer> newList = Arrays.asList(50, 10, 40, 20, 30);
		Collections.sort(newList, Comparator.reverseOrder());
		System.out.println(newList);
		
	}
	
}
