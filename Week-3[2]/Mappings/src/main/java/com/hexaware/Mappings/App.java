package com.hexaware.Mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.Mappings.Entity.Address;
import com.hexaware.Mappings.Entity.Student;

/**
 * Hello world!
 *
 */
public class App{
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		
		 // Address address = new Address(512,"Hyd","Telangana");
		  Address address= new Address(513,"Mys","Banglore");
		  
		 // Student student = new Student(102,"Javeed",address);
		  Student student = new Student(103,"Sireesha",address);
		  session.persist(student);
		 

		/*
		 * Student student = new Student(103, "Ashwin");
		 * 
		 * Address address = new Address(54, "Banglore", "KA", student);
		 * 
		 * session.persist(address);
		 */

		tx.commit();

	}
}
