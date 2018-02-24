package com.scp.hibernatecrud;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student implements Serializable 
{


 private static final long serialVersionUID = 1L;
 
 
 @Id
 @Column(name="ID")
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 
 @Column(name="STUDENT_NAME")
 private String studentName;
 
 @Column(name="COURSE")
 private String course;
 
 
 
 public Student()
 {
	super();
}
 
 

public Student(String studentName, String course)
{
	super();
	this.studentName = studentName;
	this.course = course;
}



public int getId()
 {
  return id;
 }
 
 public void setId(int id)
 {
  this.id = id;
 }
 
 public String getStudentName()
 {
  return studentName;
 }
 
 public void setStudentName(String studentName)
 {
  this.studentName = studentName;
 }
 
 public String getCourse()
 {
  return course;
 }
 
 public void setCourse(String course)
 {
  this.course = course;
 }



@Override
public String toString() {
	return "\nStudent [id=" + id + ", studentName=" + studentName + ", course=" + course + "]";
}

 
 
 
}