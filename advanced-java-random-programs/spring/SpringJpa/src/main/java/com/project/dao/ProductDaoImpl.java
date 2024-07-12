package com.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.Product;
import com.project.repo.ProductsRepo;
@Component
public class ProductDaoImpl implements ProductDao {

@Autowired
ProductsRepo  productsRepo;
	
	@Override
	public Product findProduct(Integer id) {
		return productsRepo.findById(id).orElse(new Product()) ;
	}
	
	

}
