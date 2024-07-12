package com.project.dao;

import com.project.model.BankDetails;

public interface BankDao {
	
	void regesistration(BankDetails bankDetails);
	boolean login(String name,String password);
	boolean loginByTwo(String email,String password);

}
