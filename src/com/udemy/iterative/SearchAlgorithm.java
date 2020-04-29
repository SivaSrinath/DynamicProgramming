package com.udemy.iterative;

public class SearchAlgorithm {
	
	int[] array;
	
	public SearchAlgorithm(int[] array) {
		this.array=array;
	}

	public int linearSearch(int item) {
		
		for(int i=0; i<array.length; i++) {
			if(item == array[i])
				return i;
		}
		return -1;
		
	}
	
	public int binarySearch(int item) {
		return binarySearch(0, array.length-1, item);
		
	}
	
	public int binarySearch(int startIndex, int endIndex, int item) {
		
		if(endIndex < startIndex ) {
			return -1;
		}
		
		int middleIndex = (startIndex+endIndex)/2;
		
		if(item == array[middleIndex])
			return middleIndex;
		else if(item< array[middleIndex]){
			return binarySearch(startIndex, middleIndex-1, item);
		}else
			return binarySearch(middleIndex+1, endIndex, item);
			
	}
}
