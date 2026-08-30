package com.LogicalJavaProgrames;

import java.util.Iterator;

public class LargestElementInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 45, 23, 78, 12};
		
		int largestElement=0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[largestElement]) {
				largestElement=i;
			}
		}
		
		System.out.println("Largest element is : "+arr[largestElement]);
	}

}
