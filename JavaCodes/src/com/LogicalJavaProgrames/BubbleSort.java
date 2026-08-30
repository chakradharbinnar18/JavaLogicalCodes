package com.LogicalJavaProgrames;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {4, 6, 2, 3, 1, 5, 8, 7, 9};
		
		arr = getBubbleSorting(arr);
		
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int[] getBubbleSorting(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
		
	}

}
