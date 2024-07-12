package com.project;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.BankConfig;
import com.project.dao.BankDao;
import com.project.dao.BankDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // BankDetails bankDetails = new BankDetails(101,"avinash","male","kbhb","lovenothing");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BankConfig.class);
        BankDao bankDao = applicationContext.getBean(BankDaoImpl.class);
       // bankDao.regesistration(bankDetails);
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
        	System.out.println("Enter email or mobile");
            String name = sc.next();
            System.out.println("enter Password");
            String password = sc.next();
        	if(bankDao.loginByTwo(name, password))
        	{
        		System.out.println("login successful");
        		break;
        	}
        	else
        	{
        		System.out.println("Entered Wrong details");
        	}
        }
    }
}
