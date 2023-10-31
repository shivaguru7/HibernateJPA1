package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Student;
import com.deeptech.hibernate.work.utility.HibernateUtil;
public class createStudent {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setStudentName("Archana");
		s.setRollNumber(123);
		s.setCourse("java");

		// Calling Hibernate Util java class 
		SessionFactory sf = HibernateUtil.connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.save(s);
		System.out.println("Table Created Success and Record insert success");
		ses.close();
		sf.close();
		
	}

}
