package com.tut.Project1WithHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Student1 stu=(Student1)session.load(Student1.class, 101);
		System.out.println("Student-->"+stu);
		session.close();
		factory.close();
		
	}

}
