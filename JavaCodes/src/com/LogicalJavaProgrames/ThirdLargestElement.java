package com.LogicalJavaProgrames;

public class ThirdLargestElement {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 23, 78, 18, 45, 12};
		
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]> firstLargest) {
				
				thirdLargest = secondLargest;
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}else if (arr[i]>secondLargest && arr[i] != firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			}else if(arr[i]>thirdLargest && arr[i] != thirdLargest) {
				thirdLargest = arr[i];
			}
			
		}
		
		System.out.println(thirdLargest);
		
	}

}
