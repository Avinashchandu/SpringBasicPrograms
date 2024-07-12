package com.dj.model;

public class Employee {
	private int id;
	private String name;
	private int deptNo;
	private double sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println(id%2==0?"id is even":"id is odd");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name");
		this.name = name;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		System.out.println("deptNo");
		this.deptNo = deptNo;
	}
	public double getSal() {
		System.out.println("sal");
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptNo=" + deptNo + ", sal=" + sal + "]";
	}
    

}
