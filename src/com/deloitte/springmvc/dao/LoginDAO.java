package com.deloitte.springmvc.dao;

import com.deloitte.springmvc.model.User;

public interface LoginDAO {

	public User getUserDetails(String userName);
}
