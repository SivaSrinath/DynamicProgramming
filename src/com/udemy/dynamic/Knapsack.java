package com.udemy.dynamic;

public class Knapsack {
	
	private int noOfItems;
	private int capacityOfKnapsack;
	private int[][] knapsackTable;
	private int totalBenefit;
	private int[] weights;
	private int[] values;
	
	Knapsack(int noOfItems, int capacityOfKnapsack, int[] weights, int[] values) {
		this.noOfItems = noOfItems;
		this.capacityOfKnapsack = capacityOfKnapsack;
		this.weights = weights;
		this.values = values;
		this.knapsackTable = new int[noOfItems+1][capacityOfKnapsack+1];
	}
	
	public void solve() {
		
		for(int i =1; i<noOfItems+1; i++) {
			for(int w=1; w<capacityOfKnapsack+1; w++) {
				
				int notTakingInputs = knapsackTable[i-1][w];
				
				int takingInputs=0;
				
				if(weights[i]<=w) {
					takingInputs = values[i] + knapsackTable[i-1][w-weights[i]];
				}
				knapsackTable[i][w] = Math.max(notTakingInputs, takingInputs);
			}
		}
		totalBenefit = knapsackTable[noOfItems][capacityOfKnapsack];
	}
	
	public void showResult() {
		System.out.println("Total Benefit :"+ totalBenefit);
		
		for(int n=noOfItems, w=capacityOfKnapsack; n>0; n--) {
			if(knapsackTable[n][w] != 0 && knapsackTable[n][w] != knapsackTable[n-1][w]) {
				System.out.println("we take the item :"+ n);
				w = w - weights[n];
			}
		}
	}

}
