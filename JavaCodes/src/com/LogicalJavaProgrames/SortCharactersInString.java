package com.LogicalJavaProgrames;

import java.util.Arrays;

public class SortCharactersInString {
	
	//without using sort method
	public static void main(String[] args) {
		String name = "chakradhar";
		char[] charArr=name.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			for(int j=0; j<charArr.length-i-1; j++) {
				
				if(charArr[j]> charArr[j+1]) {
					char temp = charArr[j];
					 charArr[j] =  charArr[j+1];
					 charArr[j+1] = temp;
				}
				
			}
		}
		
		System.out.println(charArr);
	}

}
