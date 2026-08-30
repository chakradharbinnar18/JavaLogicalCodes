package com.Java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumberFromNestedList {
	public static void main(String[] args) {
		
		List<List<Integer>> list = Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(2,3,4),
				Arrays.asList(4,5,6),
				Arrays.asList(5,7,8,9)
				);
		
		List<Integer> newList=list.stream().flatMap(Collection::stream).distinct().collect(Collectors.toList());
	System.out.println(newList);
	}

}
