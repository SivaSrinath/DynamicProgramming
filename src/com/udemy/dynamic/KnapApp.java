package com.udemy.dynamic;

public class KnapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfItems = 3;
		int capacityOfKnapsack = 5;
		
		int[] weightOfItem = new int[numberOfItems+1];
		weightOfItem[1]=4;
		weightOfItem[2]=2;
		weightOfItem[3]=3;
				
		int[] valueOfItem = new int[numberOfItems+1];
		valueOfItem[1]=10;
		valueOfItem[2]=4;
		valueOfItem[3]=7;
		
		Knapsack knapsack = new Knapsack(numberOfItems, capacityOfKnapsack, weightOfItem, valueOfItem);
		
		knapsack.solve();
		knapsack.showResult();

	}
}
