package com.muni.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Sorting {

	public static void main(String[] args) throws ParseException {
		List<Employee> employees = Arrays.asList(new Employee("KA123", new Date(), "Muni", "JavaDeveloper", 36000),
				new Employee("KA134", new SimpleDateFormat("dd/MM/yyyy").parse("12/03/2018"), "Reddy", "JavaDeveloper",
						38000),
				new Employee("KA154", new SimpleDateFormat("dd/MM/yyyy").parse("12/04/2018"), "Raju", "JavaDeveloper",
						35000),
				new Employee("KA126", new SimpleDateFormat("dd/MM/yyyy").parse("12/02/2018"), "Ranga", "JavaDeveloper",
						37000),
				new Employee("KA1665", new SimpleDateFormat("dd/MM/yyyy").parse("18/1/2018"), "Roopa", "JavaDeveloper",
						31000),
				new Employee("KA129", new SimpleDateFormat("dd/MM/yyyy").parse("12/1/2018"), "Kala", "JavaDeveloper",
						39000));
		employees.sort(Comparator.comparing(Employee::getEmpId));
		// Collections.sort(employees, (Employee emp1, Employee emp2) ->
		// emp1.getEmpId().compareTo(emp2.getEmpId()));
		/*
		 * Collections.sort(employees, (Employee emp2, Employee emp1) ->
		 * emp1.getEmpName().compareTo(emp2.getEmpName()));
		 * Collections.sort(employees, (emp1, emp2) ->
		 * emp2.getJoinDate().compareTo(emp1.getJoinDate()));
		 */
		System.out.println(employees);
	}

}
