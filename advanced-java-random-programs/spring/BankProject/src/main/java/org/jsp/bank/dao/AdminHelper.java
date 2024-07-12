package org.jsp.bank.dao;

public class AdminHelper {
	
	public static AdminDAO adminHelp()
	{
		AdminDAO dao = new AdminDAOimp();
		return dao;
	}

}
