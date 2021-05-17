package com.hcl.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.cs.dao.UserDao;
import com.hcl.cs.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
public void saveUser(User u) {
	userDao.saveUser(u);
}

	@Override
	public boolean checkLogin(String uname,String pass) {
		boolean v=userDao.checkLogin(uname,pass);
		return v;
	}

	@Override
	public boolean checkUserName(String userName) {
		boolean existUser=userDao.checkUserName(userName);
		return existUser;
	}

	@Override
	public Integer getUserId(String userName) {
		Integer id=userDao.fetchUserId(userName);
		return id;
		
	}

	


}
