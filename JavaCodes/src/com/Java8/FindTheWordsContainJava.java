package com.Java8;

import java.util.Arrays;
import java.util.List;

public class FindTheWordsContainJava {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java", "javascript", "spring", "hibernate");
		
		list.stream().filter(w->w.toLowerCase().contains("java")).forEach(System.out::println);
	}

}
