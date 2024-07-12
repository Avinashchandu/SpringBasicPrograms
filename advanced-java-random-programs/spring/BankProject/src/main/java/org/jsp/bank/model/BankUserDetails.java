package org.jsp.bank.model;

import java.time.LocalDate;

public class BankUserDetails {
	
	private int userId;
	private String userName;
	private String userBankEmailId;
	private String userEmailId;
	private int userPassword;
	private String userGender;
	private String usrAddress;
	private LocalDate userdateOfBirth;
	private int userAccountNumber;
	private double userAmount;
	private String userMobileNumber;
	private String ifscCode;
	
	
	
	public BankUserDetails()
	{}
	
	
	public BankUserDetails(int userId, String userName, String userBankEmailId, String userEmailId, int userPassword,
			String userGender, String usrAddress, LocalDate userdateOfBirth, int userAccountNumber, double userAmount,
			String userMobileNumber, String ifscCode) {
		
		this.userId = userId;
		this.userName = userName;
		this.userBankEmailId = userBankEmailId;
		this.userEmailId = userEmailId;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.usrAddress = usrAddress;
		this.userdateOfBirth = userdateOfBirth;
		this.userAccountNumber = userAccountNumber;
		this.userAmount = userAmount;
		this.userMobileNumber = userMobileNumber;
		this.ifscCode = ifscCode;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserBankEmailId() {
		return userBankEmailId;
	}
	public void setUserBankEmailId(String userBankEmailId) {
		this.userBankEmailId = userBankEmailId;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public int getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(int userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUsrAddress() {
		return usrAddress;
	}
	public void setUsrAddress(String usrAddress) {
		this.usrAddress = usrAddress;
	}
	public LocalDate getUserdateOfBirth() {
		return userdateOfBirth;
	}
	public void setUserdateOfBirth(LocalDate userdateOfBirth) {
		this.userdateOfBirth = userdateOfBirth;
	}
	public int getUserAccountNumber() {
		return userAccountNumber;
	}
	public void setUserAccountNumber(int userAccountNumber) {
		this.userAccountNumber = userAccountNumber;
	}
	public double getUserAmount() {
		return userAmount;
	}
	public void setUserAmount(double userAmount) {
		this.userAmount = userAmount;
	}
	public String getUserMobileNumber() {
		return userMobileNumber;
	}
	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "BankUserDetails [userId=" + userId + ", userName=" + userName + ", userBankEmailId=" + userBankEmailId
				+ ", userEmailId=" + userEmailId + ", userPassword=" + userPassword + ", userGender=" + userGender
				+ ", usrAddress=" + usrAddress + ", userdateOfBirth=" + userdateOfBirth + ", userAccountNumber="
				+ userAccountNumber + ", userAmount=" + userAmount + ", userMobileNumber=" + userMobileNumber
				+ ", ifscCode=" + ifscCode + "]";
	}
	

}
