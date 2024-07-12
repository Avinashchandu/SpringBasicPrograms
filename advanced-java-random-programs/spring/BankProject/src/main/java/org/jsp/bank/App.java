package org.jsp.bank;

import java.util.Scanner;




import org.jsp.bank.dao.AdminDAO;
import org.jsp.bank.dao.AdminHelper;
import org.jsp.bank.dao.UserDAO;
import org.jsp.bank.dao.UserDaoHelper;
public class App 
{
	public static void main( String[] args )
	{
		AdminDAO admin = AdminHelper.adminHelp();
		UserDAO user = UserDaoHelper.userHelp();
		Scanner sc =  new Scanner(System.in);	
		boolean status = true;
		while(status)
		{
			System.out.println("Enter \n 1.Admin Login \n 2.UserLogin ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:	
				System.out.println("Enter Email And password");
				admin.adminLogin(sc.next(),sc.next());
				break;
			case 2:
				user.userLogin("chandu@sbi.org", 2001);
				break;
			case 3:
				System.out.println("Enter your account number and password");
				user.debit(sc.nextInt(), sc.nextInt());
				break;
			default:
				System.out.println("\nEnter Valid Choice");
				continue;
			}
			System.out.println("\ndo yo wish to continue \n yes \n no\n");
			if(sc.next().equalsIgnoreCase("no"))
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thank You visit Again.....");
				break;
			}
			
		}
		sc.close();
	}
}
