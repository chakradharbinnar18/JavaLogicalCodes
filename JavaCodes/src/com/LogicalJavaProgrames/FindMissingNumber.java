package com.LogicalJavaProgrames;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 5};
		
		int n=5;
		
		int expectedSum = n*(n+1)/2;
		int actualSum =0; 
		System.out.println(expectedSum);
		
		for(int i=0; i<arr.length; i++) {
			actualSum = actualSum+arr[i];
		}
		
		System.out.println("Missing element is : "+(expectedSum-actualSum));
	}


}
