package com.LogicalJavaProgrames;

public class GreatestCommonDivisor {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b=30;
		
		while(b !=0) {
			int rem = a%b;
			a=b;
			b=rem;
		}
		System.out.println("Greatest Common Divisor is : "+a);
		
	}

}
