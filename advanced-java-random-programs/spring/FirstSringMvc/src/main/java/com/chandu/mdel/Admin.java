package com.chandu.mdel;

public class Admin {
	
	String email;
	String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Admin() {
		
	}
	@Override
	public String toString() {
		return "Admin [email=" + email + ", password=" + password + "]";
	}
	

}
