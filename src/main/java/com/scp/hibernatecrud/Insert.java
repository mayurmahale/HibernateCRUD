package com.scp.hibernatecrud;

import org.hibernate.Session;


public class Insert
{
	public static void main(String[] args)
	{
		Student student1 = new Student("Ramesh", "MCA");
		Student student2 = new Student("Mahesh", "Mechanical");
		Student student3 = new Student("Suresh", "IT");
		Student student4 = new Student("Rajesh", "Computer");
		Student student5 = new Student("Ganesh", "MCA");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(student4);
        session.save(student5);
        
        session.getTransaction().commit();
        System.out.println("Records inserted into database....");
        
        HibernateUtil.closeSessionFactory();
		
	}

}
