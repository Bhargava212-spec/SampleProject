package com.hcl.cs.dao;

import com.hcl.cs.model.User;

public interface UserDao {
	
	public  void saveUser(User ul);
	public boolean checkLogin(String userName, String password);
	public boolean checkUserName(String userName);
	public Integer fetchUserId(String userName);
	

	
		
	

}
