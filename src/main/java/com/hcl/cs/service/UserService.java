package com.hcl.cs.service;

import com.hcl.cs.model.User;

public interface UserService {
	public void saveUser(User u) ;

	public boolean checkLogin(String uname,String pass);

	public boolean checkUserName(String userName);

	public Integer getUserId(String userName);

	
		
	
	}
		
	


