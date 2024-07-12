package com.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.project.model.Employee;
@Component
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void registration(Employee employee) 	{
		String insert = "insert into employee(emp_id,emp_name,emp_sal,emp_deptno) values(?,?,?,?)";
		jdbcTemplate.update(insert,employee.getId(),employee.getName(),employee.getSal(),employee.getDeptno());
		System.out.println("hello");
	}
	@Override
	public void deleteName(String name) {
		String delete = "delete from employee where emp_name=?";
	int res =	jdbcTemplate.update(delete,name);
    System.out.println((res==1)?"deleted":"not deleted");
	}
	@Override
	public void deleteNameR(String c) {
		String delete = "delete from employee where emp_name like ? ";
		int res =	jdbcTemplate.update(delete,"%"+c);
	    System.out.println((res!=0)?"deleted":"not deleted");	
	}
	@Override
	public void updateSalary(int deptNo) {
		String update = "update employee set emp_sal = 75000 where emp_deptno = ?";
		int res =	jdbcTemplate.update(update,deptNo);
	    System.out.println((res!=0)?"updated":"not Not updated");	
	}
	@Override
	public void findemployeedetailsById(int id) {
		try {
			
			String select ="select * from employee where emp_id=?";
			Employee employee = jdbcTemplate.queryForObject(select,new EmployeeRowMapperImpl(),id);
			System.out.println(employee);
		}
	   catch(Exception e)
		{
		   System.out.println("Found nothing");
		}
		
	}
	@Override
	public void findEmployeeByDeptNO(int id) {
		try {
			
			String select ="select * from employee where emp_deptno=?";
			List<Employee> employee = jdbcTemplate.query(select,new EmployeeRowMapperImpl(),id);
			System.out.println(employee);
		}
	   catch(Exception e)
		{
		   System.out.println(e.getMessage());
		}
		
		
	}
	@Override
	public void finadEmployeeByUsingId(int id) {
		String select = "select * from employee where emp_id = ? ";
		RowMapper<Employee> empDetails =(rs, rowNum) -> 
		{
			Employee employee = new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setSal(rs.getInt(3));
			employee.setDeptno(4);
			return employee;
		};
		Employee emp = jdbcTemplate.queryForObject(select, empDetails,id);
		System.out.println(emp);
		
	
		
	}
	
	@Override
	public void detaisDeptNo(int deptno) {
		String select = "select * from employee where emp_deptno = ? ";
		List<Integer> deptno1 = new ArrayList<Integer>();
		RowMapper<Employee> empDetails =(rs, rowNum) -> 
		{
			Employee employee = new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setSal(rs.getInt(3));
			employee.setDeptno(rs.getInt(4));
			return employee;
		};
		
		// or we can use this following class to do Above functionality
		//BeanPropertyRowMapper<Employee> emp1 = new BeanPropertyRowMapper<Employee>(Employee.class);
		//but if we use it then the names of the variables and the names of the columns in the database should be same 
		
		List<Employee> emp = jdbcTemplate.query(select, empDetails,deptno);
		
		System.out.println(emp);
		
		
	}
	
	
}
