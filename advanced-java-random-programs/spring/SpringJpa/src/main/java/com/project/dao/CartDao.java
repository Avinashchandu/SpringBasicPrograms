package com.project.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.project.entity.Cart;

@Component
public interface CartDao {
	
	List<Cart> findAllCart(int id);
	void deleteCartItem(Integer id);

}
