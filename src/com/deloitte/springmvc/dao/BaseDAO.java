package com.deloitte.springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
}
