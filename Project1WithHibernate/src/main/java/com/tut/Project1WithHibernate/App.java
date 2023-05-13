package com.tut.Project1WithHibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "new Barnach changes Project started---" );
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Student1 s2=new Student1();
        Student1 st=new Student1();
        st.setId(103);
        st.setName("Chhavi");
        st.setCity("Pundari");
        System.out.println("Student1---> "+st);
        System.out.println("try to merge new branch in git repository");
        address ad=new address();
        ad.setStreet("street1");
        ad.setCity("Delhi");
        ad.setIsopen(true);
        ad.setAddedDate(new Date());
        ad.setX(2345.45);
        
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        
        session.close();
    }
}
