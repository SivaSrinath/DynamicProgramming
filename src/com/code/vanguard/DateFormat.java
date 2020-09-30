package com.code.vanguard;

import static java.time.LocalDate.parse;
import static java.time.format.DateTimeFormatter.ofPattern;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tradeDate = "2020-09-30";
		
		String date = parse(tradeDate, ofPattern("yyyy-MM-dd")).format(ofPattern("MM/dd/yyyy"));
		
		System.out.println("req date format in MM/dd/yyyy: "+ date);

	}

}
