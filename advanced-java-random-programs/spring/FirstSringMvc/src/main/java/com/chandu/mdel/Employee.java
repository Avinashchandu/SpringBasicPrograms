package com.chandu.mdel;

public class Employee {
	
	private int employeeid;
	private String employeename;
	private double employeesalary;
	private int deptno;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public double getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalary="
				+ employeesalary + ", deptno=" + deptno + "]";
	}
	public Employee(int employeeid, String employeename, double employeesalary, int deptno) {
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
		this.deptno = deptno;
	}
	public Employee() {
		
	}
	

}
