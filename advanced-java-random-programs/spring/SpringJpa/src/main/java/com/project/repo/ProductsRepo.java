package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Product;

public interface ProductsRepo extends JpaRepository<Product, Integer> {
	
	

}
