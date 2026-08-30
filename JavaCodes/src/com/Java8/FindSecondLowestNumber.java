package com.Java8;

import java.util.Arrays;
import java.util.List;

public class FindSecondLowestNumber {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 50, 30, 80, 60);
		int secondLowest = list.stream().sorted().skip(1).findFirst().get();
		
		System.out.println(secondLowest);
	}
	
	

}
