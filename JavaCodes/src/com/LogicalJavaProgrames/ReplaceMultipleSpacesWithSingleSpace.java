package com.LogicalJavaProgrames;

import java.util.Arrays;
import java.util.Iterator;

public class ReplaceMultipleSpacesWithSingleSpace {
	
	public static void main(String[] args) {
		
		String name = "Java       is       easy";
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) != ' ') {
				sb.append(name.charAt(i));
			}else if(name.charAt(i) == ' ' && name.charAt(i+1)!=' ') {
				sb.append(' ');
			}
		}
		System.out.println(sb);
		
	}

}
