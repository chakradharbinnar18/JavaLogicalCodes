package com.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestElement {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 50, 30, 80, 60);
		int secondHighest=list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(secondHighest);
	}

}
