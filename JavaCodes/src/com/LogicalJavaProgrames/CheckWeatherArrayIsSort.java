package com.LogicalJavaProgrames;

import java.util.Iterator;

public class CheckWeatherArrayIsSort {
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 40, 50, 100};
		
		boolean result  = isArraySort(arr);
		
		if(result) {
			System.out.println("Array is sorted...!");
		}else {
			System.out.println("Array is not sorted...!");	
		}
	}
	
	public static boolean isArraySort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if (arr[i] > arr[i+1]) {
				return false; 
			}
			
		}
		
		return true;
		
	}
	

}
