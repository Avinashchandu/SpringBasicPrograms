package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.Cart;
import com.project.repo.CartRepo;

@Component
public class CartDaoImpl implements CartDao {
	
	@Autowired
	CartRepo cartRepo;

	@Override
	public List<Cart> findAllCart(int id) {
		return cartRepo.findByCustomerid(id);
	}

	@Override
	public void deleteCartItem(Integer id) {
		cartRepo.deleteById(id);
		
	}
	
	

}
