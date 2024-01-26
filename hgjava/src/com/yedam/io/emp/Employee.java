package com.yedam.io.emp;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Serializable{
	private int empNo;
	private String empName;
	private Date hireDate;
	private int salary;
	
	public Employee(int empNo, String empName, Date hireDate, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", hireDate=" + sdf.format(hireDate) + ", salary=" + salary
				+ "]";
	}
	
	
}
