package com.tut.Project1WithHibernate;

import javax.security.cert.CertificateEncodingException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbClass {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		 Student1 st1=new Student1();
		 st1.setCity("Lucknow");
		 st1.setId(107);
		 st1.setName("vibhu");
		 
		 Certificate ct=new Certificate();
		 ct.setCourse("Java");
		 ct.setDuration("4 month");
		 st1.setCerti(ct);
		 
		 Transaction tx=session.beginTransaction();
		 session.save(st1);
		 tx.commit();
		 
		session.close(); 
		 
		
		
	}

}
