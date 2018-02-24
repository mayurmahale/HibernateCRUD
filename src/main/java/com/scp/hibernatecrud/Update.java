package com.scp.hibernatecrud;

import org.hibernate.Session;

public class Update
{
	public static void main(String[] args)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Student student = (Student)session.get(Student.class, 4);
        student.setStudentName("Dinesh");
        
        session.getTransaction().commit();
        System.out.println("Record updated in database....");
        
        Student student1 = (Student)session.get(Student.class, 4);
        System.out.println(student1);
        
        
        HibernateUtil.closeSessionFactory();
	}

}
