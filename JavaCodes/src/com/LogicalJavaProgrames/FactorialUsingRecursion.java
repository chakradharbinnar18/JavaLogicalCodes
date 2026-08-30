package com.LogicalJavaProgrames;

public class FactorialUsingRecursion {
	
	public static void main(String[] args) {
		
		int facto = factorial(5);
		
		System.out.println("Factorial : "+facto);
		
	}
	public static int factorial(int num) {
		
		if(num==1) {
			return 1;
		}
		
		return num * factorial(num-1);
	}

}
