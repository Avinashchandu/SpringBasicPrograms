package com.project.dao;

import org.springframework.stereotype.Component;

import com.project.entity.Product;

@Component
public interface ProductDao {
	
	Product findProduct(Integer id);

}
