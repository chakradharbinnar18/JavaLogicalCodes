package com.LogicalJavaProgrames;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int num = 23;
		
		boolean primeNumber = checkIsPrimeNumber(num);
		
		if (primeNumber) {
			System.out.println("Your number: "+num +" is prime number");
		}else {
			System.out.println("Your number: "+num +" is not prime number");
		}
		
	}
	
	public static boolean checkIsPrimeNumber(int num) {
		
		if (num<=1) {
			return false;
		}else {
			for(int i=2; i<=num/2; i++) {
				if (num%i==0) {
					return false;
				}
			}
			return true;
		}
		
	}

}
