package com.Java8;

import java.util.Arrays;
import java.util.List;

public class CountNumbersGreaterThen {
	
	static int count=0;
	//Counts Numbers Greater Then 50
	public static void main(String[] args) {
		
		//1st approatch
		List<Integer> list = Arrays.asList(10, 60, 70, 20, 80, 30);
		list.stream().forEach(n->{
			if(n>50) {
				count++;
			}
		});
		System.out.println(count);
		
		//2nd approatch
		long count2 = list.stream().filter(i->i>50).count();
		System.out.println(count2);
	}

}
