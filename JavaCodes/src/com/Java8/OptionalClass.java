package com.Java8;

import java.util.Optional;

public class OptionalClass {
	
	public static void main(String[] args) {
		String name = null;
		
		Optional<String> optional = Optional.ofNullable(name);
		System.out.println(optional.orElse("chakradhar"));
		
		Optional<String> name1 = Optional.of("chikku");
		if(name1.isPresent()) {
			System.out.println(name1.get());
		}else {
			System.out.println(name1.orElse("default"));
		}
	}

}
