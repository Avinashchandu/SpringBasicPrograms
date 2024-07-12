package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.Customer;
import com.project.repo.CustomerRepo;

@Component
public class CustomerDaoImpl implements CustomerDao {

	
	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public List<Customer> findCustomers() {
		return customerRepo.findAll();
	}

	@Override
	public Customer findCustomerByEmail(String email) {
		return customerRepo.findByemail(email);
	}

}
