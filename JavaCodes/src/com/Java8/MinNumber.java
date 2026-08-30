package com.Java8;

import java.util.Arrays;
import java.util.List;

public class MinNumber {
	
	public static void main(String[] args) {
	
		//1st approach
		List<Integer> list1 = Arrays.asList(4,5,8,7,2,3,9);
		int min1 = list1.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println(min1);
		
		//2nd approach
		List<Integer> list2 = Arrays.asList(4,5,8,7,2,3,9);
		int min2 = list2.stream().min(Integer::compareTo).get();
		
		System.out.println(min2);
		
		
	}

}
