package com.deloitte.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.springmvc.dao.LoginDAO;
import com.deloitte.springmvc.model.User;
import com.deloitte.springmvc.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	
	@Override
	@Transactional(readOnly=true)
	public User getUserDetails(String userName) {
		return loginDAO.getUserDetails(userName);
	}

}
