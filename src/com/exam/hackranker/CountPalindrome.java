package com.exam.hackranker;

public class CountPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countPalindrome("ababa"));
	}

	public static int countPalindrome(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				String k = str.substring(i,j+1);
				String k1 = new StringBuilder(k).reverse().toString();
				if (k.equals(k1)) count++;
			}
		}
		return count;
	}
}
