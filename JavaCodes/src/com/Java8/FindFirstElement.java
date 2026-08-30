package com.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindFirstElement {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(20, 10, 15, 40);
		int firstNum = list.stream().findFirst().get();
		System.out.println(firstNum);
		
	}

}
