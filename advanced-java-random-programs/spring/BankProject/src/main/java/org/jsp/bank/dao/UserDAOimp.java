package org.jsp.bank.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class UserDAOimp implements UserDAO {



	private final String url = "jdbc:mysql://localhost:3306/advanced_java_projects?user=root&password=12345";
	private final String selectaccountpassword = "select * from bank_user_details where user_account_number = ? and user_password = ?";
	private final String update = "update bank_user_details set user_amount = ? where user_account_number = ? ";
	private final String selectByMobile = "select * from bank_user_details where user_mobile_number = ?";
	private final String updateamount = "update bank_user_details set user_amount = ? where user_mobile_number = ? ";
	private final String insert_into = "insert into statement vales(?,?,?,?,?,?,?,?,?)";
	Scanner sc = new Scanner(System.in);
	@Override
	public void userLogin(String bankEmail, int password) {
		System.out.println("User Logged in");
	}

	@Override
	public void debit(int accountnumber, int password) {

		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(selectaccountpassword);
			ps.setInt(1, accountnumber);
			ps.setInt(2, password);
			ResultSet set = ps.executeQuery();
			if(set.next())
			{
				System.out.println("Enter Amount");
				double amount = sc.nextDouble();
				if(amount>0)
				{
					double databaseAmount = set.getInt("user_amount");

					if(amount<=databaseAmount)
					{
						double remainAmount = databaseAmount-amount;
						PreparedStatement ps1 = connection.prepareStatement(update);
						ps1.setDouble(1, remainAmount);
						ps1.setInt(2, accountnumber);
						int res = ps1.executeUpdate();
						if(res!=0)
						{
							System.out.println("Amount debited");
						}
						else
						{
							System.out.println("Error 404");
						}

					}
					else
					{
						System.out.println("Insufficient amount");
					}
				}
			}
			else
			{
				System.out.println("Invalid Data");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void credit(int accountnumber, int password) {
		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(selectaccountpassword);
			ps.setInt(1, accountnumber);
			ps.setInt(2, password);
			ResultSet set = ps.executeQuery();
			if(set.next())
			{
				System.out.println("Enter Amount");
				double amount = sc.nextDouble();
				if(amount>0)
				{
					double databaseAmount = set.getInt("user_amount");
					double remainAmount = databaseAmount+amount;
					PreparedStatement ps1 = connection.prepareStatement(update);
					ps1.setDouble(1, remainAmount);
					ps1.setInt(2, accountnumber);
					int res = ps1.executeUpdate();
					if(res!=0)
					{
						System.out.println("Amount credited");
					}
					else
					{
						System.out.println("Error 404");
					}
				}
			}
			else
			{
				System.out.println("Invalid Data");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAOimp n = new UserDAOimp();
		n.mobileToMobileTransaction("8639611877");
	}

	@Override
	public void mobileToMobileTransaction(String mobile) {

		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(selectByMobile);
			ps.setString(1,mobile);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				PreparedStatement ps1 = connection.prepareStatement(selectByMobile);
				System.out.println("Enter Senders mobile Number");
				String rMobileNo = sc.next();
				System.out.println(rMobileNo);
				ps1.setString(1,rMobileNo);
				ResultSet rs1 = ps1.executeQuery();
				if(rs1.next())
				{
                   UserDAOimp u = new UserDAOimp();
                   System.out.println("Enter your Amount");
                   double userammount = sc.nextDouble();
                   if(userammount>=0)
                   {
                	   double sendersDatabaseAmont = rs.getDouble("user_amount");
                	   if(sendersDatabaseAmont>=userammount)
                	   {
                		   double  debit = sendersDatabaseAmont-userammount;
                		   PreparedStatement ps2 = connection.prepareStatement(updateamount);
                		   ps2.setDouble(1, debit);
                		   ps2.setString(2, mobile);
                		   int result = ps2.executeUpdate();
                		   if(result!=0)
                		   {
                              PreparedStatement ps3 = connection.prepareStatement(insert_into);
                              ps3.setString(1, "debit");
                              ps3.setDate(2,Date.valueOf(LocalDate.now()));
                              ps3.setString(3, "Mobile Transaction");
                              Random random = new Random();
                              int transaction = random.nextInt(1000000000);
                              if(transaction<100000)
                              {
                            	  transaction +=100000000;
                              }
                              ps3.setInt(4, transaction);
                			  ps3.setString(5,userammount+"Dr");
                			  ps3.setInt(6, rs.getInt("user_id"));
                			  ps3.setInt(7, rs.getInt(1));
                			  
                		   }
                		   else
                		   {
                			   
                		   }
                	   }
                	   else
                	   {
                		   
                	   }
                   }
                   else
                   {
                	   
                   }
				}
				else
				{
					System.out.println("Sender Info No Found");
				}
			}
			else
			{
				System.out.println("User Info Not Found");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}


