package com.project.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the purchased database table.
 * 
 */
@Entity
@NamedQuery(name="Purchased.findAll", query="SELECT p FROM Purchased p")
public class Purchased implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private int customerid;

	private int productid;

	private int quantity;

	public Purchased() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getProductid() {
		return this.productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}