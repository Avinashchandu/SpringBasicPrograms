package com.dj;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dj.model.Address;
import com.dj.model.Bike;
import com.dj.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("DI.xml");
        System.out.println("Select Bike");
        System.out.println("bajaj or enfield");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        System.out.println(choice);
        Bike bike ;
        if(choice.equalsIgnoreCase("bajaj"))
        {
        	 bike = (Bike) app.getBean("bajaj");
        }
        else
        {
        	 bike = (Bike) app.getBean("royalenfield");
        }
        System.out.println("name: "+bike.nameOfBike());
        System.out.println("cc :"+bike.bikeCC());
        System.out.println("colour: "+bike.color());
        app.close();
        
    }
    
}
