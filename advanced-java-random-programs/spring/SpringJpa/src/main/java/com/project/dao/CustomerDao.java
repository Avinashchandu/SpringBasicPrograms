package com.project.dao;

import java.util.List;

import com.project.entity.Customer;

public interface CustomerDao {
	
	List<Customer> findCustomers();
	Customer findCustomerByEmail(String email);

}
