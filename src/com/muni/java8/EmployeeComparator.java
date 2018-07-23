package com.muni.java8;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp2.getEmpName().compareTo(emp1.getEmpName());
	}

}
