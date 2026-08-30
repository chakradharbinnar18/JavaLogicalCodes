package com.LogicalJavaProgrames;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {
	public static void main(String[] args) {
		
		 int[] arr = {1, 2, 3, 2, 4, 3};
		 
		 for(int i=0; i<arr.length; i++) {
			 for(int j=i+1; j<arr.length; j++) {
				 if(arr[i]==arr[j]) {
					 System.out.println(arr[i]);
				 }
			 }
		 }
		 
		 System.out.println("==============================");
		 
		 //========== or ========== 
		 
		 Set<Integer> set = new HashSet<>();
		 for(int i =0; i<arr.length; i++) {
			 if(!set.add(arr[i])) {
				System.out.println(arr[i]); 
			 }
		 }
	}

}
