package com.Java8;

import java.util.Arrays;
import java.util.List;

public class FindNumberWhoesSquareGreaterThen100 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 10, 11, 12, 15);
		
		list.stream().filter(n->n*n>100).forEach(System.out::println);
		
	}

}
