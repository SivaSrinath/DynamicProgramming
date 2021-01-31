package com.java8.practice;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaOptional {

	public static void main(String[] args) {
		System.out.println(division(2,4));
		System.out.println(division(2,0));
		
		Optional<Integer> opt1 = division(2,4);
		opt1.ifPresent( x -> System.out.println("Optional 1 result found " + x));
		
		Optional<Integer> opt2 = division(2,0);
		opt2.ifPresent(x -> System.out.println("Optional 2 result found " + x));
		System.out.println("Result not found, Default value is "+opt2.orElse(new Integer(0)));
		
		Optional<Integer> opt3 = division(10,0);
		opt3.ifPresentOrElse(x -> System.out.println("Optional 3 result found " + x), 
				() -> System.out.println("Not found"));
		
		System.out.println("**************** optional or ***************");
		
		//Predicate<T>
		Optional<String> optStr = Optional.of("Srinath");
		//Optional<String> optStr = Optional.empty();
		
		System.out.println("Optional String "+ optStr);
		
		Supplier<Optional<String>> supStr = () -> Optional.of("Sahithi");
		
		System.out.println(optStr.or(supStr));
		
	}

	public static Optional<Integer> division(Integer i1, Integer i2){
		
		if(i2 == 0) return Optional.empty();
		else {
			Integer i3 = i2/i1;
			return Optional.of(i3);
		}
	}
	
}
