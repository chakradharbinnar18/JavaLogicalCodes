package com.LogicalJavaProgrames;

import java.util.Arrays;
import java.util.Iterator;

public class FindLongestString {
	
	public static void main(String[] args) {
		
		String name = "chaskj askdjfk aksdjf askdjfkasjkdfklj askdj sjkaf  askdjfkasjkdfkljs";
		
		String[] arr = name.split(" ");
		String longestString = getLongestString(arr);
		System.out.println(longestString);
		
	}
	public static String getLongestString(String[] arr) {
		int max=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length()>arr[max].length()) {
				max=i;
			}
		}
		
		return arr[max];
		
	}

}
