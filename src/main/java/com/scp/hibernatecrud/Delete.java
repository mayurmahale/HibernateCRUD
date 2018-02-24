package com.scp.hibernatecrud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Delete
{
	public static void main(String[] args)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Student student = (Student)session.load(Student.class, 1);
        session.delete(student);
        
        session.getTransaction().commit();
        System.out.println("Record deleted from database....");
        
        Query query = session.createQuery("from Student");
        List<Student> students = query.list();
        
        for(Student student1 : students)
        {
        	System.out.println(student1);
        	/*System.out.println("Id: " + student.getId());
        	System.out.println("Id: " + student.getStudentName());
        	System.out.println("Id: " + student.getCourse());*/
        }
        
        HibernateUtil.closeSessionFactory();
		
	}

}
