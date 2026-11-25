package com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Student_DAO;
import com.model.Students;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student_DAO bean = ctx.getBean("student_DAO",Student_DAO.class);
	//	bean.saveStudent(new Students(2,"hari",28,100));
		System.out.println("Inserted");
		Students s = bean.getStudent(2);
		System.out.println(s);
	}
	

}
