package com.Java8;

import java.util.*;

public class AverageOfList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		double avg = list.stream().mapToInt(i->i).average().getAsDouble();

//Or 

double avg = list.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0.0);
		
		System.out.println(avg);
	}

}
