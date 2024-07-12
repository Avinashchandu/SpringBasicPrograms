package org.jsp.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAOimp implements AdminDAO {
	
	private final String select = "Select * from bank_admin where admin_email=? and admin_password = ?";
	private final String url = "jdbc:mysql://localhost:3306/advanced_java_projects?user=root&password=12345";

	@Override
	public void adminLogin(String bankEmail, String password) {
		
		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(select);
			ps.setString(1, bankEmail);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();
			if(rs.next())
			{
				System.out.println("Admin Logged in Successfully......");
			}
			else
			{
				System.out.println("No Admin present by the given email or password");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
