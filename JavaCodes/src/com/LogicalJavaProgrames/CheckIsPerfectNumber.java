package com.LogicalJavaProgrames;

//A number is perfect if the sum of its proper divisors equals the number.
public class CheckIsPerfectNumber {
	
	public static void main(String[] args) {
		
		  int number = 7;
	        int sum = 0;
	        
	        for (int i = 1; i <= number/2; i++) {
				
	        	if(number%i==0) {
	        		sum = sum+i;
	        	}
			}
	        
	        if(sum == number) {
	        	System.out.println(number+" is a perfect number");
	        }else {
	        	System.out.println(number+" is not perfect number");
	        }
		
	}	
}
