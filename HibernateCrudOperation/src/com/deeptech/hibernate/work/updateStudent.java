package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Student;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class updateStudent {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		
		Student s = ses.get(Student.class, 1);
		s.setStudentName("Mubarak");
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		System.out.println("Update Success");
		

	}

}
