package com.LogicalJavaProgrames;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		String name = "Java is easy";
		StringBuffer sb = new StringBuffer();
		String[] nameArr = name.split(" ");
		
		for(String word : nameArr) {
			
			for(int i=word.length()-1; i>=0; i--) {
				sb.append(word.charAt(i));
			}
			sb.append(" ");
			
		}
		
		System.out.println(sb);
		
	}

}
