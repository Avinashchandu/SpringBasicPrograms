package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.model.Employee;
@Component
public class EmployeeeDAOImpl  {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
		
		public void findEmployeeDetailsLessThanGivenSalaryWith(double num) {
			String select ="select * from employee where Emp_Salary<?";
			List<Employee> employee=jdbcTemplate.query(select,new EmployeeRowMapperImpl(),num);
			if(employee.size()!=0)
			{
				
	               employee.forEach((employeeDetails)->{
	            	   System.out.println("Employee id :"+employeeDetails.getId());
		           		System.out.println("Employee Name :"+employeeDetails.getName());
		           		System.out.println("Employee Salary :"+employeeDetails.getSal());
		           		System.out.println("Employee Deptno :"+employeeDetails.getDeptno());
	               });
			}
			else
			{
				System.out.println("No Data Found with Employee less tha salary:"+num);
			
			}
			
		}

	
		public void findEmployeeDetailsByNameStartWith(char ch) {
			String select="select * from employee where Emp_Name Like ?";
			List<Employee> employee=jdbcTemplate.query(select, new EmployeeRowMapperImpl(),ch+"%");
			if(employee.size()!=0)
			{
				
	               employee.forEach((employeeDetails)->{
	            	System.out.println("Employee id :"+employeeDetails.getId());
	           		System.out.println("Employee Name :"+employeeDetails.getName());
	           		System.out.println("Employee Salary :"+employeeDetails.getSal());
	           		System.out.println("Employee Deptno :"+employeeDetails.getDeptno());
	           		System.out.println("");
	               });
			}
			else
			{
				System.out.println("No Data Found with Employee Name start with character :"+ch);
			
			}
		}

		
		public void findEmployeeDetailsByNameWithMoreThanOneVowel() {
			String select="select * from employee where  Emp_Name LIKE '%a%' OR\r\n"
					+ "    Emp_Name LIKE '%e%' OR\r\n"
					+ "    Emp_Name LIKE '%i%' OR\r\n"
					+ "    Emp_Name LIKE '%o%' OR\r\n"
					+ "    Emp_Name LIKE '%u%'\r\n"
					+ "AND\r\n"
					+ "    (LENGTH(Emp_Name) - LENGTH(REPLACE(Emp_Name, 'a', '')) +\r\n"
					+ "    LENGTH(Emp_Name) - LENGTH(REPLACE(Emp_Name, 'e', '')) +\r\n"
					+ "    LENGTH(Emp_Name) - LENGTH(REPLACE(Emp_Name, 'i', '')) +\r\n"
					+ "    LENGTH(Emp_Name) - LENGTH(REPLACE(Emp_Name, 'o', '')) +\r\n"
					+ "    LENGTH(Emp_Name) - LENGTH(REPLACE(Emp_Name, 'u', ''))) > 1;";
			List<Employee> employee=jdbcTemplate.query(select, new EmployeeRowMapperImpl());
			if(employee.size()!=0)
			{
				
	               employee.forEach((employeeDetails)->{
	            	System.out.println("Employee id :"+employeeDetails.getId());
	           		System.out.println("Employee Name :"+employeeDetails.getName());
	           		System.out.println("Employee Salary :"+employeeDetails.getSal());
	           		System.out.println("Employee Deptno :"+employeeDetails.getDeptno());
	           		System.out.println("");
	               });
			}
			else
			{
				System.out.println("No Data Found with Employee Name contain more than one vowel");
			
			}
			
		}

		
		public void findEmployeeDetailsByDeptnoIsMegaPrimeNumber(int empdeptno) {
		  
			if(findMegaPrime(empdeptno))
			{
				if(findDigit(empdeptno))
				{
					String select="select * from employee where Emp_Deptno=?";
					List<Employee> employee=jdbcTemplate.query(select, new EmployeeRowMapperImpl(),empdeptno);
					if(employee.size()!=0)
					{
						
			               employee.forEach((employeeDetails)->{
			            	System.out.println("Employee id :"+employeeDetails.getId());
			           		System.out.println("Employee Name :"+employeeDetails.getName());
			           		System.out.println("Employee Salary :"+employeeDetails.getSal());
			           		System.out.println("Employee Deptno :"+employeeDetails.getDeptno());
			           		System.out.println("");
			               });
					}
					else
					{
						System.out.println("No Data Found with Employee Deptno is MegaPrime Number");
					}
					
				}
				else
				{
					System.out.println("No Data Found with Employee Deptno is MegaPrime Number");
					
				}
				
			}
			
			else
			{
				System.out.println("No Data Found with Employee Deptno is MegaPrime Number");
			}
			
		}
		public boolean findMegaPrime(int n)
		{
			boolean isFound=false;
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				isFound=true;
			}
			return isFound;
		}
		public boolean findDigit(int n)
		{
			boolean isFound=false;
			int temp=n;
			while(temp!=0)
			{
				int ld=temp%10;
				isFound=findMegaPrime(ld);
				temp=temp/10;
			}
			return isFound;
			
		}

}