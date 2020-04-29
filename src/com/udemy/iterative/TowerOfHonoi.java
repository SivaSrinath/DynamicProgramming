package com.udemy.iterative;

public class TowerOfHonoi {
	
	public void towerOfho(int rodCount, String rodFrom, String middleRod, String rodTo) {
		
		if(rodCount == 1) {
			System.out.println("plate 1 from "+ rodFrom + " to "+ rodTo);
			return;
		}
		towerOfho(rodCount-1, rodFrom, rodTo, middleRod);
		System.out.println("plate --  "+ rodCount +" from "+ rodFrom + " to "+ rodTo);
		towerOfho(rodCount-1, middleRod, rodFrom, rodTo);
	}
}

/*
 * stack
 * 
 * toh(1, A, B, C) toh(2, A,C,B)
 * 
 * toh(1, A,B,C) plate -- 2 from A to B
 * 
 * toh(1, C, A, B)
 * 
 * stack toh(1, C, A, B) done toh(1, A,B,C)
 * 
 * output plate 1 from A to C plate -- 2 from A to B plate 1 from C to B  
 */