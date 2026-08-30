package com.Java8;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
	
	public static void main(String[] args) {
		
		
		//1st approach
		List<Integer> list = Arrays.asList(10, 50, 20, 80, 30);
		int max  = list.stream().max(Integer::compareTo).get();
		System.out.println(max);
		
		//2nd approach
		int newMax = list.stream().max((a, b)->a.compareTo(b)).get();
		System.out.println(newMax);
	}

}
