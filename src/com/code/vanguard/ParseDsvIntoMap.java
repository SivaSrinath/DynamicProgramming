package com.code.vanguard;

import java.util.HashMap;
import java.util.Map;

public class ParseDsvIntoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("*************"+parseDIntoMap("A:390:S:391:Q:392", ":").toString());

	}
	
	
	public static Map<String, String> parseDIntoMap(String dsv, String c){		
		Map<String, String> map = new HashMap<String, String>();
		String[] nameValues = dsv.split(c);
		if(nameValues!=null && nameValues.length %2 == 0) {
			for(int n=0; n<nameValues.length; n+=2 ) {
				map.put(nameValues[n], nameValues[n+1]);
			}
		}
		
		return map;
		
	}

}
