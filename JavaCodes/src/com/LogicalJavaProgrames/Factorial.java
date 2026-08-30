package com.LogicalJavaProgrames;

public class Factorial {
	
	public static void main(String[] args) {
		
		int factorial = getFactorial(5);
		
		System.out.println("factorial :"+ factorial);
		
	}
	
	public static int getFactorial(int num) {
		
		int factorial = 1;
		
		while (num>0) {
			factorial = factorial*num;
			num--;
		}
		
		return factorial;
		
		
	}

}
