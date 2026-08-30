package com.Java8;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {
	
	static int sum=0;
	
	public static void main(String[] args) {
		
		//1st approach
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		list.stream().forEach(num->{
			sum = sum+num;
		});
		System.out.println(sum);
		
		//1st approach
		int addition=list.stream().mapToInt(n->n).sum();
		System.out.println(addition);
		
		
	}

}
