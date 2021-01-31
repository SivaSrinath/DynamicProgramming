package com.exam.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListString {

	public static void main(String[] args) {
		// Given a list of string and return the string that starts with letter a
		
		List<String> listStr = Arrays.asList("apple", "ant", "elephant");

		//listStr.stream().anyMatch(a -> a.startsWith(a));
		listStr.stream().map(a -> a.startsWith("a"));
		System.out.println(listStr.stream()
									.filter(a -> a.startsWith("a"))
									.collect(Collectors.toList()));
		
		
	}

}
