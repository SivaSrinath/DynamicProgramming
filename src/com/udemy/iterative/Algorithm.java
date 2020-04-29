package com.udemy.iterative;

public class Algorithm {

	public int sumIterative(int a) {
		
		int result = 0;
		
		for (int i =1; i<=a; i++) {
			result = result + i;
		}
		return result;
	}
	
	public int sumRecursive(int a) {
		
		if (a == 1) return 1; // base statement
		
		return a + sumRecursive(a - 1);
	}
	
	//House Building Problem
	public void buildHeight(int a) {
		
		if(a == 0) return;
		
		buildHeight(a-1);
		System.out.println(a);
		
	}
	
	//stack if a = 3
	// builtheight(2)
	//buildHeight(1)
	
	// Factorial Example
	
	public int factorial(int a) {
		
		if(a ==1)
			return 1;
		
		return a*factorial(a-1);
	}
	
	public int factorial(int accumulator, int a) {
		
		if(a ==1) return accumulator;
		
		return factorial(accumulator*a, a-1);
	}
	
	public int calculateFactorial(int n) {
		return factorial(1, n);
	}

	/*
	 * stack
	 * 
	 * factorial(120,1) factorial(60,2) factorial(20,3) factorial(5,4)
	 */
	//Euclidean algorithm --> gcd of two numbers
	
	public int gcdIterative(int num1, int num2) {
		
		while(num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		
		return num1;
	}
	
	public int gcdRecursive(int num1, int num2) {
		
		if(num2 == 0) return num1;
		
		return gcdRecursive(num2, num1%num2);
	}
	
	
}
