package com.Java8;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumber {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35);
		
		int sum = list.stream().filter(n->n%2==0).mapToInt(n->n).sum();
		
		System.out.println(sum);
	}

}
