package com.muni.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortingName {
	public static void main(String[] args) throws ParseException {
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

		Collections.sort(employees, new EmployeeComparator());
		System.out.print("After sorting: " + employees);
	}
}
