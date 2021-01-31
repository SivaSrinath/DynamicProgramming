package com.java8.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Java8First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listString = Arrays.asList("1","2","3","4","5","6","7");
		
		System.out.println(listString.stream()
				  .map(Integer::parseInt)
				  .reduce(Integer::sum));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,3,4,5);
		
		System.out.println(list.stream()
			.filter(e -> e%2 ==0)
			.map(e -> e*2)
			.collect(Collectors.toList()));
			
			
	}

}
