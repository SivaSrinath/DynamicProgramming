package com.udemy.iterative;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Algorithm algorithm = new Algorithm();
		
		
		/*
		 * System.out.println("Iteration Result :"+algorithm.sumIterative(5));
		 * 
		 * System.out.println("Recursion Result :"+algorithm.sumRecursive(5));
		 * 
		 * algorithm.buildHeight(5);
		 */
		 
		//System.out.println("fabinocci - without accumulator :"+algorithm.factorial(5));
		
		//System.out.println("fabinocci - with accumulator :"+algorithm.calculateFactorial(5));
		
		/*
		 * System.out.println("GCD of two integers iteration :"+
		 * algorithm.gcdIterative(20, 30));
		 * 
		 * System.out.println("GCD of two integers recursive :"+
		 * algorithm.gcdRecursive(20, 30));
		 */
		
		/*
		 * int[] array = {1,15,30,100,200}; SearchAlgorithm SearchAlgorithm = new
		 * SearchAlgorithm(array);
		 * 
		 * //System.out.println(SearchAlgorithm.linearSearch(3));
		 * 
		 * System.out.println(SearchAlgorithm.binarySearch(200));
		 */
		
		TowerOfHonoi towerOfHonoi = new TowerOfHonoi();
		towerOfHonoi.towerOfho(3, "A", "B", "C");
		
		
		
	}

}
