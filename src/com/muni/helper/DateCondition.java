package com.muni.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCondition {
	public static void main(String[] agrs) throws ParseException {
		Date todayDate = new Date();
		Date startedDate = new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2018");
		Date expiredDate = new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2018");
		if (startedDate.after(new Date())) {
			System.err.println("Exist");
		} else {
			System.err.println("Not Exist");
		}
	}
}
