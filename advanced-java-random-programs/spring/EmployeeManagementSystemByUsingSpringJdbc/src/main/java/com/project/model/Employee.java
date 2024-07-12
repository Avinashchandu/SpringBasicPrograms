package com.project.model;

public class Employee {
	
    private int id;
	private String name;
	private double sal;
	private int deptno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public Employee(int id, String name, double sal, int deptno) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.deptno = deptno;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", deptno=" + deptno + "]";
	}
	
	

}
