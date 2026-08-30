package com.LogicalJavaProgrames;

public class LowerCaseToUpperCase {
	
	//convert string lower case to upper case
	public static void main(String[] args) {
		
		String name = "chakradhar";
		char[] chArr=name.toCharArray();
		
		StringBuffer sb =new StringBuffer();
		
		for(int i=0; i<chArr.length; i++) {
			
			sb.append((char)(chArr[i]-32));
		}
		System.out.println(sb);
	}	

}
