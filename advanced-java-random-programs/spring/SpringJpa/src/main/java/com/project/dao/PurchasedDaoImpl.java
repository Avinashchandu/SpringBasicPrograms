package com.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.Purchased;
import com.project.repo.PurchasedRepo;

@Component
public class PurchasedDaoImpl implements  Purchaseddao {

	
	@Autowired
	PurchasedRepo purchasedRepo;
	
	@Override
	public void savePurchased(Purchased purchased) {
		purchasedRepo.save(purchased);
		
		
	}

}
