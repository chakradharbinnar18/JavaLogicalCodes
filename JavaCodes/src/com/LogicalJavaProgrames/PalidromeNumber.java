package com.LogicalJavaProgrames;

public class PalidromeNumber {
	
	public static void main(String[] args) {
		
		int num = 12345431;
		int rev = reverse(num);
		
		if (num==rev) {
			System.out.println("The number: "+num +" is palidrome");
		}else {
			System.out.println("The number: "+num +" is not palidrome");
		}
	}
	
	public static int reverse(int num) {
		
		int rev = 0;
		
		while(num > 0) {
			int rem = num % 10;
			rev = rev*10+rem;
			num = num/10;
		}
		
		return rev;
	}

}
