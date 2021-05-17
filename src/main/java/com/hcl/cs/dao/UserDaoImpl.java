package com.hcl.cs.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.cs.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(User u) {
		sessionFactory.getCurrentSession().save(u);
	}

	@Override
	public boolean checkLogin(String userName, String password) {
		Query query=sessionFactory.getCurrentSession().createSQLQuery("select * from user where userName=? and password=?");
		query.setParameter(0, userName);
		query.setParameter(1, password);
		List l=query.list();
		boolean validate=false;
		if((l != null) && (l.size()>0)){
			validate=true;
		}
		else {
		     validate=false;
		}
		return validate;
		
		
	}

	@Override
	public boolean checkUserName(String userName) {
		Query query=sessionFactory.getCurrentSession().createSQLQuery("select * from user where userName=?");
		query.setParameter(0, userName);
		List l1=query.list();
		boolean checkUserName;
		if((l1 != null) && (l1.size()>0)){
			checkUserName=true;
		}
		else {
		     checkUserName=false;
		}
		return checkUserName;
	}

	@Override
	public Integer fetchUserId(String userName) {
        Query query=sessionFactory.getCurrentSession().createQuery("select u from User u where userName=?");
		query.setParameter(0, userName);
		User u1=(User)query.uniqueResult();
		Integer id1=u1.getUserId();
		return id1;
	}


}