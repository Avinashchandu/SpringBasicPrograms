package day_4;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee implements Comparable<Employee> {
	private String name;
	private int id;
	private int sal;
	private String loc;
	private String designation;
	public Employee(String name, int id, int sal, String loc, String designation) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.loc = loc;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void display()
	{
		System.out.println("Employee [name=" + this.name + ", \nid=" + this.id + ", \nsal=" + this.sal + ", \nloc=" + this.loc + ", \ndesignation="
				+ this.designation+"\n");
	}
	public static void displaySalLessThan3lak(ArrayList a)
	{
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if(employee.sal*12>300000)
			{
				System.out.println("Employee \nname=" + employee.name + "\nid=" + employee.id + "\nsal=" + employee.sal + "\nloc=" + employee.loc + "\ndesignation="
				+ employee.designation +"\n");
			}
		}
	}
	public static void displayAccToLoc(ArrayList a)
	{
		Iterator iterator = a.iterator();
		while( iterator.hasNext()) {
			
			Employee employee = (Employee) iterator.next();
			if(a.contains(employee.loc="hyderabad"))
			{
			if(employee.loc.equalsIgnoreCase("Banglore")&&employee.designation.equalsIgnoreCase("Developer"))
			{
				System.out.println("Employee \nname=" + employee.name + "\nid=" + employee.id + "\nsal=" + employee.sal + "\nloc=" + employee.loc + "\ndesignation="
				+ employee.designation +"\n");
			}
		}
		
		else
			try {
				
				throw new Exception();
				
			} catch (Exception e) {
				System.out.println("Does not contain Hyderbad");
			}
		}
	}
	public static void searchEmployee(ArrayList a)
	{
		Iterator iterator = a.iterator();
		while( iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			if(employee.id%2==0)
			{
				System.out.println("Employee \nname=" + employee.name + "\nid=" + employee.id + "\nsal=" + employee.sal + "\nloc=" + employee.loc + "\ndesignation="
				+ employee.designation +"\n");
			}
		}
	}
	public static void displayAccToLoc1(ArrayList a)
	{
		Iterator iterator = a.iterator();
		while(iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			
			if(employee.loc.equalsIgnoreCase("Banglore")&&employee.designation.equalsIgnoreCase("Developer"))
			{
				System.out.println("Employee \nname=" + employee.name + "\nid=" + employee.id + "\nsal=" + employee.sal + "\nloc=" + employee.loc + "\ndesignation="
				+ employee.designation +"\n");
			}
		}
	}
	public static ArrayList updateSal(ArrayList a,int sal)
	{
		Iterator iterator = a.iterator();
		while( iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			if(employee.designation.equalsIgnoreCase("DBA"))
			{
				employee.sal=sal;
			}
		}
		return a;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", loc=" + loc + ", designation="
				+ designation + "]";
	}	
	@Override
	public int compareTo(Employee e) {
		if(this.sal<e.sal)
		{
			return -1;
		}
		else if(this.sal>e.sal)
			return 1;
		else
			return 0;
	}
	public static ArrayList remove(ArrayList a,int sal)
	{
		Iterator iterator = a.iterator();
		while( iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			if(employee.loc.equalsIgnoreCase("Hyderabad"))
			{
				employee.sal=sal;
			}
		}
		return a;
	}
	public static Employee create(String name, int id, int sal, String loc, String designation)
	{
		return new Employee(name,id,sal,loc,designation);
	}
	
}
