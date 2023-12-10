package com.hexaware.Mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.Mappings.Entity.Doctor;
import com.hexaware.Mappings.Entity.Patient;

/**
 * Hello world!
 *
 */
public class OneToOneTest {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		   Doctor doctor= new Doctor(1101,"Karthikeya",'M',"MBBS", "Dermatologist","Karthik","Karthik@1234");
		  Patient patient= new Patient(111,"Rajeev","Raj@123","fever",doctor);
		  
		  
		  
		  session.persist(doctor);
		 

		

		tx.commit();

	}
}
