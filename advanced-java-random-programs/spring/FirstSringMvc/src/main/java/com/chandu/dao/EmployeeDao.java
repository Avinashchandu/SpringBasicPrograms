package com.chandu.dao;

import java.util.List;

import com.chandu.mdel.Employee;

public interface EmployeeDao {
	
	int saveEmployeeDetails(Employee employee);
	List<Employee> allEmployeedetsils();
	int admindetails(String email,String password);
	int remove(int id);
	Employee getEmployee(int id);
	int Employeepdate(int id,String name,int sal,int deptno);

}
