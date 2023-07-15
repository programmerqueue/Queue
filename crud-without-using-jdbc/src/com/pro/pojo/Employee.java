package com.pro.pojo;

import java.io.Serializable;

public class Employee implements Serializable{
	private int eId;
	private String empName;
	private double eSalary;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	public Employee(int eId, String empName, double eSalary) {
		
		this.eId = eId;
		this.empName = empName;
		this.eSalary = eSalary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", empName=" + empName + ", eSalary=" + eSalary + "]";
	}

}
