package com.LogicalJavaProgrames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SelectionSort {
	
	 public static void main(String[] args) {

	        Integer[] arr = {2, 4, 5, 3, 1, 6};

	        arr = getSelectionSortArr(arr);

	        System.out.println(Arrays.toString(arr));
	    }

	    public static Integer[] getSelectionSortArr(Integer[] arr) {
	    	
	    	for(int i =0; i<arr.length; i++) {
	    		int min = i;
	    		for(int j=i+1; j<arr.length; j++) {
	    			
	    			if(arr[j]<arr[min]) {
	    				min =j;
	    			}
	    		}
	    		int temp= arr[i];
	    		arr[i] = arr[min];
	    		arr[min]  = temp;
	    	}
	    	
	    	return arr;

	    }
}
