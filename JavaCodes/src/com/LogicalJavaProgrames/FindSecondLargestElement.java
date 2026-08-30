package com.LogicalJavaProgrames;

import java.util.Iterator;

public class FindSecondLargestElement {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 78, 45, 23,  12};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondLargest && arr[i]!=largest){
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);
	}
}
