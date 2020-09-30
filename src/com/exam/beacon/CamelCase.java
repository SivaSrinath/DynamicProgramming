package com.exam.beacon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CamelCase {

	public static List<String> splitWord(String input) {
		List<String> s = new ArrayList<>();
		for (String w : input.split("(?=\\p{Upper})")) {
			String s1= w.substring(0, 1).toLowerCase() + w.substring(1);
			s.add(s1);
	    }
		System.out.println(s);
		return s;
	}
	public static boolean camelCase(String words[], String key) {
		int count=0;
	//	List<String> t=Arrays.asList(words).stream().map((w)->w.substring(0, 1).toUpperCase() + w.substring(1)).collect(Collectors.toList());
		List<String> t=Arrays.asList(words);
		for(String str:splitWord(key))
			if(t.contains(str)) count++;
		if(count==splitWord(key).size())
			return true;
		return false;
	}

	public static void main(String[] args) {
		String input[]=new String[] {"is", "valid", "right"};
		//String key = "aYhjKiiiYUTT";
		String key = "isValid";
		System.out.println(camelCase(input,key));
	}
}
