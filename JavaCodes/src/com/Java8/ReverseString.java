package com.Java8;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "Java";
		
		String reverse = new StringBuffer(str).reverse().toString();	
		System.out.println(reverse);
	}

}
