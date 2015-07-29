package com.deloitte.springmvc.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.deloitte.springmvc.dao.BaseDAO;
import com.deloitte.springmvc.dao.LoginDAO;
import com.deloitte.springmvc.model.User;

@Repository
public class LoginDAOImpl extends BaseDAO implements LoginDAO {

	@Override
	public User getUserDetails(String userName) {
		Query query = getSession().createQuery("from User where emailId= :emailId");
		query.setString("emailId", userName);
		User user = (User)query.uniqueResult();
		return user;
	}

}
