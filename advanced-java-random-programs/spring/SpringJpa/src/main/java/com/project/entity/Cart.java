package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cart {
	@Override
	public String toString() {
		return "Cart [id=" + id + ", customerid=" + customerid + ", productid=" + productid + ", quantity=" + quantity
				+ "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	int customerid;
	int productid;
	int quantity;

}
