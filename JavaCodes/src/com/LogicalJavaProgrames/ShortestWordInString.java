package com.LogicalJavaProgrames;

public class ShortestWordInString {
	
	public static void main(String[] args) {
		
		String str = "chakradhar dattatray punja binnar";
		
		String[] strArr=str.split(" ");
		
		int smallLength = 0;
		
		for(int i=1; i<strArr.length; i++) {
			
			if(strArr[i].length() < strArr[smallLength].length()) {
				
				smallLength = i;
			}
			
		}
		
		System.out.println(strArr[smallLength]);
		
	}

}
