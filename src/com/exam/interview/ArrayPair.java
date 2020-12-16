package com.exam.interview;

public class ArrayPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Find the pair of two number which result is 78
		int[] arr = {2,49,45,80};
		
		int var ;
		
		int subVal = 78;
		
		for(int i=0; i<arr.length; i++) {
			
			var = arr[i];
			for(int j=0; j<arr.length; j++) {
				
				
				if(Math.subtractExact(arr[j], var) == subVal) {
					System.out.println("pair is : "+ arr[j] + " "+ var);
				}
			}
			//System.out.println("No such pair");
			
		}

	}

}
