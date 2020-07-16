package com.udemy.logic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;;

public class FirstUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "[a8 1234556]";
		
		System.out.println("*******"+str.replaceAll("[0-9]",""));
		
		String tmp = "";
		
		List<String> stringList ;
		
		String[] strArray = str.split("");
		
		Map<String, Integer> map = null;
		for(int i=0; i<str.length(); i++) {
			
			map = new HashMap<String, Integer>();
			char current = str.charAt(i);
			map.put(String.valueOf(current), new Integer(i).intValue());
			if(tmp.indexOf(current) < 0) {
				tmp = tmp+ current;
			}else
				tmp = tmp.replace(String.valueOf(current), "");
		}
		System.out.println(tmp);
	}
}
