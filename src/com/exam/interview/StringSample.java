package com.exam.interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSample {

	public static void main(String[] args) {
		// Find the first letter starts with letter a
		
		
		List<String> list = Arrays.asList("apple", "ant", "elephant");
		
		System.out.println(list.stream()
			.filter(e -> e.startsWith("a"))
			.findFirst()
			.orElse("")
			//.collect(Collectors.toList()
					);

	}

}
