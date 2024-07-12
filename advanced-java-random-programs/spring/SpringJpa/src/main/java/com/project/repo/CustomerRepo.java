package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.project.entity.Customer;
import java.util.List;
import java.util.Optional;

 
public interface CustomerRepo extends  JpaRepository<Customer, Integer> {
	
	Customer findByemail(String email);
        	

}
