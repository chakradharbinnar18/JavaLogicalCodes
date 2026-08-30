package com.LogicalJavaProgrames;

import java.util.Iterator;

public class FebbonacciSeries {
	
	public static void main(String[] args) {
		
		getFebbonacciSeries(10);
		
	}
	
	public static void getFebbonacciSeries(int num) {
		
		int first = 0;
		int second = 1;
		System.out.print(first+", ");
		System.out.print(second+", ");
		
		for(int i=1; i<num-1; i++) {
			int thirt = first+second;
			System.out.print(thirt+", ");
			first=second;
			second=thirt;
			
		}
		
	}

}
