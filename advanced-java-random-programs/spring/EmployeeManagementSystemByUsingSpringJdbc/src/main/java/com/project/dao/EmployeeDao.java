package com.project.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.project.model.Employee;

public interface EmployeeDao {
	
	
	
	void registration(Employee employee);
	void deleteName(String name);
	void deleteNameR(String c);
	void updateSalary(int deptNo);
	void findemployeedetailsById(int id);
	void findEmployeeByDeptNO(int id);
	void finadEmployeeByUsingId(int id);
	void detaisDeptNo(int deptno);


}
