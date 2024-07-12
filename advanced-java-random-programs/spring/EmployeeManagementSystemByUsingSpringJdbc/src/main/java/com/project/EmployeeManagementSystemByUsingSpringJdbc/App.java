package com.project.EmployeeManagementSystemByUsingSpringJdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.EmployeeConfig;
import com.project.dao.EmployeeDaoImpl;
import com.project.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
           Employee employee = new Employee();
           employee.setId(101);
           employee.setName("who");
           employee.setSal(45000);
           employee.setDeptno(10);
           ApplicationContext applicationContext = 
        		   new AnnotationConfigApplicationContext(EmployeeConfig.class);
           EmployeeDaoImpl daoImpl = applicationContext.getBean(EmployeeDaoImpl.class);
           //daoImpl.registration(employee);
           Scanner sc = new Scanner(System.in);
          //System.out.println("Enter char");
           //daoImpl.deleteNameR(sc.next());
           //daoImpl.updateSalary(10);
           //daoImpl.deleteName("who");
           //daoImpl.findEmployeeByDeptNO(10);
           daoImpl.finadEmployeeByUsingId(111);
           
           
    }
}
