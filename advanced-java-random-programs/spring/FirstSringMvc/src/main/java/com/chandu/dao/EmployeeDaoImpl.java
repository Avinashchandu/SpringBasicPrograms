package com.chandu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.chandu.mdel.Admin;
import com.chandu.mdel.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int saveEmployeeDetails(Employee employee) {
		String insert = "insert into employees(employeename,employeesalary,deptno) values(?,?,?)";
		
		return jdbcTemplate.update(insert,employee.getEmployeename(),employee.getEmployeesalary(),employee.getDeptno());
	}

	@Override
	public List<Employee> allEmployeedetsils() {
		String query = "select * from employees";
		BeanPropertyRowMapper<Employee> beanPropertyRowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		List<Employee> list =  jdbcTemplate.query(query, beanPropertyRowMapper);
		return list;
	}

	@Override
	public int admindetails(String email,String password) {
		String query = "select * from admin where email =? and password = ?";
		BeanPropertyRowMapper<Admin> beanPropertyRowMapper = new BeanPropertyRowMapper<Admin>(Admin.class);
		List<Admin> list =  jdbcTemplate.query(query, beanPropertyRowMapper,email,password);
		return list.size();
	}

	@Override
	public  int remove(int id) {
		String delete = "delete from employees where employeeid = ?";
		int i = jdbcTemplate.update(delete,id);
		return i;
	}

	@Override
	public Employee getEmployee(int id) {
		String get = "select * from employees where employeeid = ?";
		BeanPropertyRowMapper<Employee> beanPropertyRowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		Employee employee = jdbcTemplate.queryForObject(get,beanPropertyRowMapper, id);
		return employee;
	}

	@Override
	public int Employeepdate(int id, String name, int sal, int deptno) {
		String update = "update employees set employeename = ?,employeeSalary=?,deptno=? where employeeid=?";
		int i = jdbcTemplate.update(update,name,sal,deptno,id);
		return i;
	}

}
