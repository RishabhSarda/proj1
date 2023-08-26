package com.testing.app.dto;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserTable {
	
	@Id
	@GeneratedValue
	private Integer userId;
	private String userName;
	private String uPassword;

	public UserTable(String userName, String uPassword) {
		super();
		this.userName = userName;
		this.uPassword = uPassword;
	}

	public UserTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public Integer getUserId() {
		return userId;
	}
	
	
	
}
