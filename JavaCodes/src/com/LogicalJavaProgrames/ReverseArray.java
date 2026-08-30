package com.LogicalJavaProgrames;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		//we want to make descending order array
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
		int left=0;
		int right=arr.length-1;
		
		for(int i=0;i<arr.length/2; i++) {
			
			if(arr[left]<arr[right]) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
			left++;
			right--;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
