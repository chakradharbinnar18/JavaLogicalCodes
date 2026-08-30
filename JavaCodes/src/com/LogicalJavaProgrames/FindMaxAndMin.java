package com.LogicalJavaProgrames;

public class FindMaxAndMin {

	public static void main(String[] args) {
		
		int[] arr = {10, 5, 40, 2, 35};
		int max=0;
		int min=0;
		
		for(int i=1; i<arr.length; i++) {
			
			if (arr[i]< arr[min]) {
				min = i;
			}else if(arr[i] > arr[max]) {
				max=i;
			}	
		}
		
		System.out.println("Min = "+ arr[min]);
		System.out.println("Max = "+ arr[max]);
	}
}
