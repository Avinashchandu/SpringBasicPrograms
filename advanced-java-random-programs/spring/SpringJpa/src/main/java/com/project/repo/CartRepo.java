package com.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer>{
	
	
	 List<Cart> findByCustomerid(int customerid);

}
