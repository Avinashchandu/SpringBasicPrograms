package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Purchased;

public interface PurchasedRepo extends JpaRepository<Purchased, Integer> {

}
