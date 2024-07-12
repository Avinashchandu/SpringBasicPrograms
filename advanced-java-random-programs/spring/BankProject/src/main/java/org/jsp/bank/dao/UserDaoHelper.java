package org.jsp.bank.dao;

public class UserDaoHelper {
	public static UserDAO userHelp()
	{
		UserDAO dao = new UserDAOimp();
		return dao;
	}
	

}
