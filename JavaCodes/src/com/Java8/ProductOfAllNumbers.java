package com.Java8;

import java.util.Arrays;
import java.util.List;

public class ProductOfAllNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 3, 4, 5);
		
		int product=list.stream().reduce(1, (a,b)->a*b);
		System.out.println(product);
	}

}
