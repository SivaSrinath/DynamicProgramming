package com.exam.kforce;

public class MaxString {
	
	
	public static String maxSub(String str) {
		
		/*
		 * String max = ""; for(int i=0; i<str.length(); i++) { if(max.compareTo(str) <=
		 * 0) max=str.substring(i); } return max;
		 */
		
		String maxVal = "";

	     for(int i=0; i<str.length(); i++) {
	         String next = str.substring(i);
	         if(next.compareTo(maxVal) > 0) maxVal = next;
	     }
	     return maxVal;
	}
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(maxSub("bbb"));

	}

}
