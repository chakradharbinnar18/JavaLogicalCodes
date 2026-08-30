package com.Java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SumOfNestedList {
	
	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6),
				Arrays.asList(7,8,9)
				);
		
		int sum = list.stream().flatMap(Collection::stream).mapToInt(n->n).sum();
		
		System.out.println(sum);
	}

}
