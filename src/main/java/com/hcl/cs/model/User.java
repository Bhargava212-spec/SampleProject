package com.hcl.cs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	@NotEmpty(message=" Name Cant be Empty ")
	private String userName;
	private String password;
	private String confirmpassword;
	public int getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public User(Integer userId, String userName, String password, String confirmpassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
