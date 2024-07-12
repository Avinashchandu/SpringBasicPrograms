package org.jsp.bank.dao;

public interface UserDAO {

	 void userLogin(String bankEmail,int password);
	 public void debit(int accountnumber,int password);
	 public void credit(int accountnumber,int password);
	 void mobileToMobileTransaction(String Mobile);
}
