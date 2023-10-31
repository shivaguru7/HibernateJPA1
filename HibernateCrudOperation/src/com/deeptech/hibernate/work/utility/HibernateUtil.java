package com.deeptech.hibernate.work.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	
	
	private static SessionFactory sessionfactory;
	
	static
	{
		sessionfactory = new Configuration().configure().buildSessionFactory(); // Connection String JPA - database
	}
	
	public static SessionFactory connection()
	{
		return sessionfactory;
	}

}
