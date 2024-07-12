package com.project.model;

import org.springframework.stereotype.Component;

@Component
public class BankDetails {
	
	private int bankid;
	private String name;
	private String gender;
	private String address;
	private String pin;
	@Override
	public String toString() {
		return "BankDetails [bankid=" + bankid + ", name=" + name + ", gender=" + gender + ", address=" + address
				+ ", pin=" + pin + "]";
	}
	public int getBankid() {
		return bankid;
	}
	public BankDetails() {
		super();
	}
	public BankDetails(int bankid, String name, String gender, String address, String pin) {
		super();
		this.bankid = bankid;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.pin = pin;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}

}
