package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Students;

@Component
@Transactional
public class Student_DAO {

	@Autowired
	SessionFactory sessionFactory;

	public Students getStudent(int id) {

		Session session = getSession();
		Students student = session.find(Students.class, id);
		return student;
	}

	public Session getSession() {

		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	public void saveStudent(Students student)
	{
		Session session = getSession();
		session.persist(student);
		
	}
	

}



















