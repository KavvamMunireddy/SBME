package com.muni.java8;

import java.util.Date;

public class Employee {
	private String	empId;
	private Date	joinDate;
	private String	empName;
	private String	disg;
	private double	salary;

	public Employee(String empId, Date joinDate, String empName, String disg, double salary) {
		this.empId = empId;
		this.disg = disg;
		this.empName = empName;
		this.joinDate = joinDate;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", joinDate=" + joinDate + ", empName=" + empName + ", disg=" + disg
				+ ", salary=" + salary + "]";
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDisg() {
		return disg;
	}

	public void setDisg(String disg) {
		this.disg = disg;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
