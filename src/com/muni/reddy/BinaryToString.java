package com.muni.reddy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BinaryToString {
	public static void main(String[] args) throws ParseException {
		String myDate = "2018-06-06 16:54:22.081Z";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(myDate);
		long millis = date.getTime();
		System.err.println(millis);
	}
}
