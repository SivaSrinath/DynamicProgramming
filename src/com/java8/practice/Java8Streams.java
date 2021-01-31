package com.java8.practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("****takeWhile Ordered test*******");
		Stream<Integer> intStreamOrdered = Stream.of(1,2,3,4,5,6,7,8);
		
		intStreamOrdered
			.takeWhile(x -> x<4)
			.forEach(a -> System.out.println(a));
		System.out.println("****takeWhile UnOrdered test*******");
		
		Stream<Integer> intStreamUnordered = Stream.of(1,4,2,3,4,5,6,7,8);
		
		intStreamUnordered.takeWhile(x -> x<5)
						  .forEach(a -> System.out.println(a));
		
		System.out.println("****dropWhile Ordered test*******");
		
		Stream<Integer> intDropOrdered = Stream.of(1,2,3,4,5,6,7,8);
		
		intDropOrdered.dropWhile(x -> x<4)
						.forEach(a -> System.out.println(a));
		
		System.out.println("****dropWhile unOrdered test*******");
		
		Stream<Integer> intDropUnordered = Stream.of(1,2,4,3,5,6,7,8);
		
		intDropUnordered.dropWhile(x ->x<4)
						.forEach(a -> System.out.println(a));
		
		System.out.println("****intstream test java 9*******");
		
		IntStream.iterate(2, x-> x<20, a->a*2).forEach(System.out::println);
		
		System.out.println("****intstream test java 8*******");
		
		//IntStream.iterate(2, x -> x*x)
			//	 .filter(x -> x<20).forEach(System.out::println);
		
		IntStream.iterate(2, x -> x * x).filter(x -> x < 20).forEach(System.out::println);

	}

}
