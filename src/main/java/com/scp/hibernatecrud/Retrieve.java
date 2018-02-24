package com.scp.hibernatecrud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Retrieve
{
	public static void main(String[] args)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query query = session.createQuery("from Student");
        List<Student> students = query.list();
        
        for(Student student : students)
        {
        	System.out.println(student);
        	/*System.out.println("Id: " + student.getId());
        	System.out.println("Id: " + student.getStudentName());
        	System.out.println("Id: " + student.getCourse());*/
        }
        
        
        session.getTransaction().commit();
        HibernateUtil.closeSessionFactory();
		
	}

}
