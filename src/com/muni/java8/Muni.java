package com.muni.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Muni {
	private static List<Employee> main1() throws ParseException {
		List<Employee> employees = Arrays.asList(new Employee("KA123", new Date(), "Muni", "JavaDeveloper", 36000),
				new Employee("KA134", new SimpleDateFormat("dd/MM/yyyy").parse("12/03/2018"), "Reddy", "JavaDeveloper",
						36000),
				new Employee("KA154", new SimpleDateFormat("dd/MM/yyyy").parse("12/04/2018"), "Raju", "JavaDeveloper",
						36000),
				new Employee("KA126", new SimpleDateFormat("dd/MM/yyyy").parse("12/02/2018"), "Ranga", "JavaDeveloper",
						36000),
				new Employee("KA1665", new SimpleDateFormat("dd/MM/yyyy").parse("18/1/2018"), "Roopa", "JavaDeveloper",
						36000),
				new Employee("KA129", new SimpleDateFormat("dd/MM/yyyy").parse("12/1/2018"), "Kala", "JavaDeveloper",
						36000));
		return employees;
	}

	public static void main(String[] args) throws ParseException {
		List<Employee> employees = main1();
		Optional<Employee> pAdjustments = employees.stream().filter(adjust -> adjust.getEmpId().equals("KA123"))
				.findAny();
		if (pAdjustments.isPresent()) {
			pAdjustments.get().setEmpId("KA2545");
			pAdjustments.get().setEmpName("Munireddy");
		}
		System.err.println(employees);
		Muni.main(args, args);
	}

	public static void main(String[] args1, String[] args2) throws ParseException {
		List<Employee> employees = main1();
		Optional<Employee> pAdjustments = employees.stream().filter(adjust -> adjust.getEmpId().equals("KA123"))
				.findAny();
		if (pAdjustments.isPresent()) {
			pAdjustments.get().setEmpId("KA2545");
			pAdjustments.get().setEmpName("Munireddy");
		}
		System.out.println("Munireddy");
	}
}
