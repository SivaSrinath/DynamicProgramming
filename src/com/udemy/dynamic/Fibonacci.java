package com.udemy.dynamic;

import java.util.*;

public class Fibonacci {
	
	private Map<Integer, Integer> memoizeMap;
	
	public Fibonacci() {
		
		this.memoizeMap = new HashMap();
		memoizeMap.put(0, 0);
		memoizeMap.put(1, 1);
	}

	public int fibonacciDP(int n) {
		
		if(memoizeMap.containsKey(n)) return memoizeMap.get(n);
		
		memoizeMap.put(n-1, fibonacciDP(n-1));
		memoizeMap.put(n-2, fibonacciDP(n-2));
		
		int calculate = fibonacciDP(n-1) + fibonacciDP(n-2);
		
		memoizeMap.put(n, calculate);
		
		return calculate;
		
	}
	
	//it has exponential running time
	public int naiveFab(int n) {
		
		if (n == 0) return 0;
		if( n == 1) return 1;
		
		return naiveFab(n-1) + naiveFab(n-2);
	}

}
