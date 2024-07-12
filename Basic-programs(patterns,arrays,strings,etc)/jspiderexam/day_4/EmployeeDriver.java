package day_4;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDriver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> a = new ArrayList<Employee>();
	Employee e1 = new Employee("Avinash", 101, 50000, "Kurnool", "Java developer");
	a.add(e1);
	Employee e2 = new Employee("Chandu", 102, 60000, "Vizag", "System engineer");
	a.add(e2);
	Employee e3 = new Employee("Akash", 103, 10000, "Rajamandry", "Cloud engineer");
	a.add(e3);
	Employee e4 = new Employee("Abhi", 104, 25000, "Kolkata", "DBA");
	a.add(e4);
	Employee e5 = new Employee("Chandana", 105, 45000, "Banglore", "Developer");
	a.add(e5);
    boolean status = true;
    while(status)
    {
    	String name;
    	 int id;
    	 int sal;
    	 String loc;
    	 String designation;
    	System.out.println("Enter details");
    	System.out.println("Enter name");
    	name = sc.nextLine();
    	System.out.println("Enter id");
    	id=sc.nextInt();
    	System.out.println("ENter sal");
    	sal = sc.nextInt();
    	System.out.println();
    	System.out.println("Enter location");
    	loc = sc.next();
    	System.out.println("enter designation");
    	designation=sc.next();
    	Employee e = new Employee(name, id, sal, loc, designation);
    	a.add(e);
    	System.out.println("enter true to continue or false to end");
    	
    	
    }
}
}
